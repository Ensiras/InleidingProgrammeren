package mocking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MockingInvoerTest {

    /* Maak een gemockte ScannerWrapper van de class, later te gebruiken
    * bij de when in de test. Mock() is onderdeel van Mockito */
    ScannerWrapper scannerMock = mock(ScannerWrapper.class);
    MockingInvoer target = new MockingInvoer();

    @BeforeEach
    void init() {
        /* Gebruik maken van de setScanner methode om de waarde van het
        * 'scanner' veld naar de gemockte ScannerWrapper te zetten*/
        target.setScanner(scannerMock);
    }

    @Test
    void testRun() {

        /* Als op de gemockte scanner de methode getNextLine wordt aangeroepen
        * geef dan 123 terug. Zowel when() als thenReturn() zijn onderdeel van
        * Mockito */
        when(scannerMock.getNextLine()).thenReturn("123");


        int abc = target.run();
        assertEquals(3, abc);

    }
}