package dev.omatheus.dsa.twopointers.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    private final IsSubsequence solution = new IsSubsequence();

    @Test
    void basicTrue() {
        assertTrue(solution.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    void emptyS() {
        assertTrue(solution.isSubsequence("", "ahbgdc"));
    }

    @Test
    void emptyT() {
        assertFalse(solution.isSubsequence("abc", ""));
    }

    @Test
    void sLongerThanT() {
        assertFalse(solution.isSubsequence("abc", "ab"));
    }

    @Test
    void singleCharMatch() {
        assertTrue(solution.isSubsequence("a", "a"));
    }

    @Test
    void singleCharNoMatch() {
        assertFalse(solution.isSubsequence("a", "b"));
    }

    @Test
    void identicalStrings() {
        assertTrue(solution.isSubsequence("abc", "abc"));
    }

    @Test
    void allSameChars() {
        assertTrue(solution.isSubsequence("aaa", "aaaaa"));
    }
}
