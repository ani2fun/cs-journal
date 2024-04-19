package io.journal.dsa.problems.mathematical;

public class GCD {
    public static void main(String[] args) {
        System.out.println("*************************");
        System.out.println(gcdNaive(10, 15)); // Ans: 5
        System.out.println(gcdNaive(12, 15)); // Ans: 3
        System.out.println("*************************");
        System.out.println(gcdWithEuclidean(10, 15));
        System.out.println(gcdWithEuclidean(12, 15));
        System.out.println("*************************");
        System.out.println(gcdWithEuclideanOpt(10, 15));
        System.out.println(gcdWithEuclideanOpt(12, 15));
        System.out.println(gcdWithEuclideanOpt(15, 12));
        System.out.println("*************************");
        System.out.println("The GCD of " + 56 + " and " + 42 + " is: " + gcd(56, 42)); // answer is 14
        System.out.println("The GCD of " + 36 + " and " + 54 + " is: " + gcd(36, 54)); // answer is 18
        System.out.println("The GCD of " + 100 + " and " + 25 + " is: " + gcd(100, 25)); // answer is 25
        System.out.println("The GCD of " + 25 + " and " + 100 + " is: " + gcd(25, 100)); // answer is 25
        System.out.println("*************************");
        System.out.println("----using modulo----");
        System.out.println("The GCD of " + 25 + " and " + 100 + " is: " + gcdUsingModulo(25, 100)); // answer is 25
        System.out.println("The GCD of " + 36 + " and " + 54 + " is: " + gcdUsingModulo(36, 54)); // answer is 18
        System.out.println("*************************");
    }

    // Time complexity: O(min(a,b))
    static int gcdNaive(int a, int b) {
        int result = Math.min(a, b);

        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }

        return result;
    }

    /**
     * Basic idea:
     * Let 'b' be smaller than 'a'
     * gcd(a, b) = gcd(a-b, b)
     * <p>
     * Why ?
     * <p>
     * Let 'g' be GCD of 'a' and 'b'
     * a = gx , b = gy and GCD(x, y) = 1
     * (a-b) = g(x-y)
     */
    static int gcdWithEuclidean(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    // Optimised implementation
    static int gcdWithEuclideanOpt(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcdWithEuclideanOpt(b, a % b);
    }

    public static int gcd(int first, int second) {

        // Everything divides 0
        if (first == 0)
            return second;
        if (second == 0)
            return first;

        // Base case
        if (first == second)
            return first;

        // recursive case
        if (first > second)
            return gcd(first - second, second);
        else
            return gcd(first, second - first);

    }

    public static int gcdUsingModulo(int first, int second) {
        if (second == 0)
            return first;
        else
            return gcdUsingModulo(second, first % second);
    }

}
