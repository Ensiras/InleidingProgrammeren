package h4;

import java.util.Scanner;


public class ElevenProof {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        String number = userInput();
        checkLength(number);
        String valid = validateNumber(number);

    }

    private static String userInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Voer rekeningnummer in: ");
        return keyboard.nextLine();
    }

    public static void checkLength(String inputNumber) {
        if (inputNumber.length() != 9) {
            throw new IllegalArgumentException("Bank account number length should be 9.");
        }

    }

    public static String validateNumber(String inputNumber) {
        int sum = 0;
        for (int i = 1; i <= inputNumber.length(); i++) {
            String digit = inputNumber.substring(i - 1, i);
            sum += Integer.parseInt(digit) * (inputNumber.length() + 1 - i);
        }
        if (sum % 11 == 0) {
            System.out.println("Account number is valid.");
            return "Number valid.";
        } else {
            throw new IllegalArgumentException("Number is invalid!");
        }

    }
}



