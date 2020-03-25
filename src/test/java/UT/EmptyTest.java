package UT;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class EmptyTest {


    @Test
    void groupAssertions() {
        int[] numbers = {0, 1, 2, 3, 4};
        assertAll("numbers",
                () -> assertEquals(numbers[0], 0),
                () -> assertEquals(numbers[3], 3),
                () -> assertEquals(numbers[4], 4)
        );
    }

    /*Assumptions: gebruikt om condities te testen, meestal van externe factoren
    * die van belang zijn voor het runnen van de test, maar niet wat je uiteindelijk
    * wilt testen. Test wordt geskipt als assumption false is. */

    @DisplayName("Single test succesfull")
    @Test
    void trueAssumption() {
        assumeTrue(5 > 6);
        assertEquals(5 + 2, 7);
    }

}