package io.journal.dsa.tutorials.trie.example4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class App {

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    private void run() {
        Trie trie = new Trie();

        try {
            Files.lines(new File("src/resources/keywords.txt").toPath())
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .forEach(trie::addword);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(trie.autocomplete("p"));
        System.out.println(trie.autocomplete("pro"));
        System.out.println(trie.autocomplete("prog"));

        // Very crud way to run continuously: To exit the program just Stop main or kill via SIG-9
        /**
         Scanner input = new Scanner(System.in);
         System.out.println("To exit the program just Stop main or kill via SIG-9");
         System.out.println("Enter a text to search");
         do {
         System.out.println(trie.autocomplete(input.next()));
         System.out.println("Enter a text to search");
         } while (true);
         */
    }


}
