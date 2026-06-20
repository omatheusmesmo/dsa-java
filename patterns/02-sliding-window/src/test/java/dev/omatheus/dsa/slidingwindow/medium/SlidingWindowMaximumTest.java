package dev.omatheus.dsa.slidingwindow.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMaximumTest {

    private final SlidingWindowMaximum solution = new SlidingWindowMaximum();

    @Test
    void basicCase() {
        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, solution.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
    }

    @Test
    void singleElement() {
        assertArrayEquals(new int[]{1}, solution.maxSlidingWindow(new int[]{1}, 1));
    }

    @Test
    void kEqualsLength() {
        assertArrayEquals(new int[]{7}, solution.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 8));
    }

    @Test
    void allSame() {
        assertArrayEquals(new int[]{5, 5, 5, 5}, solution.maxSlidingWindow(new int[]{5, 5, 5, 5}, 2));
    }

    @Test
    void increasing() {
        assertArrayEquals(new int[]{2, 3, 4, 5}, solution.maxSlidingWindow(new int[]{1, 2, 3, 4, 5}, 2));
    }

    @Test
    void decreasing() {
        assertArrayEquals(new int[]{5, 4, 3, 2}, solution.maxSlidingWindow(new int[]{5, 4, 3, 2, 1}, 2));
    }

    @Test
    void alternating() {
        assertArrayEquals(new int[]{2, 2, 2}, solution.maxSlidingWindow(new int[]{1, 2, 1, 2, 1}, 3));
    }

    @Test
    void withNegatives() {
        assertArrayEquals(new int[]{-1, -1, 3, 3}, solution.maxSlidingWindow(new int[]{-7, -3, -1, -3, 3, 3}, 3));
    }
}
