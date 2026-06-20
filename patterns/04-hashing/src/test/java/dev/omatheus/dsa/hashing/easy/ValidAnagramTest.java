package dev.omatheus.dsa.hashing.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    private final ValidAnagram solution = new ValidAnagram();

    @Test
    void basicTrue() {
        assertTrue(solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.isAnagram("rat", "car"));
    }

    @Test
    void differentLengths() {
        assertFalse(solution.isAnagram("abc", "abcd"));
    }

    @Test
    void sameCharsDifferentOrder() {
        assertTrue(solution.isAnagram("listen", "silent"));
    }

    @Test
    void singleChar() {
        assertTrue(solution.isAnagram("a", "a"));
    }

    @Test
    void emptyStrings() {
        assertTrue(solution.isAnagram("", ""));
    }

    @Test
    void allSameChars() {
        assertTrue(solution.isAnagram("aaa", "aaa"));
    }

    @Test
    void differentCase() {
        assertFalse(solution.isAnagram("A", "a"));
    }
}
