package io.journal.javabasics.recursion;

import java.lang.*;

public class GCD {

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

    public static void main(String[] args) {
        System.out.println("The GCD of " + 56 + " and " + 42 + " is: " + gcd(56, 42)); // answer is 14
        System.out.println("The GCD of " + 36 + " and " + 54 + " is: " + gcd(36, 54)); // answer is 18
        System.out.println("The GCD of " + 100 + " and " + 25 + " is: " + gcd(100, 25)); // answer is 25
        System.out.println("The GCD of " + 25 + " and " + 100 + " is: " + gcd(25, 100)); // answer is 25

        System.out.println("----using modulo----");
        System.out.println("The GCD of " + 25 + " and " + 100 + " is: " + gcdUsingModulo(25, 100)); // answer is 25
        System.out.println("The GCD of " + 36 + " and " + 54 + " is: " + gcdUsingModulo(36, 54)); // answer is 18


    }

}
