package dev.omatheus.dsa.dynamic_programming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequenceTest {

    private final LongestIncreasingSubsequence solution = new LongestIncreasingSubsequence();

    @Test
    void basicCase() {
        assertEquals(4, solution.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

    @Test
    void allSame() {
        assertEquals(1, solution.lengthOfLIS(new int[]{1, 1, 1, 1}));
    }

    @Test
    void decreasing() {
        assertEquals(1, solution.lengthOfLIS(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    void increasing() {
        assertEquals(5, solution.lengthOfLIS(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void singleElement() {
        assertEquals(1, solution.lengthOfLIS(new int[]{1}));
    }

    @Test
    void duplicates() {
        assertEquals(3, solution.lengthOfLIS(new int[]{1, 3, 6, 7, 9, 4, 10, 5, 6}));
    }

    @Test
    void negativeNumbers() {
        assertEquals(4, solution.lengthOfLIS(new int[]{-2, -1, 0, 1, 2}));
    }
}
