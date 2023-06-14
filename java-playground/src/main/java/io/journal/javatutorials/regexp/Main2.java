package io.journal.javatutorials.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        String text = "Paris is beautiful in summer and there are many tourists in the city.";

        // a simple character class
        String searchText = "..autiful";
        String replaceText = "great";

        // creating a pattern object
        Pattern pattern = Pattern.compile(searchText);
        // creating a matcher to find the pattern within the text
        Matcher matcher = pattern.matcher(text);

        StringBuffer sb = new StringBuffer();
        while (matcher.find()){
            matcher.appendReplacement(sb, replaceText);
        }

        matcher.appendTail(sb);

        System.out.println(sb.toString());


        String result = matcher.replaceFirst(replaceText);
        System.out.println("---Result using replaceFirst---");
        System.out.println(result);


//        String replaceText2 = matcher.quoteReplacement("rat$");
        System.out.println(replaceText);

    }
}
