package h5;


public class Fibo {

    public static long run(long n) {
        return run(1, 1, n);
    }

    // Beter: BigInteger of BigDecimals gebruiken. Die ronden niet af.
    public static float runFloat(float n) {
        float currentNumber = 1;
        float prevNumber = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(prevNumber + " ");
            float nextNumber = prevNumber + currentNumber;
            prevNumber = currentNumber;
            currentNumber = nextNumber;
        }

        System.out.println("");
        return currentNumber - prevNumber;
    }

    public static long run(long start, long n) {
        return run(start, start, n);
    }

    public static long run(long f1, long f2, long n) {
        long currentNumber = f2;
        long prevNumber = f1;
        for (int i = 0; i < n; i++) {
            System.out.print(prevNumber + " ");
            long nextNumber = prevNumber + currentNumber;
            prevNumber = currentNumber;
            currentNumber = nextNumber;
        }

        System.out.println("");
        return currentNumber - prevNumber;
    }

    public static void goldenRatio(int position) {
        long something = run(position);
        long somethingElse = run(position-1);
        double ratio = (double) something / somethingElse;
        System.out.println(ratio);
    }


/*  Mislukte recursieve fibonacci, kan dit
wel met een void functie?

    public static void run(int n) {
        if (n == 0) {
            System.out.println("1");
        } else {
            System.out.println(n);
            int seq = run(n - 1) + run(n - 1);
        }

    }*/
}
