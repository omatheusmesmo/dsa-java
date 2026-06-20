package dev.omatheus.dsa.hashing.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private final TwoSum solution = new TwoSum();

    @Test
    void basicCase() {
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void middleElements() {
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    void duplicateValues() {
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{3, 3}, 6));
    }

    @Test
    void negativeNumbers() {
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{-1, -2, -3, -4, -5}, -8));
    }

    @Test
    void minimumArray() {
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{1, 2}, 3));
    }

    @Test
    void largeNumbers() {
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{1000000000, 5, 1000000000}, 2000000000));
    }
}
