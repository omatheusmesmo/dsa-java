package dev.omatheus.dsa.dynamic_programming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceTest {

    private final LongestCommonSubsequence solution = new LongestCommonSubsequence();

    @Test
    void basicCase() {
        assertEquals(3, solution.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    void noCommon() {
        assertEquals(0, solution.longestCommonSubsequence("abc", "def"));
    }

    @Test
    void allSame() {
        assertEquals(3, solution.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    void singleChar() {
        assertEquals(1, solution.longestCommonSubsequence("a", "a"));
        assertEquals(0, solution.longestCommonSubsequence("a", "b"));
    }

    @Test
    void emptyString() {
        assertEquals(0, solution.longestCommonSubsequence("", "abc"));
    }

    @Test
    void complexStrings() {
        assertEquals(3, solution.longestCommonSubsequence("abcad", "bcda"));
    }
}
