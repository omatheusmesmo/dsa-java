package dev.omatheus.dsa.dynamic_programming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    private final MaximumSubarray solution = new MaximumSubarray();

    @Test
    void basicCase() {
        assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    void allPositive() {
        assertEquals(10, solution.maxSubArray(new int[]{1, 2, 3, 4}));
    }

    @Test
    void allNegative() {
        assertEquals(-1, solution.maxSubArray(new int[]{-3, -2, -1, -4}));
    }

    @Test
    void singleElement() {
        assertEquals(5, solution.maxSubArray(new int[]{5}));
    }

    @Test
    void twoElements() {
        assertEquals(3, solution.maxSubArray(new int[]{-1, 3}));
    }

    @Test
    void mixed() {
        assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    void largeArray() {
        int[] nums = new int[10000];
        for (int i = 0; i < 10000; i++) nums[i] = i - 5000;
        assertEquals(12497500, solution.maxSubArray(nums));
    }
}
