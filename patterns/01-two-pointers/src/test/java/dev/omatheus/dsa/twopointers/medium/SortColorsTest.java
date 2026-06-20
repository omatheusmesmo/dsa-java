package dev.omatheus.dsa.twopointers.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortColorsTest {

    private final SortColors solution = new SortColors();

    @Test
    void allZeros() {
        int[] nums = {0, 0, 0};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 0}, nums);
    }

    @Test
    void allOnes() {
        int[] nums = {1, 1, 1};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{1, 1, 1}, nums);
    }

    @Test
    void allTwos() {
        int[] nums = {2, 2, 2};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{2, 2, 2}, nums);
    }

    @Test
    void mixed() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    @Test
    void singleElement() {
        int[] nums = {1};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{1}, nums);
    }

    @Test
    void twoElements() {
        int[] nums = {2, 0};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 2}, nums);
    }

    @Test
    void alreadySorted() {
        int[] nums = {0, 1, 2};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 1, 2}, nums);
    }

    @Test
    void reverseSorted() {
        int[] nums = {2, 1, 0};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 1, 2}, nums);
    }
}
