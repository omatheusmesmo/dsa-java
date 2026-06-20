package dev.omatheus.dsa.slidingwindow.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestRepeatingCharacterReplacementTest {

    private final LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();

    @Test
    void basicCase() {
        assertEquals(4, solution.characterReplacement("AABABBA", 1));
    }

    @Test
    void kEqualsLength() {
        assertEquals(5, solution.characterReplacement("ABCDE", 5));
    }

    @Test
    void singleChar() {
        assertEquals(1, solution.characterReplacement("A", 1));
    }

    @Test
    void noReplacementNeeded() {
        assertEquals(3, solution.characterReplacement("AAA", 0));
    }

    @Test
    void allDifferent() {
        assertEquals(2, solution.characterReplacement("ABCD", 1));
    }

    @Test
    void twoChars() {
        assertEquals(3, solution.characterReplacement("ABAB", 2));
    }

    @Test
    void kZero() {
        assertEquals(1, solution.characterReplacement("ABC", 0));
    }
}
