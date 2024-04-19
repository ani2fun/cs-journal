package io.journal.dsa.problems.mathematical;

/**
 * Input : n = 4
 * Output : fibonacci(4) = 3
 * <p>
 * Input : n = 9
 * Output : fibonacci(9) = 34
 */

public class Fibonacci {

    public static int fibonacciIterative(int n) {
        int t0 = 0, t1 = 1, s, i;

        if (n == 0) return t0;

        for (i = 2; i <= n; i++) {
            s = t0 + t1;
            t0 = t1;
            t1 = s;
        }

        return t1;
    }

    public static int fibonacciRecursive(int n, int a, int b) {
        if (n == 0)
            return a;
        if (n == 1)
            return b;
        else
            return fibonacciRecursive(n - 1, b, a + b);
    }

    public static int fibonacci(int n) {
        // Base case
        if (n <= 1)
            return n;
            // Recursive case
        else
            return (fibonacci(n - 1) + fibonacci(n - 2));
    }

    static int[] F = new int[10];

    //      Calculates the nth Fibonacci number using memoization.
    public static int fibM(int n) {
        if (n <= 1) {
            F[n] = n;
            return n;
        } else {
            if (F[n - 2] == 0) F[n - 2] = fibM(n - 2);
            if (F[n - 1] == 0) F[n - 1] = fibM(n - 1);
            return F[n - 2] + F[n - 1];
        }
    }

    public static void main(String args[]) {
        int input = 9;
        System.out.println("Fibonacci sequence for the first " + input + " elements is: " + fibonacci(input));
        // Loop to print all the fibonacci sequence elements
        int i = 0;
        while (i < input) {
            System.out.print(fibonacci(i) + " ");
            i++;
        }
        System.out.println();

        System.out.println("fib-Iter(2) : " + fibonacciIterative(2));
        System.out.println("fib-Iter(9) : " + fibonacciIterative(9));
        System.out.println("fib-Recur(9) : " + fibonacciRecursive(9, 0, 1));

        System.out.println("Fibonacci using memoization");
        System.out.println("Initialise the array F with -1 ");
        for (int j = 0; j < F.length - 1; j++) F[i] = -1;
        System.out.println("fib-Mem(9) : " + fibM(9));
    }
}