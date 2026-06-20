package dev.omatheus.dsa.prefixsum.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarraySumEqualsKTest {

    private final SubarraySumEqualsK solution = new SubarraySumEqualsK();

    @Test
    void basicCase() {
        assertEquals(2, solution.subarraySum(new int[]{1, 1, 1}, 2));
    }

    @Test
    void singleElement() {
        assertEquals(1, solution.subarraySum(new int[]{5}, 5));
    }

    @Test
    void allZeros() {
        assertEquals(6, solution.subarraySum(new int[]{0, 0, 0}, 0));
    }

    @Test
    void negativeNumbers() {
        assertEquals(2, solution.subarraySum(new int[]{-1, -1, -1}, -2));
    }

    @Test
    void kZero() {
        assertEquals(3, solution.subarraySum(new int[]{1, -1, 1}, 0));
    }

    @Test
    void largeArray() {
        int[] nums = new int[20000];
        for (int i = 0; i < 20000; i++) nums[i] = 1;
        assertEquals(1, solution.subarraySum(nums, 20000));
    }

    @Test
    void allSameValue() {
        assertEquals(3, solution.subarraySum(new int[]{3, 3, 3}, 6));
    }
}
