package dev.omatheus.dsa.dynamic_programming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InterleavingStringTest {

    private final InterleavingString solution = new InterleavingString();

    @Test
    void basicTrue() {
        assertTrue(solution.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }

    @Test
    void differentLengths() {
        assertFalse(solution.isInterleave("abc", "def", "abcdefg"));
    }

    @Test
    void emptyStrings() {
        assertTrue(solution.isInterleave("", "", ""));
    }

    @Test
    void singleChar() {
        assertTrue(solution.isInterleave("a", "b", "ab"));
    }

    @Test
    void complexInterleave() {
        assertTrue(solution.isInterleave("ab", "cd", "acbd"));
    }
}
