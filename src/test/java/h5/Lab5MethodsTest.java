package h5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab5MethodsTest {

    @Test
    void greatest() {
        int resultaat = Lab5Methods.greatest(10, 15);
        assertEquals(15, resultaat);
    }

    @Test
    void testGreatest() {
        String resultaat = Lab5Methods.greatest("Dit is een lange tekst", "Deze was korter, maar nu dus niet meer");
        assertEquals("Deze was korter, maar nu dus niet meer", resultaat);
    }

    @Test
    void testGreatest1() {
        int hoogGetal = Lab5Methods.greatest(34, 23, 105, 66, 77, 1000, 321);
        // kan ook gebruiken:
        assertEquals(1000, hoogGetal);
    }

    @Test
    void factorial() {
        int uitkomst = Lab5Methods.factorial(4);
        assertEquals(24, uitkomst);
    }
}