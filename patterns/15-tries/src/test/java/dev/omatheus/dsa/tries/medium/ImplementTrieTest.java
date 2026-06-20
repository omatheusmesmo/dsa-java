package dev.omatheus.dsa.tries.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImplementTrieTest {

    @Test
    void basicInsertSearch() {
        ImplementTrie trie = new ImplementTrie();
        trie.insert("apple");
        assertTrue(trie.search("apple"));
        assertFalse(trie.search("app"));
    }

    @Test
    void prefixSearch() {
        ImplementTrie trie = new ImplementTrie();
        trie.insert("apple");
        assertTrue(trie.startsWith("app"));
        assertFalse(trie.startsWith("apl"));
    }

    @Test
    void emptyString() {
        ImplementTrie trie = new ImplementTrie();
        trie.insert("");
        assertTrue(trie.search(""));
        assertTrue(trie.startsWith(""));
    }

    @Test
    void singleChar() {
        ImplementTrie trie = new ImplementTrie();
        trie.insert("a");
        assertTrue(trie.search("a"));
        assertFalse(trie.search("b"));
        assertTrue(trie.startsWith("a"));
    }

    @Test
    void multipleWords() {
        ImplementTrie trie = new ImplementTrie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("application");
        assertTrue(trie.search("apple"));
        assertTrue(trie.search("app"));
        assertTrue(trie.search("application"));
        assertFalse(trie.search("ap"));
    }

    @Test
    void overlappingPrefixes() {
        ImplementTrie trie = new ImplementTrie();
        trie.insert("abc");
        trie.insert("ab");
        trie.insert("a");
        assertTrue(trie.startsWith("a"));
        assertTrue(trie.startsWith("ab"));
        assertTrue(trie.startsWith("abc"));
    }
}
