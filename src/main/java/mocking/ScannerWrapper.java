package mocking;

import java.util.Scanner;

/* ScannerWrapper klasse is nodig omdat Scanner niet te mocken is, ofzo? */
public class ScannerWrapper {
    Scanner scanner = new Scanner(System.in);

    public String getNextLine() {
        return scanner.nextLine();
    }
}
