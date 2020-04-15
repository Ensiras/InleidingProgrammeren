package noelVaes.h20Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static noelVaes.h20Collections.Coin.*;

// Sorted and unsorted maps, iterating through
public class MapApp {
    public static void main(String[] args) {
        Map<Coin, Integer> wallet = new HashMap<>();
        wallet.put(FIVE_CENT, 2);
        wallet.put(FIFTY_CENT, 4);
        wallet.put(ONE_EURO, 4);
        wallet.put(TWO_EURO, 2);

        Map<Coin, Integer> wallet2 = new LinkedHashMap<>();
        wallet2.put(ONE_EURO, 4);
        wallet2.put(FIFTY_CENT, 4);
        wallet2.put(TWO_EURO, 2);
        wallet2.put(FIVE_CENT, 2);

//        Printing, note 'random' order
        System.out.println("---------------------Printing HashMap---------------------");
        for (Coin coin : wallet.keySet()) {
            System.out.println(coin + ", amount: " + wallet.get(coin));
        }

//        Note order of insertion
        float sum = 0;
        System.out.println("---------------------Printing LinkedHashMap---------------------");
        for (Coin coin : wallet2.keySet()) {
            System.out.println(coin + ", amount: " + wallet2.get(coin));
            sum += coin.getValue() * wallet2.get(coin);
        }

        System.out.println("Total value of coins in wallet: " + sum);


//        Printing using lambda
//        wallet.forEach((k, v) -> System.out.println(k + ", amount: " + v));

    }
}
