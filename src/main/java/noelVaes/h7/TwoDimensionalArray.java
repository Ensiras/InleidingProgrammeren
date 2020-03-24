package noelVaes.h7;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        printArray();

    }

    public static void printArray() {
        int[][] numberArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] ints : numberArray) {
            int i = 0;
            for (int anInt : ints) {
                System.out.println(anInt);
                ints[i] = 45;
                i++;
            }
        }
    }
}
