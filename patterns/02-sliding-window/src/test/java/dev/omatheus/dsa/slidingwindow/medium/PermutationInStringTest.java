package dev.omatheus.dsa.slidingwindow.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest {

    private final PermutationInString solution = new PermutationInString();

    @Test
    void basicTrue() {
        assertTrue(solution.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.checkInclusion("ab", "eidboaoo"));
    }

    @Test
    void sameStrings() {
        assertTrue(solution.checkInclusion("abc", "abc"));
    }

    @Test
    void s1LongerThanS2() {
        assertFalse(solution.checkInclusion("abc", "ab"));
    }

    @Test
    void singleChar() {
        assertTrue(solution.checkInclusion("a", "a"));
    }

    @Test
    void allSameChars() {
        assertTrue(solution.checkInclusion("aaa", "aaaa"));
    }

    @Test
    void noMatch() {
        assertFalse(solution.checkInclusion("abc", "xyz"));
    }

    @Test
    void exactMatch() {
        assertTrue(solution.checkInclusion("abc", "cba"));
    }
}
