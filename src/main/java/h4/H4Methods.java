package h4;

public class H4Methods {

    // implementeren: exceptions en user input.

    public static String determineSeason(Seasons inputSeason) {
        String result;
        switch (inputSeason) {
            case SPRING:
            case SUMMER:
                System.out.println("Warm");
                return result = "Warm";
            case AUTUMN:
            case WINTER:
                System.out.println("Cold");
                return result = "Cold";
            default:
                System.out.println("Unknown");
                return result = "Unknown";
        }
    }

    public static void drawHourglass(int dimensions) {

        if (dimensions % 2 == 0) {
            throw new EvenNumberException();
        }
        String firstAndLastLine = "";
        int lineNumber;
        int leftSpaces;
        int centerSpaces;
        String nextLine ="";

        // Concatenate first and last line, determined by dimensions
        for (int i = 0; i < dimensions; i++) {
            firstAndLastLine += "*";
        }
        System.out.println(firstAndLastLine);

        lineNumber = 2;

        /* As long as the middle of the hourglass
        * has not been reached*/
        while ((dimensions - lineNumber) >= lineNumber) {
            // Calculate amount of left and center spaces on a line
            leftSpaces = lineNumber - 1;
            centerSpaces = dimensions - 2 * lineNumber;

            // Reset nextLine;
            nextLine = "";

            // Add left spaces to nextLine string.
            for (int i = 0; i < leftSpaces; i++) {
                nextLine += " ";
            }

            // Add first star, right amount of center spaces and left star
            // to nextLine string.
            nextLine += "*";

            while (centerSpaces > 0) {
                nextLine += " ";
                centerSpaces--;
            }

            nextLine += "*";

            System.out.println(nextLine);
            lineNumber++;
        }
        // Middle of the hourglass is reached.
        nextLine = "";
        leftSpaces = lineNumber - 1;
        for (int i = 0; i < leftSpaces; i++) {
            nextLine += " ";
        }
        nextLine += "*";
        System.out.println(nextLine);
        lineNumber++;

        while ((dimensions - lineNumber) >= 1) {
            // Calculate amount of left and center spaces on a line
            leftSpaces = dimensions - lineNumber;
            centerSpaces = lineNumber * 2 - dimensions - 2;

            // Reset nextLine;
            nextLine = "";

            // Add right spaces to nextLine string.
            for (int i = 0; i < leftSpaces; i++) {
                nextLine += " ";
            }

            // Add first star, right amount of center spaces and left star
            // to nextLine string.
            nextLine += "*";

            while (centerSpaces > 0) {
                nextLine += " ";
                centerSpaces--;
            }

            nextLine += "*";

            System.out.println(nextLine);
            lineNumber++;
        }

        System.out.println(firstAndLastLine);
    }


}



