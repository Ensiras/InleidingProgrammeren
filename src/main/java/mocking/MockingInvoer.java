package mocking;

public class MockingInvoer {


    /* Veldje met daarin een nieuwe ScannerWrapper. Dit zodat je de
    * methode getNextLine kan aanroepen vanuit de methode run() */
    ScannerWrapper scanner = new ScannerWrapper();

    public int run() {
        String input = scanner.getNextLine();

        int lengte = bepaalLengte(input);

        return lengte;
    }

    private int bepaalLengte(String input) {
        return input.length();
    }

    /* Deze functie is nodig zodat je in de test de waarde van
    * het veldje scanner naar de gemockte ScannerWrapper kan veranderen*/
    public void setScanner(ScannerWrapper scanner) {
        this.scanner = scanner;
    }

}
