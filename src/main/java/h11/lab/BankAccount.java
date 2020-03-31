package h11.lab;

public abstract class BankAccount {
    private long accountNumber;
    private long balance;

    public BankAccount(long accountNumber, long balance) {
        setAccountNumber(accountNumber);
        setBalance(balance);
    }


    public long getBalance() {
        return balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(long amount) {
        if (amount < 0) {
            throw new RuntimeException("Negative balance not allowed.");
         } else {
            this.balance = amount;
        }
    }

    public void withdraw(int amount) {
        try {
            setBalance(this.balance - amount);
            System.out.println("Withdrawal successful new balance: " + this.balance);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deposit(int amount) {
        setBalance(this.balance + amount);
        System.out.println("Deposit successful new balance: " + this.balance);
    }
}
