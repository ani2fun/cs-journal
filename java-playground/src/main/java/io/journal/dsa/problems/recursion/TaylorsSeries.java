package io.journal.dsa.problems.recursion;

public class TaylorsSeries {
    private static double p = 1;
    private static double f = 1;

    static double e(int x, int n) {
        double result;
        if (n == 0) {
            return 1;
        } else {
            result = e(x, n - 1);
            p = p * x;
            f = f * n;
            return result + p / f;
        }
    }

    private static double sum = 1;

    static double eRec(double x, int n) {
        if (n == 0)
            return sum;
        else {
            sum = 1 + (x / n) * sum;
            return eRec(x, n - 1);
        }
    }


    public static void main(String[] args) {
        System.out.println("e iterative: " + e(1, 10));
        System.out.println("e rec: " + eRec(1, 10));
    }
}
