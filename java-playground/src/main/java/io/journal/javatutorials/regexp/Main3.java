package io.journal.javatutorials.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("<h3>ASCII characters</h3>");
        for (int i = 0; i <= 255; i++) {
            System.out.print("\t&#" + i + ";");
        }

        System.out.println("-------- Predefined character classes --------");

        System.out.println();
        System.out.println("Digits");
        System.out.println("---------------");
        System.out.println(Pattern.matches("\\d", "1")); // true
        System.out.println(Pattern.matches("\\d", "A")); // false

        System.out.println();
        System.out.println("Non-digits");
        System.out.println("---------------");
        System.out.println(Pattern.matches("\\D", "1")); // false
        System.out.println(Pattern.matches("\\D", "A")); // true

        System.out.println();
        System.out.println("Whitespace");
        System.out.println("---------------");
        System.out.println(Pattern.matches("\\s", " "));
        System.out.println(Pattern.matches("\\s", "\n"));
        System.out.println(Pattern.matches("\\s", "\t"));
        System.out.println(Pattern.matches("\\s", "A"));

        System.out.println();
        System.out.println("Non whitespace");
        System.out.println("---------------");
        System.out.println(Pattern.matches("\\S", " "));
        System.out.println(Pattern.matches("\\S", "\n"));
        System.out.println(Pattern.matches("\\S", "\t"));
        System.out.println(Pattern.matches("\\S", "A"));

        System.out.println();
        System.out.println("Word");
        System.out.println("---------------");
        System.out.println(Pattern.matches("\\w", " "));
        System.out.println(Pattern.matches("\\w", "\n"));
        System.out.println(Pattern.matches("\\w", "1"));
        System.out.println(Pattern.matches("\\w", "A"));

        System.out.println();
        System.out.println("Non-word");
        System.out.println("---------------");
        System.out.println(Pattern.matches("\\W", " "));
        System.out.println(Pattern.matches("\\W", "\n"));
        System.out.println(Pattern.matches("\\W", "1"));
        System.out.println(Pattern.matches("\\W", "#"));


        System.out.println(" ---- ----- ------ ------- ---- ----");


        String text = "The quick brown fox fox jumped over the lazy dog.";

        // a simple character class
        String searchText = "(fox)\\s\\1"; // equivalent to: "(fox)\\s(fox)"

        // creating a pattern object
        Pattern pattern = Pattern.compile(searchText);

        // creating a matcher to find the pattern within the text
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.format("Found \"%s\", at positiong [%d-%d]\n",
                    matcher.group(), matcher.start(), matcher.end());
        } else {
            System.out.println("No match found");
        }

        System.out.format("Character at Position %d is: \"%s\", in a string=>\"%s\"", 16, text.charAt(16), text);
        System.out.println();
        System.out.format("Character at Position %d is: \"%s\", in a string=>\"%s\"", 23, text.charAt(23), text);
    }
}
