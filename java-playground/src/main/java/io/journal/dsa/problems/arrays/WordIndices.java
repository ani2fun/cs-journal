package io.journal.dsa.problems.arrays;

import java.util.ArrayList;
import java.util.List;

public class WordIndices {
    public static void main(String[] args) {
        String str = "programmerxxxgrormamerp";
        String word = "programmer";
        List<Integer> indices = findWordIndices(str, word);

        if (indices.isEmpty()) {
            System.out.println("The word '" + word + "' does not appear in the string.");
        } else {
            System.out.println("The word '" + word + "' appears at the following indices:");
            for (int index : indices) {
                System.out.println(index);
            }
        }
    }

    private static List<Integer> findWordIndices(String str, String word) {
        List<Integer> indices = new ArrayList<>();
        int wordLength = word.length();

        // Count the frequency of each character in the word
        int[] charCount = new int[26];
        for (char c : word.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Iterate through the string and check for word occurrences
        for (int i = 0; i <= str.length() - wordLength; i++) {
            String subStr = str.substring(i, i + wordLength);
            int[] subStrCount = new int[26];

            // Count the frequency of each character in the current substring
            for (char c : subStr.toCharArray()) {
                subStrCount[c - 'a']++;
            }

            // Compare the character counts
            boolean found = true;
            for (int j = 0; j < 26; j++) {
                if (charCount[j] != subStrCount[j]) {
                    found = false;
                    break;
                }
            }

            // If the character counts match, add the index to the list
            if (found) {
                indices.add(i);
            }
        }

        return indices;
    }
}

