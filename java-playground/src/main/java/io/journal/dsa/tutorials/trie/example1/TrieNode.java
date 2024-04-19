package io.journal.dsa.tutorials.trie.example1;

public class TrieNode {
    public char c;
    public boolean isKeyWord;
    public TrieNode[] children;

    public TrieNode(char c) {
        this.c = c;
        isKeyWord = false;
        children = new TrieNode[26];
    }
}
