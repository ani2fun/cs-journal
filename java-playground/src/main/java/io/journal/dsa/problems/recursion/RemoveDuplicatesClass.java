package io.journal.dsa.problems.recursion;

public class RemoveDuplicatesClass {

    public static String removeDuplicates(String text) {

        if (text.length() == 1) {
            return text;
        }

        if (text.substring(0, 1).equals(text.substring(1, 2))) {
            return removeDuplicates(text.substring(1));
        } else {
            return text.charAt(0) + removeDuplicates(text.substring(1));
        }

    }

    public static String removeDuplicatesTail(String text, String acc) {

        // Base case
        if (text.isEmpty()) {
            return acc;
        }

        // Base case
        if (text.length() == 1) {
            return acc + text.charAt(0);
        }

        // Recursive case
        if (text.substring(0, 1).equals(text.substring(1, 2))) {
            return removeDuplicatesTail(text.substring(1), acc);
        } else {
            return removeDuplicatesTail(text.substring(1), acc + text.charAt(0));
        }

    }


    public static void main(String[] args) {
        String input1 = "Helloo";
        System.out.println("Original string: " + input1);
        String output = removeDuplicates(input1);
        System.out.println("String after: " + output);

        // Tail recursive
        String output2 = removeDuplicatesTail(input1, "");
        System.out.println("String after (tail): " + output2);

        String input2 = "Thiss iiss aa teesstt";
        System.out.println("Original string (tail): " + input2);
        String output3 = removeDuplicatesTail(input2, "");
        System.out.println("String after (tail):: " + output3);
    }
}
