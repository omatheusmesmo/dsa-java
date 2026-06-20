package dev.omatheus.dsa.hashing.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    private final ContainsDuplicate solution = new ContainsDuplicate();

    @Test
    void basicTrue() {
        assertTrue(solution.containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    void singleElement() {
        assertFalse(solution.containsDuplicate(new int[]{1}));
    }

    @Test
    void twoElementsDuplicate() {
        assertTrue(solution.containsDuplicate(new int[]{1, 1}));
    }

    @Test
    void twoElementsDistinct() {
        assertFalse(solution.containsDuplicate(new int[]{1, 2}));
    }

    @Test
    void allSame() {
        assertTrue(solution.containsDuplicate(new int[]{5, 5, 5, 5}));
    }

    @Test
    void largeArray() {
        int[] nums = new int[100000];
        for (int i = 0; i < 100000; i++) nums[i] = i;
        assertFalse(solution.containsDuplicate(nums));
    }
}
