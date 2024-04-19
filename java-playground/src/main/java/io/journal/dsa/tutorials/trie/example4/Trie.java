package io.journal.dsa.tutorials.trie.example4;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

// Run Time O(mN), m is size of word and N size of alphabet
public class Trie {

    // Consider root node as empty space char
    final private TrieNode root = new TrieNode(' ');

    //Add a word to trie, Iteration, Time O(m), Space O(m), m is word length
    public void addword(String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            if (!node.children.containsKey(ch))
                node.children.put(ch, new TrieNode(ch));
            node = node.children.get(ch);
        }
        // Mark end of the node true when it is word
        node.isEnd = true;
    }

    List<String> autocomplete(String prefix) {
        List<String> result = new LinkedList<>();

        TrieNode node = root;

        for (char ch : prefix.toCharArray()) {
            if (node.children.containsKey(ch))
                node = node.children.get(ch);
            else
                return result;
        }

        helper(node, result, prefix.substring(0, prefix.length() - 1));

        return result;
    }

    // Find first 4 words with given prefix. Recursive function called by autocomplete
    void helper(TrieNode node, List<String> result, String prefix) {
        if (node.isEnd)
            result.add(prefix + node.aChar);

        //we are interested in top 4 result values hence return result when list size becomes 4
        if (result.size() >= 4)
            return;

        // Sort keys here to get our results sorted
        List<Character> sortedKeys = node.children
                .keySet()
                .stream()
                .sorted()
                .collect(Collectors.toList());

        for (Character ch : sortedKeys)
            helper(node.children.get(ch), result, prefix + node.aChar);
    }

}