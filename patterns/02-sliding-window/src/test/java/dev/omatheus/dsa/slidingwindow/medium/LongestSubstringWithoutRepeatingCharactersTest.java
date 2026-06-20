package dev.omatheus.dsa.slidingwindow.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void basicCase() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void allUnique() {
        assertEquals(4, solution.lengthOfLongestSubstring("abcd"));
    }

    @Test
    void allSame() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbb"));
    }

    @Test
    void emptyString() {
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }

    @Test
    void singleChar() {
        assertEquals(1, solution.lengthOfLongestSubstring("a"));
    }

    @Test
    void withSpaces() {
        assertEquals(5, solution.lengthOfLongestSubstring("hello world"));
    }

    @Test
    void withNumbers() {
        assertEquals(3, solution.lengthOfLongestSubstring("abc123"));
    }

    @Test
    void fullAlphabet() {
        assertEquals(26, solution.lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyz"));
    }
}
