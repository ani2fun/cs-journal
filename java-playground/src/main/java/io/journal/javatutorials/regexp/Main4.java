package io.journal.javatutorials.regexp;

import java.util.regex.Pattern;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Pattern Matching Using Character Classes".toUpperCase());
        System.out.println(Pattern.matches("[abc]", "xyz")); // false
        System.out.println(Pattern.matches("[abc]", "a")); // true
        System.out.println(Pattern.matches("[abc]", "aabbcc")); //false
        System.out.println(Pattern.matches("(abc)", "abc")); // true
    }

}
