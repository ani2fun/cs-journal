package io.journal.dsa.tutorials.trie.example1;

public class TrieTest {

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("hello");
        trie.insert("world");
        trie.insert("aniket");

        String word = "world";
        System.out.println(trie.search(word));
    }
}
