package io.journal.dsa.problems.mathematical;

// Finding the number of digits in a number.
/*
Given a number N, the task is to return the count of digits in this number.
Input: N = 12345
Output: 5
Explanation: N has 5 digits
* */

public class CountDigits {
    public static void main(String[] args) {

        long n1 = 0;
        System.out.println("Number of digits of a number " + n1 + " is: " + countDigitIter(n1));
        System.out.println("Number of digits of a number " + n1 + " is: " + countDigitRec(n1));
        System.out.println("Number of digits of a number " + n1 + " is: " + countDigitLog(n1));

        long n2 = 123;
        System.out.println("Number of digits of a number " + n2 + " is: " + countDigitIter(n2));
        System.out.println("Number of digits of a number " + n2 + " is: " + countDigitRec(n2));
        System.out.println("Number of digits of a number " + n2 + " is: " + countDigitLog(n2));

        long n3 = 12345;
        System.out.println("countDigitsUsingStringApproach => Number of digits of a number " + n3 + " is: " + countDigitsUsingStringApproach(n3));

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

    /*
     * Approach-1 (Converting given number to string)
     * We can convert the number into a string and then find the length of the string
     * to get the number of digits in the original number
     * */
    private static int countDigitsUsingStringApproach(long n) {
        if (n < 0) {
            String asString = Long.toString(n * -1);
            return asString.length();
        }
        String asString = Long.toString(n);
        return asString.length();
    }
}
