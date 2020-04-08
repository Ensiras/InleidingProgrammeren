package h9.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    String name;
    private List<BankAccount> BankAccounts = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public Bank(String name, BankAccount... accounts) {
        this.name = name;
        for (BankAccount Account : accounts) {
            addAccount(Account);
        }
    }

    public void addAccount(BankAccount ac) {
        BankAccounts.add(ac);
    }

    public void transfer(BankAccount from, BankAccount to, double amount) {
        try {
            from.withdraw(amount);
            to.deposit(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Transaction terminated: " + e.getMessage());
        }
    }

    public double totalAmount() {
        double sum = 0;
        for (BankAccount ac : BankAccounts) {
            sum += ac.getBalance().doubleValue();
        }
        return sum;
    }

    public void printAccounts() {
        for (BankAccount ac : BankAccounts) {
            double interest = ac.calculateInterest();
            System.out.println("Account: " + ac.getNumber() + ". Interest this year: " + ac.calculateInterest());
        }
    }

    @Override
    public String toString() {
        double totalBalance = totalAmount();
        return "Bank name: " + this.name + " | Total number of accounts: " + BankAccounts.size() + " | Total balance in accounts: " + totalBalance;

    }
}
