package dev.omatheus.dsa.hashing.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {

    private final LongestConsecutiveSequence solution = new LongestConsecutiveSequence();

    @Test
    void basicCase() {
        assertEquals(4, solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }

    @Test
    void emptyArray() {
        assertEquals(0, solution.longestConsecutive(new int[]{}));
    }

    @Test
    void singleElement() {
        assertEquals(1, solution.longestConsecutive(new int[]{1}));
    }

    @Test
    void noConsecutive() {
        assertEquals(1, solution.longestConsecutive(new int[]{10, 20, 30}));
    }

    @Test
    void allConsecutive() {
        assertEquals(5, solution.longestConsecutive(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void duplicates() {
        assertEquals(4, solution.longestConsecutive(new int[]{1, 2, 2, 3, 4}));
    }

    @Test
    void negativeNumbers() {
        assertEquals(4, solution.longestConsecutive(new int[]{-3, -2, -1, 0, 1}));
    }

    @Test
    void largeArray() {
        int[] nums = new int[100000];
        for (int i = 0; i < 100000; i++) nums[i] = i;
        assertEquals(100000, solution.longestConsecutive(nums));
    }
}
