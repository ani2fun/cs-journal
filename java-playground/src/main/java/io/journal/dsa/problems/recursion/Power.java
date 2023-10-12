package io.journal.dsa.problems.recursion;

public class Power {

    public static int power(int b, int p) {
        if (p == 0) {
            return 1;
        } else {
            return (b * power(b, p - 1));
        }
    }

    public static int power2(int number, int p, int acc) {
        if (p == 0) {
            return acc;
        } else {
            return power2(number, p - 1, acc * number);
        }
    }

    public static int power3(int m, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return power3(m * m, n / 2);
        } else {
            return m * (power3(m * m, (n - 1) / 2));
        }
    }


    public int powerOfNumber(int number, int power) {
        return helper(number, power, 1);
    }

    private int helper(int n, int p, int acc) {
        if (p == 0) {
            return acc;
        } else {
            return helper(n, p - 1, acc * n);
        }
    }

    public static void main(String args[]) {
        System.out.println(power(2, 5));
        System.out.println(power2(2, 5, 1));
        System.out.println(new Power().powerOfNumber(2, 5));
        System.out.println(power3(2, 3));
    }
}
