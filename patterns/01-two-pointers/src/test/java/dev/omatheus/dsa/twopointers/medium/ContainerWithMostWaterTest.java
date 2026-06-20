package dev.omatheus.dsa.twopointers.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    private final ContainerWithMostWater solution = new ContainerWithMostWater();

    @Test
    void basicCase() {
        assertEquals(49, solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    void decreasingHeights() {
        assertEquals(6, solution.maxArea(new int[]{6, 5, 4, 3, 2, 1}));
    }

    @Test
    void increasingHeights() {
        assertEquals(6, solution.maxArea(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    void sameHeights() {
        assertEquals(15, solution.maxArea(new int[]{5, 5, 5, 5, 5}));
    }

    @Test
    void twoElements() {
        assertEquals(1, solution.maxArea(new int[]{1, 1}));
    }

    @Test
    void allSameValue() {
        assertEquals(25, solution.maxArea(new int[]{5, 5, 5, 5, 5}));
    }

    @Test
    void largeValues() {
        assertEquals(100000000, solution.maxArea(new int[]{100000, 100000, 100000}));
    }
}
