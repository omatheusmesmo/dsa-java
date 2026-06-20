package dev.omatheus.dsa.twopointers.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    private final ThreeSum solution = new ThreeSum();

    @Test
    void basicCase() {
        List<List<Integer>> result = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        assertEquals(2, result.size());
        assertTrue(result.contains(List.of(-1, -1, 2)));
        assertTrue(result.contains(List.of(-1, 0, 1)));
    }

    @Test
    void noSolution() {
        List<List<Integer>> result = solution.threeSum(new int[]{1, 2, 3});
        assertTrue(result.isEmpty());
    }

    @Test
    void allZeros() {
        List<List<Integer>> result = solution.threeSum(new int[]{0, 0, 0});
        assertEquals(1, result.size());
        assertTrue(result.contains(List.of(0, 0, 0)));
    }

    @Test
    void duplicateTriplets() {
        List<List<Integer>> result = solution.threeSum(new int[]{-2, -1, 0, 1, 2, -1, -2});
        assertEquals(3, result.size());
    }

    @Test
    void negativeNumbers() {
        List<List<Integer>> result = solution.threeSum(new int[]{-3, -2, -1, 0, 0, 1, 2, 3});
        assertEquals(4, result.size());
    }

    @Test
    void mixedPositiveNegative() {
        List<List<Integer>> result = solution.threeSum(new int[]{-1, 2, 1, -4});
        assertEquals(1, result.size());
        assertTrue(result.contains(List.of(-4, 2, 1)));
    }

    @Test
    void minimumArray() {
        List<List<Integer>> result = solution.threeSum(new int[]{0, 0, 0});
        assertEquals(1, result.size());
    }

    @Test
    void largeArray() {
        int[] nums = new int[3000];
        for (int i = 0; i < 3000; i++) {
            nums[i] = i - 1000;
        }
        List<List<Integer>> result = solution.threeSum(nums);
        assertFalse(result.isEmpty());
    }
}
