package io.journal.dsa.problems.mathematical;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factIter(4));
        System.out.println(factIter(6));
        System.out.println(factIter(0));
        System.out.println(factIter(16)); // 16 is max
        System.out.println("*** fact rec ***");
        System.out.println(factRec(4));
        System.out.println(factRec(6));
        System.out.println(factRec(0));
        System.out.println("*** fact rec tail ***");
        System.out.println(factTailRec(4, BigInteger.ONE));
        System.out.println(factTailRec(6, BigInteger.ONE));
        System.out.println(factTailRec(0, BigInteger.ONE));
        System.out.println(factTailRec(16, BigInteger.ONE));
        System.out.println(factTailRec(21, BigInteger.ONE));
        System.out.println(factTailRec(100, BigInteger.ONE));
        System.out.println(" ********************");
        System.out.println(getFactorialRecursively(21));
    }

    private static int factRec(int n) {
        if (n == 0) return 1;
        return n * factRec(n - 1);
    }

    private static BigInteger factTailRec(int n, BigInteger acc) {
        if (n == 0) return acc;
        return factTailRec(n - 1, acc.multiply(BigInteger.valueOf(n)));
    }

    public static BigInteger getFactorialRecursively(int n) {
        BigInteger value = BigInteger.valueOf(n);
        if (value == BigInteger.ZERO) {
            return BigInteger.ONE;
        } else {
            return value.multiply(getFactorialRecursively(n - 1));
        }
    }

    public static int factIter(int n) {
        int fact = 1;
        if (n == 0 || n == 1) return fact;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
