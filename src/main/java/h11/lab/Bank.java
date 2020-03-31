package h11.lab;

import java.util.ArrayList;

public class Bank {

    private static Bank bank_instance = null;
    private long accountNumberIndex = 0;
    public enum AccountType {
        SAVINGS, CHECKING
    }
    private ArrayList<BankAccount> accountCollection = new ArrayList<>();

    private Bank() {
        System.out.println("New bank instance created.");
    }

    public static Bank getInstance() {
        if (bank_instance == null) {
            bank_instance = new Bank();
            return bank_instance;
        } else {
            throw new RuntimeException("Only one bank instance may exist at any time");
        }
    }

    public void addAccount(AccountType accountType) {
        BankAccount accountToAdd = createAccount(accountType);
        accountCollection.add(accountToAdd);
    }

    public void transferMoney(long fromID, long toID, int amount) {
        BankAccount from = getAccount(fromID);
        BankAccount to = getAccount(toID);
        if (from.equals(to)) {
            throw new RuntimeException("Cannot transfer money to the same account.");
        } else {
            from.withdraw(amount);
            to.deposit(amount);
        }
    }

    public void makeDeposit(long ID, int amount) {
        BankAccount depositTo = getAccount(ID);
        depositTo.deposit(amount);
    }

    private BankAccount getAccount(long ID) {
        for (BankAccount bankAccount : accountCollection) {
            if (bankAccount.getAccountNumber() == ID) {
                return bankAccount;
            }
        }
        throw new RuntimeException("Bank account not found, please try again.");
    }

    private BankAccount createAccount(AccountType accountType) {
        this.accountNumberIndex++;
        switch (accountType) {
            case SAVINGS:
                return SavingsAccount.createAccount(this.accountNumberIndex);
            case CHECKING:
                return CheckingAccount.createAccount(this.accountNumberIndex);
            default:
                throw new RuntimeException("Account type not recognized.");
        }
    }


    public void printAccounts() {
        for (BankAccount bankAccount : accountCollection) {
            System.out.println(bankAccount.toString());
        }

    }
}
