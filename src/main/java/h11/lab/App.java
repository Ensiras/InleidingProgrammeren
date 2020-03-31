package h11.lab;

import static h11.lab.Bank.AccountType.CHECKING;
import static h11.lab.Bank.AccountType.SAVINGS;

public class App {
    public static void main(String[] args) {

        try {
            Bank ING = Bank.getInstance();
            ING.addAccount(SAVINGS);
            ING.addAccount(CHECKING);
            ING.printAccounts();

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}
