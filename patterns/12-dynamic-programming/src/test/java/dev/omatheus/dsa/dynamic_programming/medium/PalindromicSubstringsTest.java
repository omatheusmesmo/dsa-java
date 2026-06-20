package dev.omatheus.dsa.dynamic_programming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromicSubstringsTest {

    private final PalindromicSubstrings solution = new PalindromicSubstrings();

    @Test
    void basicCase() {
        assertEquals(3, solution.countSubstrings("abc"));
    }

    @Test
    void singleChar() {
        assertEquals(1, solution.countSubstrings("a"));
    }

    @Test
    void allSame() {
        assertEquals(10, solution.countSubstrings("aaaa"));
    }

    @Test
    void noPalindrome() {
        assertEquals(4, solution.countSubstrings("abcd"));
    }

    @Test
    void evenLength() {
        assertEquals(6, solution.countSubstrings("aabb"));
    }

    @Test
    void oddLength() {
        assertEquals(9, solution.countSubstrings("aaa"));
    }
}
