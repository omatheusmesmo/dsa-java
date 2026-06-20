package dev.omatheus.dsa.tries.medium;

/**
 * <a href="https://leetcode.com/problems/implement-trie-prefix-tree/">208. Implement Trie (Prefix Tree)</a> (Medium)
 *
 * <p>Implement a trie with insert, search, and startsWith methods.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Trie trie = new Trie();
 * trie.insert("apple");
 * trie.search("apple");   // returns true
 * trie.search("app");     // returns false
 * trie.startsWith("app"); // returns true
 * trie.insert("app");
 * trie.search("app");     // returns true
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>1 <= word.length, prefix.length <= 2000</li>
 *   <li>word and prefix consist only of lowercase English letters</li>
 *   <li>At most 3 * 10^4 calls in total</li>
 * </ul>
 *
 * @see ImplementTrieTest
 */
public class ImplementTrie {

    private final TrieNode root;

    public ImplementTrie() {
        root = new TrieNode();
    }

    /**
     * Inserts a word into the trie.
     *
     * @param word the word to insert
     */
    public void insert(String word) {
        throw new UnsupportedOperationException("Solve this problem!");
    }

    /**
     * Returns true if the word is in the trie.
     *
     * @param word the word to search
     * @return true if the word exists
     */
    public boolean search(String word) {
        throw new UnsupportedOperationException("Solve this problem!");
    }

    /**
     * Returns true if there is any word in the trie that starts with the prefix.
     *
     * @param prefix the prefix to check
     * @return true if any word starts with the prefix
     */
    public boolean startsWith(String prefix) {
        throw new UnsupportedOperationException("Solve this problem!");
    }

    private static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }
}
