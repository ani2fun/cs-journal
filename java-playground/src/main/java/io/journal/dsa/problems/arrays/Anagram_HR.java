package io.journal.dsa.problems.arrays;

import java.util.Scanner;

public class Anagram_HR {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) return false;

        int[] wordA = new int[26];
        for (char c : a.toLowerCase().toCharArray()) {
            wordA[c - 'a']++;
        }

        int[] wordB = new int[26];
        for (char c : b.toLowerCase().toCharArray()) {
            wordB[c - 'a']++;
        }

        boolean isAnagram = true;
        for (int i = 0; i < 26; i++) {
            if (wordA[i] != wordB[i]) {
                isAnagram = false;
            }
        }
        return isAnagram;

    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        String a = "anagramm"; // scan.next();
        String b = "marganaa"; // scan.next();
        //scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");


        String c = "Hello";
        String d = "hello";
        boolean ret1 = isAnagram(c, d);
        System.out.println((ret1) ? "Anagrams" : "Not Anagrams");

        System.out.println("-----");

    }
}
