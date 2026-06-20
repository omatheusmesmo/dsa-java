package dev.omatheus.dsa.binary_search.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMinimumInRotatedSortedArrayTest {

    private final FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();

    @Test
    void basicCase() {
        assertEquals(1, solution.findMin(new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    void singleElement() {
        assertEquals(1, solution.findMin(new int[]{1}));
    }

    @Test
    void twoElements() {
        assertEquals(1, solution.findMin(new int[]{2, 1}));
        assertEquals(1, solution.findMin(new int[]{1, 2}));
    }

    @Test
    void noRotation() {
        assertEquals(1, solution.findMin(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void pivotAtStart() {
        assertEquals(1, solution.findMin(new int[]{5, 1, 2, 3, 4}));
    }

    @Test
    void pivotAtEnd() {
        assertEquals(1, solution.findMin(new int[]{2, 3, 4, 5, 1}));
    }

    @Test
    void largeArray() {
        int[] nums = new int[5000];
        for (int i = 0; i < 2500; i++) nums[i] = i + 2501;
        for (int i = 2500; i < 5000; i++) nums[i] = i - 2499;
        assertEquals(1, solution.findMin(nums));
    }
}
