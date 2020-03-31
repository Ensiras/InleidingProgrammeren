package h11.lab;

import java.util.ArrayList;

public class BankInnerClasses {

    static BankInnerClasses bank_instance = null;
    private long accountNumberIndex = 0;
    public enum AccountType { SAVINGS, CHECKING}
    private ArrayList<BankAccountInner> accountCollection = new ArrayList<>();

    private BankInnerClasses() {
        System.out.println("New bank instance created.");
    }

    public static BankInnerClasses getInstance() {
        if (bank_instance == null) {
            bank_instance = new BankInnerClasses();
            return bank_instance;
        } else {
            throw new RuntimeException("Only one bank instance may exist at any time");
        }
    }

    public BankAccountInner createAccount(Bank.AccountType accountType) {
        switch (accountType) {
            case SAVINGS:
                return new SavingsAccountInner(this.accountNumberIndex++);
            case CHECKING:
                return new CheckingAccountInner(this.accountNumberIndex++);
            default:
                throw new RuntimeException("Account type not recognized.");
        }
    }

    public void addAccount(BankAccountInner a) {
        this.accountCollection.add(a);
    }

    public BankAccountInner getAccount(long ID) {
        for (BankAccountInner bankAccount : accountCollection) {
            if (bankAccount.getAccountNumber() == ID) {
                return bankAccount;
            }
        }
        throw new IllegalArgumentException("Bank account not found, please try again.");
    }

    public void transfer(long fromID, long toID, int amount) {
        BankAccountInner from = getAccount(fromID);
        BankAccountInner to = getAccount(toID);
        if (from.equals(to)) {
            throw new RuntimeException("Cannot transfer money to the same account.");
        } else {
            from.withdraw(amount);
            to.deposit(amount);
        }
    }


    abstract class BankAccountInner {
        private long accountNumber;
        private long balance;

        public BankAccountInner(long accountNumber) {
            setAccountNumber(accountNumber);
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
                throw new IllegalArgumentException("Negative balance not allowed.");
            } else {
                this.balance = amount;
            }
        }

        public void withdraw(int amount) {
                setBalance(this.balance - amount);
                System.out.println("Withdrawal successful new balance: " + this.balance);
        }

        public void deposit(int amount) {
            setBalance(this.balance + amount);
            System.out.println("Deposit successful new balance: " + this.balance);
        }
    }

    private class CheckingAccountInner extends BankAccountInner {

        private CheckingAccountInner(long accountNumber) {
            super(accountNumber);
        }
    }

    private class SavingsAccountInner extends BankAccountInner {
        private SavingsAccountInner(long accountNumber) {
            super(accountNumber);
        }
    }
}
