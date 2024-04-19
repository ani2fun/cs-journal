package io.journal.dsa.tutorials.trie.example3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    public void run() {
        Trie autoCompleteDict = getExampleTree();
        //System.out.println(autoCompleteDict);

        TrieNode subtreeRoot = autoCompleteDict.getSubTree("p");
        System.out.println("subtree = " + subtreeRoot.value);

        List<String> matches = autoCompleteDict.getMatches("p");

        for (String match : matches) {
            System.out.println(match);
        }

    }

    private Trie getExampleTree() {
        Trie trie = new Trie();

        try {
            Files.lines(new File("src/resources/keywords.txt").toPath())
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .forEach(trie::add);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return trie;
    }

}
