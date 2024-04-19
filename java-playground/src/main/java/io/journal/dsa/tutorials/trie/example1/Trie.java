package io.journal.dsa.tutorials.trie.example1;

public class Trie {

    private TrieNode root;

    // Initialise data structure
    public Trie() {
        root = new TrieNode(Character.MIN_VALUE);
    }

    // Insert a word into Tri
    public void insert(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i); // check current already has node at character

            if ( current.children[character - 'a'] == null) current.children[character - 'a'] = new TrieNode(character);

            current = current.children[character - 'a'];
        }

        current.isKeyWord = true;

    }

    public boolean search(String word) {
        TrieNode node = getNode(word);
        return node != null && node.isKeyWord;
    }

    public boolean startsWith(String prefix) {
        return getNode(prefix) != null;
    }

    private TrieNode getNode(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (current.children == null) return null;
            current = current.children[c - 'a'];
        }
        return current;
    }

}
