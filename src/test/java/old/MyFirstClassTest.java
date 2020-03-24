package old;

import old.MyFirstClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyFirstClassTest {
    @Test
    public void testDeMain() {
        String bericht = MyFirstClass.geefBericht();
        Assertions.assertEquals("Hello World!", bericht);
    }
}