package h5;

import java.util.Arrays;

public class Lab5Methods {

    public static void main(String[] args) {

        //greatest(45, 304, 1003, 25, 3, 1);
        int som = factorial(5);
    }

    public static int greatest(int getal1, int getal2) {
        // Had ook met ternary operator gekund, of met Math.max(getal1, getal2);
        if (getal1 > getal2) {
            return getal1;
        } else if (getal1 < getal2) {
            return getal2;
        } else {
            // Dit had niet gehoeven, ik had ook if getal1 >= getal2, return getal 1;
            System.out.println("Beide getallen zijn gelijk aan elkaar.");
            return getal1;
        }
    }

    public static String greatest(String tekst1, String tekst2) {
        int tekst1Lengte = tekst1.length();
        int tekst2Lengte = tekst2.length();

        if (tekst1Lengte > tekst2Lengte) {
            return tekst1;
        } else if (tekst1Lengte < tekst2Lengte) {
            return tekst2;
        } else {
            System.out.println("Beide strings zijn even lang.");
            return tekst1;
        }

    }

    public static int greatest(int... getallen) {
        int[] getallenLijst = getallen;
        Arrays.sort(getallenLijst);
        int hoogsteGetal = getallenLijst[getallenLijst.length - 1];
        return hoogsteGetal;

        // of: for (int i : lijstje) { if (i > max) { max = 1; } } return max;
    }

    /* Waarom werkt dit?
    Stel je roept factorial(3) aan. Eerst wordt gecheckt of
    n kleiner of gelijk aan 1 is, dit is niet het geval dus
    wordt else uitgevoerd. Er wordt een berekening gedaan
    van n * opnieuw de functie (factorial(n-1). Dus 3*2,
    dan wordt weer gekeken: is n <= 1, nee want n = 2. Dus
    weer wordt de else uitgevoerd. Dit keer is het 2 *
    factorial(2-1). Dus weer wordt de functie uitgevoerd.
    Dit keer is n wel <= 1, dus de if wordt uigevoerd.
    Een 1 wordt teruggegeven en de functie wordt niet
    opnieuw uitgevoerd. De totale berekening komt dus
    neer op 1*2*3 of 3*(2*1). Deze uitkomst wordt gereturned.
     */
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
