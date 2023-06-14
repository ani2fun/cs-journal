package io.journal.dsa.tutorials.trie.example3;

import java.util.*;

public class TrieNode {
    public char value = Trie.nullValue;
    private Map<Character, TrieNode> children = new HashMap<>();

    public TrieNode() {
    }

    public TrieNode(char letter) {
        this.value = letter;
    }


    public void add(Queue<Character> letters) {
        // _ - A:NT
        // a - N:T
        // ant - _

        // when no letter left
        if (letters.isEmpty()) {
            children.put(Trie.nullValue, new TrieNode());
            return;
        }

        char nextLetter = letters.remove();

        // if children do not have key nextLetter e.g. A node
        if (!children.containsKey(nextLetter)) {
            children.put(nextLetter, new TrieNode(nextLetter));
        }

        TrieNode nextNode = children.get(nextLetter);
        // add whatever left in the queue into next node
        nextNode.add(letters);

    }

    public boolean hasAValue() {
        return Trie.nullValue != value;
    }

    public boolean isTheRoot() {
        return !hasAValue() && children.size() > 0;
    }

    public boolean isALeaf() {
        return !hasAValue() && !isTheRoot();
    }

    public String toString(int level) {
        String output = "";
        // -- Indent ourselves
        for (int i = 0; i < level; i++) {
            output += " ";
        }
        // -- Add pretty decorator
        output += "|-- ";
        // -- Add our value
        output += this.value;
        output += System.lineSeparator();

        for (TrieNode child : children.values()) {
            output += child.toString(level + 1);
        }

        // -- Add our children value
        return output;
    }

    public TrieNode getSubTree(Queue<Character> letters) {
        // _ - ANT
        // a - NT
        // ant - _
        // an - Q

        if (letters.isEmpty()) {
            return this;
        }

        char nextLetter = letters.remove();

        if (!children.containsKey(nextLetter)) {
            return null;
        }

        TrieNode nextNode = children.get(nextLetter);
        return nextNode.getSubTree(letters);
    }

    public List<String> getWords() {
        // i am T
        // return T, TEATER, THONY

        List<String> words = new ArrayList<>();

        if (isALeaf()) {
            words.add("");
            return words;
        }

        // -- Get the words for each child
        for (TrieNode child : children.values()) {
            List<String> childWords = child.getWords();
            // -- Add myself to the child's answers
            for (String word : childWords) {
                words.add(this.value + word);
            }
        }
        // -- Return the full set
        return words;
    }
}
