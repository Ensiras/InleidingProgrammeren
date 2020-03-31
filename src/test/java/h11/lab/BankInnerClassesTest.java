package h11.lab;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static h11.lab.Bank.AccountType.*;
import static org.assertj.core.api.Assertions.*;

class BankInnerClassesTest {
    BankInnerClasses b;
    BankInnerClasses.BankAccountInner account1;
    BankInnerClasses.BankAccountInner account2;

    @BeforeEach
    void setUp() {
        b = BankInnerClasses.getInstance();
        account1 = b.createAccount(SAVINGS);
        account2 = b.createAccount(CHECKING);
        b.addAccount(account1);
        b.addAccount(account2);
        account1.deposit(300);
        account2.deposit(100);
    }

    @AfterEach
    void afterEach() {
        BankInnerClasses.bank_instance = null;
        System.out.println("Bank destroyed.");
    }

    @Test
    void transferFromSavingsToCheckingSuccess() {
        b.transfer(0, 1, 100);
        long resultS = account1.getBalance();
        long resultC = account2.getBalance();

        assertThat(resultS).isEqualTo(200);
        assertThat(resultC).isEqualTo(200);
    }

    @Test
    void whenBalanceTooLowTransferFromSavingstoCheckingFails() {
        Throwable thrown = catchThrowable(() -> b.transfer(0, 1, 400));
        assertThat(thrown).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Negative balance not allowed.");
        assertThat(account1.getBalance()).isEqualTo(300);
    }

    @Test
    void whenToAndFromAccountAreTheSameTransferFails() {
        assertThatExceptionOfType(RuntimeException.class)
                .isThrownBy(() -> b.transfer(1, 1, 400))
                .withMessage("Cannot transfer money to the same account.");
    }

    @Test
    void whenCreatingSecondBankRuntimeExceptionIsThrown() {
        assertThatExceptionOfType(RuntimeException.class)
                .isThrownBy(BankInnerClasses::getInstance)
                .withMessage("Only one bank instance may exist at any time");
    }

    @Test
    void whenCorrectIDIsGivenGetAccountShouldSucceed() {
        BankInnerClasses.BankAccountInner account3 = b.getAccount(1);
        assertThat(account3)
                .isNotNull()
                .isInstanceOf(BankInnerClasses.BankAccountInner.class);
    }

    @Test
    void whenNonExistingIDIsGivenGetAccountThrowsIllegalArgumentException() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()-> b.getAccount(3))
                .withMessage("Bank account not found, please try again.");
    }


}
