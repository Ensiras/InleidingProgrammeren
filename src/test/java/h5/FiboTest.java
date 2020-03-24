package h5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FiboTest {

    @Test
    void run() {
        long lastNumber1 = Fibo.run(6);
        long lastNumber2 = Fibo.run(4, 6);
        long lastNumber3 = Fibo.run(4, 5, 6);

        Assertions.assertEquals(8, lastNumber1);
        Assertions.assertEquals(32, lastNumber2);
        Assertions.assertEquals(37, lastNumber3);

    }

    @Test
    void goldenRatio() {
        for (int i = 0; i < 93; i++) {
            Fibo.goldenRatio(i);
        }
    }
    // kan ook: if (gr > 1.7d || gr < 1.6d) in een loop zetten en dan for loop 10000 keer uit laten voeren.
    @Test
    void testRun() {
        for (int i = 0; i < 94; i++) {
            Fibo.runFloat(i);
        }
    }
}