package h6;

import java.util.*;

public class Labs {

    public static void main(String[] args) {
        Labs lab = new Labs();

//        int[] resultArray = lab.save10Numbers();
//        int sumResult = lab.sum10Numbers(resultArray);
//        System.out.println(sumResult);
        lab.arrayWithRandomNumbers();

    }

    public int[] save10Numbers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] digits = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number: ");
            int input = Integer.parseInt(scanner.nextLine());
            digits[i] = input;
        }

        return digits;
    }

    public int sum10Numbers(int[] inputNumbers) {
        int sum = 0;
        for (int number : inputNumbers) {
            sum += number;
        }
        return sum;
    }

    public void arrayWithRandomNumbers() {
        Integer[] randNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> randNumberList = Arrays.asList(randNumbers);
        Collections.shuffle(randNumberList);
        randNumberList.toArray(randNumbers);
        int randNumbersIndex = 0;

        int[][] randSudoku = new int[3][3];

//        for (int[] number : randSudoku) {
//            for (int i = 0; i < randSudoku.length; i++) {
//                number[i] = randNumbers[randNumbersIndex];
//                randNumbersIndex++;
//            }
//        }
    }
}
