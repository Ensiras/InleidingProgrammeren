package h11.lab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static h11.lab.Bank.AccountType.CHECKING;
import static h11.lab.Bank.AccountType.SAVINGS;
import static org.junit.Assert.assertThrows;

class BankTest {

    Bank ING;

    @BeforeEach
    void initTest() {
        ING = Bank.getInstance();
        ING.addAccount(SAVINGS);
        ING.addAccount(CHECKING);
        ING.makeDeposit(1, 200);
        ING.makeDeposit(2, 100);
    }

    @Test
    void transferMoney() {
        ING.transferMoney(1, 2, 200);
    }

    @Test
    void whenSecondBankCreatedExceptionIsThrown() {
        assertThrows(RuntimeException.class, () -> Bank.getInstance());
    }
}