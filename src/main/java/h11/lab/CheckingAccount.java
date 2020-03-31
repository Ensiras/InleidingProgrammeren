package h11.lab;

public class CheckingAccount extends BankAccount {
    private CheckingAccount(long accountNumber, long balance) {
        super(accountNumber, balance);
    }

    private CheckingAccount(long accountNumber) {
        super(accountNumber, 0);
    }


    public static CheckingAccount createAccount(long accountNumber) {
        return new CheckingAccount(accountNumber);
    }

    @Override
    public String toString() {
        return String.format("Account: %s Balance: %d", getAccountNumber(), getBalance());
    }
}
