package io.journal.mathematics;

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
        ReverseDigits l = new ReverseDigits();
        System.out.println(l.run(54321));
    }

    private String run(int n) {
        int iterationCount = 0;
        int rev;
        rev = 0;
        System.out.println("n: " + n + " ,rev: " + rev + " ,i: " + iterationCount);
        while (n > 0) {
            iterationCount++;

            rev = rev * 10 + n % 10;
            n = n / 10;


            System.out.println("n: " + n + " ,rev: " + rev + " ,i: " + iterationCount);

        }
        return "n is: " + n + " , rev is: " + rev + " ,after " + iterationCount + " iteration ";
    }
}
