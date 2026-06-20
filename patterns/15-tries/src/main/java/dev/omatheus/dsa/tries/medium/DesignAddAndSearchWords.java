package dev.omatheus.dsa.tries.medium;

/**
 * <a href="https://leetcode.com/problems/design-add-and-search-words-data-structure/">211. Design Add and Search Words Data Structure</a> (Medium)
 *
 * <p>Design a data structure that supports adding words and searching for words with '.' as wildcard.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * WordDictionary dict = new WordDictionary();
 * dict.addWord("bad");
 * dict.addWord("dad");
 * dict.addWord("mad");
 * dict.search("pad"); // returns false
 * dict.search("bad"); // returns true
 * dict.search(".ad"); // returns true
 * dict.search("b.."); // returns true
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>1 <= word.length, prefix.length <= 25</li>
 *   <li>word and prefix consist of lowercase English letters or '.'</li>
 *   <li>At most 3 * 10^4 calls in total</li>
 * </ul>
 *
 * @see DesignAddAndSearchWordsTest
 */
public class DesignAddAndSearchWords {

    private final TrieNode root;

    public DesignAddAndSearchWords() {
        root = new TrieNode();
    }

    /**
     * Adds a word to the data structure.
     *
     * @param word the word to add
     */
    public void addWord(String word) {
        throw new UnsupportedOperationException("Solve this problem!");
    }

    /**
     * Returns true if the word matches (including wildcards with '.').
     *
     * @param word the word or pattern to search
     * @return true if a match is found
     */
    public boolean search(String word) {
        throw new UnsupportedOperationException("Solve this problem!");
    }

    private static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }
}
