package io.journal.javatutorials.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        String ipAddress = "255.255.255.1";

        // simple string matching
        String separator = "\\.";
        Pattern pattern = Pattern.compile(separator);
        String[] splitted = pattern.split(ipAddress);
        System.out.println("Splitted--> "+ Arrays.toString(splitted));



        final int flag1 = Pattern.CASE_INSENSITIVE;

         final int flag2 = Pattern.UNIX_LINES; // Unix lines mode
         final int flag3 = Pattern.LITERAL;
         final int flag4 = Pattern.COMMENTS; // Permists whitespace and comments
         final int flag5 = Pattern.DOTALL; // dotall - '.' matches all characters
         final int flag6 = Pattern.MULTILINE;
         final int flag7 = Pattern.CANON_EQ; // canonical equivalence
         final int flag8 = Pattern.UNICODE_CHARACTER_CLASS; // POSIX character
         final int flag9 = Pattern.UNICODE_CASE; // Unicode-aware case folding

        String str = "Welcome to this course!!." +
                "\n In this course we will learn about Java regex";
        // creating a pattern with case insensitive flag.
        Pattern p1 = Pattern.compile("regex", flag1);
        // creating a matcher which matches the pattern against the given string.
        Matcher m1 = p1.matcher(str);

        Pattern p2 = Pattern.compile("regex", flag2);
        Pattern p3 = Pattern.compile("regex", flag3);
        Pattern p4 = Pattern.compile("regex", flag4);
        Pattern p5 = Pattern.compile("regex", flag5);
        Pattern p6 = Pattern.compile("regex", flag6);
        Pattern p7 = Pattern.compile("regex", flag7);
        Pattern p8 = Pattern.compile("regex", flag8);

        Matcher m2 = p1.matcher(str);
        Matcher m3 = p1.matcher(str);
        Matcher m4 = p1.matcher(str);
        Matcher m5 = p1.matcher(str);
        Matcher m6 = p1.matcher(str);
        Matcher m7 = p1.matcher(str);
        Matcher m8 = p1.matcher(str);


        // returns true or false depending whether tha pattern is matched or not.
        boolean matchFound = m3.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }


    }
}