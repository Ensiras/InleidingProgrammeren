package h6;

public class Homework {

    public static void main(String[] args) {
        Homework hw = new Homework();
        long[] smallArray = {1, 2, 3, 4};

        hw.copyAndEnlargeArray(smallArray);
        hw.multiplyArrayElements(smallArray, 10);

        long[] fiboResult = hw.run(30);
        hw.printFiboArray(fiboResult);
    }

    public void incrementArray() {
        long[] row = new long[4];
        row[2] = 3;
        long[] copy = row;
        copy[2]++;
    }

    public void copyAndEnlargeArray(long[] inputArray) {
        long[] enlargedArray = new long[8];
        for (int i = 0; i < inputArray.length; i++) {
            enlargedArray[i] = inputArray[i];
        }
    }

    public void multiplyArrayElements(long[] inputArray, int multiplier) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] *= multiplier;
        }

    }

    public long[] run(int n) {
        long fOne = 1;
        long fTwo = 1;
        long sum = fOne + fTwo;

        long[] fiboArray = new long[n];
        fiboArray[0] = fOne;
        fiboArray[1] = fTwo;

        for (int i = 0; i < n - 2; i++) {
            fiboArray[i + 2] = sum;
            fOne = fTwo;
            fTwo = sum;
            sum = fOne + fTwo;
        }

        return fiboArray;
    }

    public void printFiboArray(long[] inputArray) {
        for (long number : inputArray) {
            System.out.print(number + ", ");
        }
    }

}
