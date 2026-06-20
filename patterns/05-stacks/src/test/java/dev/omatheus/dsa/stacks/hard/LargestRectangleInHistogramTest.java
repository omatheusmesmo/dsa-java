package dev.omatheus.dsa.stacks.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestRectangleInHistogramTest {

    private final LargestRectangleInHistogram solution = new LargestRectangleInHistogram();

    @Test
    void basicCase() {
        assertEquals(10, solution.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
    }

    @Test
    void increasing() {
        assertEquals(9, solution.largestRectangleArea(new int[]{1, 2, 3}));
    }

    @Test
    void decreasing() {
        assertEquals(9, solution.largestRectangleArea(new int[]{3, 2, 1}));
    }

    @Test
    void allSame() {
        assertEquals(15, solution.largestRectangleArea(new int[]{3, 3, 3, 3, 3}));
    }

    @Test
    void singleBar() {
        assertEquals(5, solution.largestRectangleArea(new int[]{5}));
    }

    @Test
    void twoBars() {
        assertEquals(4, solution.largestRectangleArea(new int[]{2, 2}));
    }

    @Test
    void withValleys() {
        assertEquals(6, solution.largestRectangleArea(new int[]{1, 3, 2, 1, 2}));
    }

    @Test
    void withPeaks() {
        assertEquals(10, solution.largestRectangleArea(new int[]{1, 5, 1, 5, 1}));
    }

    @Test
    void allZeros() {
        assertEquals(0, solution.largestRectangleArea(new int[]{0, 0, 0}));
    }
}
