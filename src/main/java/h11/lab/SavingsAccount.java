package h11.lab;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    private SavingsAccount(long accountNumber, long balance, double interestRate) {
        super(accountNumber, balance);
        setInterestRate(interestRate);
    }

    private SavingsAccount(long accountNumber) {
        super(accountNumber, 0);
        setInterestRate(0.0);
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return String.format("Account: %s Balance: %d Interest rate: %.2f", getAccountNumber(), getBalance(), this.interestRate);
    }


    public static SavingsAccount createAccount(long accountNumber) {
        return new SavingsAccount(accountNumber);
    }
}
