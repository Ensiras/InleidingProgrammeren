package old;

public class TypeSystem {


    public static void main(String args[]) {
        //optellenVoorOfNa();
        // bepaalUitkomstJ();
        // optellenBinair();
       // berekenTijd();
    }

    public static int[] optellenVoorOfNa() {
        int i  = 1;
        System.out.println("i voor optellen: " + i);
        int j = i++; // geef waarde i aan j, tel dan 1 bij i op
        int k = ++i; // tel 1 op bij i en geef die waarde aan k
        System.out.println("j: " +j);
        System.out.println("k: " +k);
        System.out.println("i na optellen: " + i);
        int[] optelArray = {i, j, k};
        return optelArray;
    }

    /*
    i++ = 1 (maar i heeft nu waarde 2)
    ++i = 3 (i was eerder 2 + 1)
    3 + 1 = 4

    >>> bitwise shift: bitjes worden (in dit geval) 1 positie naar rechts geplaatst.
    Links wordt met 0 aangevuld.
     */

    public static int bepaalUitkomstJ() {
        int i = 3;
        int j = i < 3 ? i++ + ++i : ++i >>> 1;
        System.out.println("J is: " + j);
        return j;
    }

    public static byte optellenBinair() {
        byte som = 0b1010 + 0b100;
        System.out.println(som);
        return som;
    }

    public static int berekenTijd() {
        int beginTijd = 23;
        int eindTijd = (beginTijd + 5) % 24;
        System.out.println("Vijf uur na 23 u is het: " + eindTijd + " uur.");
        return eindTijd;
    }

    
}
