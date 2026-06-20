package dev.omatheus.dsa.twopointers.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {

    private final TrappingRainWater solution = new TrappingRainWater();

    @Test
    void basicCase() {
        assertEquals(6, solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    void noWater() {
        assertEquals(0, solution.trap(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void allSameHeight() {
        assertEquals(0, solution.trap(new int[]{3, 3, 3, 3}));
    }

    @Test
    void decreasingHeights() {
        assertEquals(0, solution.trap(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    void increasingHeights() {
        assertEquals(0, solution.trap(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void singlePeak() {
        assertEquals(4, solution.trap(new int[]{0, 2, 0}));
    }

    @Test
    void twoElements() {
        assertEquals(0, solution.trap(new int[]{1, 1}));
    }

    @Test
    void allZero() {
        assertEquals(0, solution.trap(new int[]{0, 0, 0, 0}));
    }

    @Test
    void largeArray() {
        int[] height = new int[10000];
        for (int i = 0; i < 10000; i++) {
            height[i] = i % 2 == 0 ? 0 : 1;
        }
        assertEquals(0, solution.trap(height));
    }
}
