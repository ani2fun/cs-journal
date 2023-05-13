package io.journal.javabasics.recursion;

/**
 * Input : n = 4
 * Output : fibonacci(4) = 3
 * <p>
 * Input : n = 9
 * Output : fibonacci(9) = 34
 */

public class Fibonacci {

    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, c;

        if (n == 0)
            return a;
        else
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
        return b;
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

        System.out.println("Iter-fib(5) : " + fibonacciIterative(5));
//        System.out.println("Iter-fib(4) : " + fibonacciIterative(4));
        System.out.println("Iter-fib(9) : " + fibonacciIterative(9));
        System.out.println("Recur-fib(5) : " + fibonacciRecursive(9, 0, 1));

    }
}