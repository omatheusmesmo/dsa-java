package dev.omatheus.dsa.dynamic_programming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    private final LongestPalindromicSubstring solution = new LongestPalindromicSubstring();

    @Test
    void basicCase() {
        String result = solution.longestPalindrome("babad");
        assertTrue(result.equals("bab") || result.equals("aba"));
    }

    @Test
    void singleChar() {
        assertEquals("a", solution.longestPalindrome("a"));
    }

    @Test
    void allSame() {
        assertEquals("aaaa", solution.longestPalindrome("aaaa"));
    }

    @Test
    void noPalindrome() {
        String result = solution.longestPalindrome("abc");
        assertEquals(1, result.length());
    }

    @Test
    void evenLength() {
        String result = solution.longestPalindrome("cbbd");
        assertTrue(result.equals("bb"));
    }

    @Test
    void oddLength() {
        String result = solution.longestPalindrome("racecar");
        assertEquals("racecar", result);
    }

    @Test
    void complexString() {
        String result = solution.longestPalindrome("abacab");
        assertEquals("bacab", result);
    }
}
