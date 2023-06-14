package io.journal.dsa.problems.mathematical;

/**
 * i/p: n = 5 // 1 x 2 x 3 x 4 x 5  = 120
 * o/p: 1
 * i/p: n = 10 // 1 x 2 x 3 x 4 x ... x 9 x 10 = 3628800
 * o/p: 2
 * i/p: n = 100
 * o/p: 24
 * <p>
 * 1 x 2 x 3 x 4 x 5(∆1) x 6 x 7 x 8 x 9 x 10(∆1) x 11 x 12 x 13 x 14 x 15(∆1) .... 25(∆2) .... 125((∆2)+1) ....
 * <p>
 * Trailing zero count = Floor(n/5) + Floor(n/25) + Floor(n/125)
 *
 * 5.pow(k) ≤ n ---->  k ≤ log of n to base 5. ----> Time Complexity = θ(log n) , where n is number passed.
 */

public class TrailingZeroInFactorial {
    public static void main(String[] args) {
        System.out.println(trailingZero(100));
        System.out.println(trailingZero(251));
    }

    static int trailingZero(int n) {
        int result = 0;

        for (int i = 5; i <= n; i = i * 5) {
            result = result + n / i;
        }

        return result;
    }


}
