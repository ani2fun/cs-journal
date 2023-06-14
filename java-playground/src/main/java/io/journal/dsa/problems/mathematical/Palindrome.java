package io.journal.dsa.problems.mathematical;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("*** Int palindrome ***");
        System.out.println(isPalIntIter(8668));        // YES
        System.out.println(isPalIntIter(78987));       // YES
        System.out.println(isPalIntIter(8));           // YES
        System.out.println(isPalIntIter(21));          // NO
        System.out.println(isPalIntIter(363));         // YES
        System.out.println(isPalIntIter(367));         // NO
        System.out.println("*** String palindrome ***");
        System.out.println(isPalStringRec("qqaabb"));  // NO
        System.out.println(isPalStringRec("cocoococ"));  // YES


    }

    // Time Complexity = θ(d) , where d is number of the digits in a given number.
    // Idea: Traverse digits from right to left to find the reverse of the given number.
    private static boolean isPalIntIter(int x) {
        int original = x;
        int reverse = 0;
        while (x != 0) {
            reverse = reverse * 10 + (x % 10);
            x = x / 10;
        }
        return original == reverse;
    }

    private static boolean isPalStringRec(String s) {
        if (s.length() == 0 || s.length() == 1)
            return true;

        if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPalStringRec(s.substring(1, s.length() - 1));

        return false;
    }


}
