package dev.omatheus.dsa.backtracking.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class PalindromePartitioningTest {

    private final PalindromePartitioning solution = new PalindromePartitioning();

    @Test
    void basicCase() {
        List<List<String>> result = solution.partition("aab");
        assertEquals(2, result.size());
    }

    @Test
    void singleChar() {
        List<List<String>> result = solution.partition("a");
        assertEquals(1, result.size());
        assertEquals(List.of("a"), result.get(0));
    }

    @Test
    void allSame() {
        List<List<String>> result = solution.partition("aaa");
        assertEquals(4, result.size());
    }

    @Test
    void noPalindrome() {
        List<List<String>> result = solution.partition("abc");
        assertEquals(3, result.size());
    }

    @Test
    void fullString() {
        List<List<String>> result = solution.partition("aba");
        assertEquals(2, result.size());
    }

    @Test
    void complexString() {
        List<List<String>> result = solution.partition("aabb");
        assertEquals(3, result.size());
    }
}
