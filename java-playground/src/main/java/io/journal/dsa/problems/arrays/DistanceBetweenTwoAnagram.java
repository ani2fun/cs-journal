package io.journal.dsa.problems.arrays;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DistanceBetweenTwoAnagram {
    final static String targetString = "programmer";

    static void programmerStrings(String original, Map<Character, Integer> targetMap) {
        final List<Integer> list = new LinkedList<>();
        final int targetLength = targetString.length();
        final int originalLength = original.length();

        try {
            for (int i = 0; i <= originalLength - targetLength; i++) {
                boolean areEqual = areEqual(targetMap, freqOfChars(original.substring(i, i + targetLength)));
                if (areEqual) list.add(i);
            }

            System.out.println("List of indices: " + list);

            for (int j = 0; j < list.size() - 1; j++) {

                int distance = list.get(j + 1) - (list.get(j) + targetLength);
                System.out.println(distance);
            }

        } catch (Exception e) {
            System.out.println("toto: " + e.getMessage());
        }
    }

    static boolean areEqual(Map<Character, Integer> first, Map<Character, Integer> second) {
        if (first.size() != second.size()) return false;
        return first.entrySet().stream().allMatch(e -> e.getValue().equals(second.get(e.getKey())));
    }

    static Map<Character, Integer> freqOfChars(String str) {
        Map<Character, Integer> freqMap = new HashMap<>(26);
        int n = str.length();

        for (int i = 0; i < n; i++) {
            if (freqMap.containsKey(str.charAt(i))) {
                int temp = freqMap.get(str.charAt(i)) + 1;
                freqMap.replace(str.charAt(i), temp);
            } else {
                freqMap.put(str.charAt(i), 1);
            }
        }
        return freqMap;
    }

    public static void main(String[] args) {
        final Map<Character, Integer> targetMap = freqOfChars(targetString);
        final String original = "programmerxxxgrormamerp12345pgroramerm";
        programmerStrings(original, targetMap);

    }
}
