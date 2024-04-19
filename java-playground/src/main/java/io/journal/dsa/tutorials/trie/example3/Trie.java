package io.journal.dsa.tutorials.trie.example3;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Trie {
    static final char nullValue = ' ';
    TrieNode root = new TrieNode();

    public TrieNode getSubTree(String prefix) {

        prefix = prefix.toLowerCase();
        Queue<Character> letters = toCharacterQueue(prefix);
        TrieNode subtree = root.getSubTree(letters);
        return subtree;

    }

    public List<String> getMatches(String prefix) {
        // in: ANT
        // out: eater, - , hony

        // get subtree for the prefix
        TrieNode subtreeRoot = getSubTree(prefix);
        // get all the suffixes
        List<String> matches = subtreeRoot.getWords();

        prefix = prefix.substring(0, prefix.length() - 1);

        // add prefix to suffix
        for (int i = 0; i < matches.size(); i++) {
            String suffix = matches.get(i);
            matches.set(i, prefix + suffix);
        }
        // return the matches
        return matches;


    }

    void add(String word) {
        word = word.toLowerCase();
        Queue<Character> letters = toCharacterQueue(word);
        root.add(letters);
    }

    private Queue<Character> toCharacterQueue(String word) {
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            queue.add(letter);
        }
        return queue;
    }

    @Override
    public String toString() {
        return root.toString(nullValue);
    }


}
