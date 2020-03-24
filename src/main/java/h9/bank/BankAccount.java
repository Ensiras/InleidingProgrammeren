package h9.bank;

import java.math.BigDecimal;

public class BankAccount {

   private String number;
   private BigDecimal balance;
   private double interestRate;

   public BankAccount(String number) {
       this(number, BigDecimal.valueOf(0.0), 0.0);
   }

    public BankAccount(String number, BigDecimal balance, double interestRate) {
        this.number = number;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public String getNumber() {
        return number;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public BigDecimal getBalance() {
        return balance;
    }



    public void withdraw(double amount) throws IllegalArgumentException {
        /*
        * BigDecimal.compareTo(<value>) returns -1 if the BigDecimal is less than <value>.s
        * Lees als: neem de value van de double <amount>, trek dit af van this.balance,
        * Vergelijk het resultaat met 0. Resultaat van vergelijking is -1 als het resultaat
        * van de eerdere berekening kleiner dan 0 is. Aangezien -1 kleiner dan 0 is, vuurt
        * de if: er is niet genoeg balance om de transfer uit te voeren. */

        if (this.balance.subtract(BigDecimal.valueOf(amount)).compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Insufficient funds for withdrawal");
        } else {
            this.balance = balance.subtract(BigDecimal.valueOf(amount));
        }
   }

   public void deposit(double amount) {
       this.balance = balance.add(BigDecimal.valueOf(amount));
   }

   public double calculateInterest() {
       double interest = this.balance.multiply(BigDecimal.valueOf(this.interestRate)).doubleValue();
       return interest;
   }

   @Override
   public String toString() {
       String accountNumber = this.number.substring(0, 4) + " " + this.number.substring(4, 8) + " " + this.number.substring(8, 12) + " " + this.number.substring(12, 16) + " " + this.number.substring(16);
       return "Account number: " + accountNumber + " | Balance: " + this.balance + " | Interest rate: " + this.interestRate;
   }

}
