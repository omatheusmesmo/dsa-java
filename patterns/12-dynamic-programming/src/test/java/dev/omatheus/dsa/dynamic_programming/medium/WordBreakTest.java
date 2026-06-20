package dev.omatheus.dsa.dynamic_programming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class WordBreakTest {

    private final WordBreak solution = new WordBreak();

    @Test
    void basicTrue() {
        assertTrue(solution.wordBreak("leetcode", List.of("leet", "code")));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
    }

    @Test
    void singleWord() {
        assertTrue(solution.wordBreak("a", List.of("a")));
    }

    @Test
    void complexSentence() {
        assertTrue(solution.wordBreak("applepenapple", List.of("apple", "pen")));
    }

    @Test
    void noMatch() {
        assertFalse(solution.wordBreak("hello", List.of("world")));
    }

    @Test
    void fullMatch() {
        assertTrue(solution.wordBreak("aabb", List.of("a", "b", "aa", "bb", "aabb")));
    }
}
