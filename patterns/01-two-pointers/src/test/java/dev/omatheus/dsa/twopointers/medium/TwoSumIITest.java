package dev.omatheus.dsa.twopointers.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumIITest {

    private final TwoSumII solution = new TwoSumII();

    @Test
    void basicCase() {
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void negativeNumbers() {
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{-3, 3, 4, 90}, 0));
    }

    @Test
    void duplicateValues() {
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{2, 2, 11, 15}, 4));
    }

    @Test
    void largeNumbers() {
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{100000000, 200000000}, 300000000));
    }

    @Test
    void minimumArray() {
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{1, 2}, 3));
    }

    @Test
    void adjacentElements() {
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{1, 2, 3, 4}, 3));
    }
}
