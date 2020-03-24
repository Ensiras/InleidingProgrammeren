package h9.bank;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {


        BankAccount ac1 = new BankAccount("NL94INGB0001234567", BigDecimal.valueOf(500.00d), 0.05d);
        System.out.println(ac1);
        BankAccount ac2 = new BankAccount("NL94INGB0007654321", BigDecimal.valueOf(200.00d), 0.10d);
        System.out.println(ac2);

        System.out.println("");

        Bank ING = new Bank("ING", ac1, ac2);
        System.out.println(ING);

//        ING.printAccounts();
        //ING.transfer(ac1, ac2, 600);
//        double interest1 = ac1.calculateInterest();
//        double totalAmount = ING.totalAmount();



    }
}
