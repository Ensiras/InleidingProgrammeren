package h4;

import org.junit.Test;


import static h4.Seasons.*;

import static org.junit.jupiter.api.Assertions.*;

public class H4MethodsTest {

    @Test
    public void determineSeason() {
        String result1 = H4Methods.determineSeason(SPRING);
        String result2 = H4Methods.determineSeason(SUMMER);
        String result3 = H4Methods.determineSeason(AUTUMN);
        String result4 = H4Methods.determineSeason(WINTER);
        String result5 = H4Methods.determineSeason(DRY);
        assertEquals("Warm", result1);
        assertEquals("Warm", result2);
        assertEquals("Cold", result3);
        assertEquals("Cold", result4);
        assertEquals("Unknown", result5);
    }

    @Test
    public void aNiceHourglassShouldAppear() {
        H4Methods.drawHourglass(7);
    }

    @Test(expected = EvenNumberException.class)
    public void evenNumbersWeDoNotWant() {
        H4Methods.drawHourglass(8);
    }
}