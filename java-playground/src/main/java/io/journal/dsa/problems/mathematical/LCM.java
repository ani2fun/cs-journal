package io.journal.dsa.problems.mathematical;

/**
 * i/p: a = 4 , b = 6
 * o/p: 12
 * <p>
 * i/p: a = 12 , b = 15
 * o/p: 60
 * <p>
 * i/p: a = 2 , b = 8
 * o/p: 8
 * <p>
 * i/p: a = 3 , b = 7
 * o/p: 21
 */

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcmNaive(4, 6));
        System.out.println(lcmOpt(4, 6));
    }

    // Time complexity O(axb - max(a,b))
    static int lcmNaive(int a, int b) {
        int lcm = Math.max(a, b);
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) return lcm;
            lcm++;
        }
    }

    // Formula: a * b = gcd(a,b) * lcm(a, b)
    static int lcmOpt(int a, int b) {
        return (a * b) / gcdOpt(a, b);
    }

    // Time complexity: O(log(min(a,b)))
    private static int gcdOpt(int a, int b) {
        if (b == 0) return a;
        else return gcdOpt(b, a % b);
    }

}
