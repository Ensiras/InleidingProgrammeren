package h6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LabsTest {

    private Labs lab;

    @BeforeEach
    public void initObjects() {
        lab = new Labs();
    }

    @Test
    public void sum10Numbers() {
        int[] testNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10};
        int result = lab.sum10Numbers(testNumbers);
        assertEquals(55, result);
    }
}