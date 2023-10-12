package io.journal.dsa.problems.recursion;

public class VowelsClass {
    public static int totalVowels(String text, int len, int index) {
        int count = 0;

        if (len == 0) {
            return 0;
        }
        char single = Character.toUpperCase(text.charAt(index));
        if (single == 'A' || single == 'E' || single == 'I' || single == 'O' || single == 'U') {
            count++;
        }
        return count + totalVowels(text, len - 1, index + 1);
    }

    public static int totalVowelsTailRec(String text, int length, int acc) {

        // Base case
        if (length == 0) {
            return acc;
        }

        char single = Character.toUpperCase(text.charAt(0));

        char[] charArray = new char[]{'A', 'E', 'I', 'O', 'U'};

        // Recursive case
        if (String.valueOf(charArray).contains(String.valueOf(single))) {
            return totalVowelsTailRec(text.substring(1), length - 1, acc + 1);
        } else {
            return totalVowelsTailRec(text.substring(1), length - 1, acc);
        }

        /**
         * if (single == 'A' || single == 'E' || single == 'I' || single == 'O' || single == 'U') {
         * return totalVowelsTailRec(text.substring(1), length - 1, acc + 1);
         * } else {
         * return totalVowelsTailRec(text.substring(1), length - 1, acc);
         * }
         * */
    }

    public static void main(String args[]) {
        String text = "thisisrecursion";
        System.out.println(totalVowels(text, text.length(), 0));
        System.out.println(totalVowelsTailRec(text, text.length(), 0));
    }
}
