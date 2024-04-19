package io.journal.dsa.problems.recursion;

public class ReverseString {

    private static String reverseString(String myString) {

        if (myString.isEmpty())
            return "";
        else
            return reverseString(myString.substring(1)) + myString.charAt(0);
    }

    public static void main(String[] args) {
        String string1 = "Hello World";

        System.out.println("The Original String is: ");
        System.out.println(string1);

        String resultStr = reverseString(string1);

        System.out.println("String after reversal: ");
        System.out.println(resultStr);
    }


}
