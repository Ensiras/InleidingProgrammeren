package h9.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountInnerTest {

    private Bank ING;
    private BankAccount ac1;
    private BankAccount ac2;

    @BeforeEach
    public void initObjects() {
        ING = new Bank("ING");
        ac1 = new BankAccount("NL94INGB0001234567", BigDecimal.valueOf(500.00d), 0.05d);
        ac2 = new BankAccount("NL94INGB0007654321", BigDecimal.valueOf(200.00d), 0.10d);

        ING.addAccount(ac1);
        ING.addAccount(ac2);
    }

    @Test
    public void transferWillSucceed() {
        ING.transfer(ac1, ac2, 400);
        assertEquals(100.0d, ac1.getBalance().doubleValue());
    }

    @Test
    public void withdrawWillFail() {
        /*Waarom moet ik hier withdraw en niet transfer testen? Omdat bij transfer() de exception al afgevangen wordt.
        Maar de withdraw() methode gooit de exception, dus daarom moet ik testen of het bij de withdraw goed gaat.
        * */
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> ac1.withdraw(700));
    }

    @Test
    void deposit700ToBalance() {
        ac1.deposit(200);
        assertTrue(ac1.getBalance().intValue() == 700);
    }

    @Test
    void calculateInterestResultIs25() {
        double interest = ac1.calculateInterest();
        assertTrue(interest == 25);
    }
}