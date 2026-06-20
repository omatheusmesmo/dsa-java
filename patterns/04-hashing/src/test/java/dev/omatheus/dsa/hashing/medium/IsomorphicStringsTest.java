package dev.omatheus.dsa.hashing.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {

    private final IsomorphicStrings solution = new IsomorphicStrings();

    @Test
    void basicTrue() {
        assertTrue(solution.isIsomorphic("egg", "add"));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.isIsomorphic("foo", "bar"));
    }

    @Test
    void differentLengths() {
        assertFalse(solution.isIsomorphic("abc", "ab"));
    }

    @Test
    void singleChar() {
        assertTrue(solution.isIsomorphic("a", "a"));
    }

    @Test
    void allSameChars() {
        assertTrue(solution.isIsomorphic("aaa", "bbb"));
    }

    @Test
    void withNumbers() {
        assertTrue(solution.isIsomorphic("12", "34"));
    }

    @Test
    void withSpecialChars() {
        assertTrue(solution.isIsomorphic("a!b", "c@d"));
    }
}
