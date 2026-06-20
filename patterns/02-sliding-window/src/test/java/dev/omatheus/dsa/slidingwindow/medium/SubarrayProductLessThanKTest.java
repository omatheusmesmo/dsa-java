package dev.omatheus.dsa.slidingwindow.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarrayProductLessThanKTest {

    private final SubarrayProductLessThanK solution = new SubarrayProductLessThanK();

    @Test
    void basicCase() {
        assertEquals(8, solution.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
    }

    @Test
    void kEqualsOne() {
        assertEquals(0, solution.numSubarrayProductLessThanK(new int[]{1, 2, 3}, 1));
    }

    @Test
    void allOnes() {
        assertEquals(10, solution.numSubarrayProductLessThanK(new int[]{1, 1, 1, 1, 1}, 2));
    }

    @Test
    void singleElement() {
        assertEquals(1, solution.numSubarrayProductLessThanK(new int[]{5}, 10));
    }

    @Test
    void twoElements() {
        assertEquals(3, solution.numSubarrayProductLessThanK(new int[]{2, 3}, 10));
    }

    @Test
    void largeProducts() {
        assertEquals(0, solution.numSubarrayProductLessThanK(new int[]{100, 100, 100}, 50));
    }

    @Test
    void kVeryLarge() {
        assertEquals(15, solution.numSubarrayProductLessThanK(new int[]{1, 2, 3, 4, 5}, 1000000));
    }
}
