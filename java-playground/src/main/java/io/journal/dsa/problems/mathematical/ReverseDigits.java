package io.journal.dsa.problems.mathematical;

/**
 * @ https://www.geeksforgeeks.org/gate-gate-cs-2004-question-32/
 * Consider the following program fragment for reversing the digits in a given integer to obtain a new integer. Let n = D1D2…Dm
 * int n, rev;
 * rev = 0;
 * while (n > 0)
 * {
 * rev = rev*10 + n%10;
 * n = n/10;
 * }
 * The loop invariant condition at the end of the ith iteration is:
 * A --> n = D1D2….Dm-i and rev = DmDm-1…Dm-i+1 = Correct answer
 * B --> n = Dm-i+1…Dm-1Dm and rev = Dm-1….D2D1
 * C --> n != rev
 * D --> n = D1D2….Dm and rev = DmDm-1…D2D1
 */
public class ReverseDigits {
    public static void main(String[] args) {
        ReverseDigits reverseDigits = new ReverseDigits();
        System.out.println(reverseDigits.iterativeVersion(54321));
        System.out.println(reverseDigits.recursiveVersion(123456789));
        System.out.println(reverseDigits.reverseDigits(54321));
    }

    private String iterativeVersion(int n) {
        int iterationCount = 0;
        int rev;
        rev = 0;
        // System.out.println("n: " + n + " ,rev: " + rev + " ,i: " + iterationCount);
        while (n > 0) {
            iterationCount++;
            rev = rev * 10 + n % 10;
            n = n / 10;
            // System.out.println("n: " + n + " ,rev: " + rev + " ,i: " + iterationCount);
        }
        return "n is: " + n + " , rev is: " + rev + " ,after " + iterationCount + " iteration ";
    }
    // Less efficient code snippet, as it involves more string operations, conversions, and recursive calls
    private int recursiveVersion(int n) {
        if (n == 0) return 0;
        return Integer.parseInt(
                ((n % 10) + String.valueOf(recursiveVersion(n / 10))
                ).substring(0, String.valueOf(n).length()));
    }

    private int reverseDigits(int n) {
        StringBuilder buffer = new StringBuilder(String.valueOf(n));
        return Integer.parseInt(buffer.reverse().toString());
    }
}
