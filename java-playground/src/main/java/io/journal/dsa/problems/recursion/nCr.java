package io.journal.dsa.problems.recursion;


// nCr = (n! / (r!*(n-r)!))
// OR
// nCr value can be found out using Pascal's triangle

import static io.journal.dsa.problems.mathematical.Factorial.factIter;

public class nCr {


    // nCr using formula
    public static int C(int n, int r) {
        int numerator = factIter(n);
        int denominator1 = factIter(r);
        int denominator2 = factIter(n - r);
        return numerator / (denominator1 * denominator2);
    }

    // nCr using Pascal's triangle
    public static int nCr(int n, int r) {
        if (r == 0 || n == r)
            return 1;
        else
            return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }


    public static void main(String[] args) {
        System.out.println(C(4, 2));
        System.out.println(nCr(4, 2));
        
    }





}
