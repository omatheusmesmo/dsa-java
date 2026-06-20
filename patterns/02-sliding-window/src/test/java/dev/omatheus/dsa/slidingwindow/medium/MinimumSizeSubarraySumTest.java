package dev.omatheus.dsa.slidingwindow.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSizeSubarraySumTest {

    private final MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();

    @Test
    void basicCase() {
        assertEquals(2, solution.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    @Test
    void noSubarray() {
        assertEquals(0, solution.minSubArrayLen(11, new int[]{1, 1, 1, 1}));
    }

    @Test
    void exactSum() {
        assertEquals(3, solution.minSubArrayLen(6, new int[]{1, 2, 3}));
    }

    @Test
    void singleElement() {
        assertEquals(1, solution.minSubArrayLen(5, new int[]{5}));
    }

    @Test
    void entireArray() {
        assertEquals(3, solution.minSubArrayLen(6, new int[]{1, 2, 3}));
    }

    @Test
    void targetOne() {
        assertEquals(1, solution.minSubArrayLen(1, new int[]{1, 2, 3}));
    }

    @Test
    void largeArray() {
        int[] nums = new int[100000];
        for (int i = 0; i < 100000; i++) nums[i] = 1;
        assertEquals(1000, solution.minSubArrayLen(1000, nums));
    }
}
