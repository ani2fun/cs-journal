package io.journal.dsa.problems.loops;

import java.util.Scanner;

/*

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.
Input Format
Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from  0 to 999.

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input:

java 100
cpp 65
python 50

Sample Output:
================================
java           100
cpp            065
python         050
================================


Explanation
Each String is left-justified with trailing whitespace through the first 15 characters. The leading digit of the integer is the 16th character, and each integer that was less than 3 digits now has leading zeroes.
*/

public class JavaOutputFormatting {

    // WITH REGEX
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d %n", s1, x);
        }
        System.out.println("================================");

    }

    // OR

    // WITHOUT REGEX
    /*
    public static void main(String[] args) {
        final char EMPTY = ' ';
        final char ZERO = '0';

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 1; i++) {
            int j;
            char[] stringArray = new char[15];
            char[] intArray = new char[3];

            for (j = 0; j < 15; j++) {
                stringArray[j] = EMPTY;
            }
            for (j = 0; j < 3; j++) {
                intArray[j] = ZERO;
            }

            String s1 = sc.next();
            int x = sc.nextInt();

            char[] charArr1 = s1.toCharArray();
            char[] charArr2 = String.valueOf(x).toCharArray();

            if (charArr1.length <= 10) {
                for (j = 0; j < charArr1.length; j++) stringArray[j] = charArr1[j];
            }

            int k = intArray.length - 1;
            if (x <= 999) {
                for (j = charArr2.length - 1; j >= 0; j--, k--) {
                    intArray[k] = charArr2[j];
                }
            }

            for (char ch : stringArray) {
                System.out.print(ch);
            }
            for (char ch : intArray) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println("================================");
    }*/

}
