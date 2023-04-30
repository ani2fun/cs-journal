package io.journal.mathematics;

// Finding the number of digits in a number.

public class NumberOfDigits {
    public static void main(String[] args) {

        long n1 = 0;
        System.out.println("Number of digits of a number " + n1 + " is: " + countDigitIter(n1));
        System.out.println("Number of digits of a number " + n1 + " is: " + countDigitRec(n1));
        System.out.println("Number of digits of a number " + n1 + " is: " + countDigitLog(n1));

        long n2 = 123;
        System.out.println("Number of digits of a number " + n2 + " is: " + countDigitIter(n2));
        System.out.println("Number of digits of a number " + n2 + " is: " + countDigitRec(n2));
        System.out.println("Number of digits of a number " + n2 + " is: " + countDigitLog(n2));

    }

    // Theta(d) , d is number of digits in input
    private static int countDigitIter(long n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }

    private static int countDigitRec(long n) {
        if (n == 0) return 0;
        return 1 + countDigitIter(n / 10);
    }

    private static int countDigitLog(long n) {
        if (n == 0) return 0;
        return (int) (Math.floor(Math.log10((double) n) + 1));
    }
}
