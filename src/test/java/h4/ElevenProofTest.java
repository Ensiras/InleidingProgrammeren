package h4;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class ElevenProofTest {

    @Test
    public void checkLengthSuccess() {
        ElevenProof.checkLength("123456789");
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkLengthTooShort() {
        ElevenProof.checkLength("1234");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkLengthTooLong() {
        ElevenProof.checkLength("1234567890");
    }

    @Test
    public void validationWillPass() {
        String result = ElevenProof.validateNumber("123456789");
        assertEquals("Number valid.", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validationWillFail() {
        String result = ElevenProof.validateNumber("123406789");
    }
}

