package io.journal.tutorials.recursion;

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
    }
}
