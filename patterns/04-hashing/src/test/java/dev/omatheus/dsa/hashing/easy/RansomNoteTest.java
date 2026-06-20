package dev.omatheus.dsa.hashing.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    private final RansomNote solution = new RansomNote();

    @Test
    void basicTrue() {
        assertTrue(solution.canConstruct("a", "b"));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.canConstruct("aa", "ab"));
    }

    @Test
    void singleChar() {
        assertTrue(solution.canConstruct("a", "a"));
    }

    @Test
    void allSameChars() {
        assertTrue(solution.canConstruct("aaa", "aaaa"));
    }

    @Test
    void magazineLonger() {
        assertTrue(solution.canConstruct("abc", "aabbcc"));
    }

    @Test
    void ransomNoteLonger() {
        assertFalse(solution.canConstruct("abc", "ab"));
    }

    @Test
    void exactMatch() {
        assertTrue(solution.canConstruct("abc", "abc"));
    }
}
