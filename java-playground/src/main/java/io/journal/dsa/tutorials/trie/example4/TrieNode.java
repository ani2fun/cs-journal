package io.journal.dsa.tutorials.trie.example4;

import java.util.HashMap;

public class TrieNode {

    char aChar;
    HashMap<Character, TrieNode> children;
    boolean isEnd;

    TrieNode(char c) {
        this.aChar = c;
        this.children = new HashMap<>();
        this.isEnd = false;
    }
}
