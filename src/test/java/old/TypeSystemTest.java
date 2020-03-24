package old;

import old.TypeSystem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TypeSystemTest {
    @Test
    public void TestUitkomstJ() {
        int j = TypeSystem.bepaalUitkomstJ();
        assertEquals(2, j);
    }

   @Test
    public void TestOptellenVoorOfNa() {
        int optelArray[] = TypeSystem.optellenVoorOfNa();
        assertEquals(3, optelArray[0]);
        assertEquals(1, optelArray[1]);
        assertEquals(3, optelArray[2]);
    }

    @Test
    public void TestOptellenBinair() {
        byte uitkomst = TypeSystem.optellenBinair();
        assertEquals(14, uitkomst);
    }

    @Test
    public void TestBerekenTijd() {
        int eindTijd = TypeSystem.berekenTijd();
        assertEquals(4, eindTijd);
    }
}