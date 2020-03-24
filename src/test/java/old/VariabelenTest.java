package old;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VariabelenTest {
    @Test

    public void rekenenMetGeheleGetallen() {
        int aantalReizigersInDeTrein; // variable declareren
        aantalReizigersInDeTrein = 4; // waarde toekennen aan variabele

        short reizigersPerBak = 25;
        byte aantalPersoneelsLedenPerTrein = 3;

        aantalReizigersInDeTrein = 4 * reizigersPerBak + aantalPersoneelsLedenPerTrein;

        System.out.println("Het aantal reizigers is: " + aantalReizigersInDeTrein); // string concatenatie

        int maxValue = Integer.MAX_VALUE; // geeft maximaal waarde van integer
        int minValue = Integer.MIN_VALUE;

        System.out.println(maxValue);
        System.out.println(minValue);

        long CoronaBeestjesPerReiziger = 200_000_000_000L; // underscores kan vanaf Java 8
        long aantalCoronaBeestjesPerTrein =  CoronaBeestjesPerReiziger * aantalReizigersInDeTrein;

        assertEquals(103, aantalReizigersInDeTrein);
        assertEquals(200_000_000_000L * aantalReizigersInDeTrein, aantalCoronaBeestjesPerTrein);
    }

    @Test
    void rekenenMetGebrokenGetallen() {
        double gemaakteKostenMaaltijd = 23.45F;
        int aantalMeeeters = 4;
        double pp = gemaakteKostenMaaltijd / aantalMeeeters;

        boolean voorwaarde = pp > 0;

        if (voorwaarde) {
            System.out.println(pp);
        } else {
            System.out.println("Bedrag pp mag niet negatief zijn.");
        }
    }
}

