package dev.omatheus.dsa.dynamic_programming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumProductSubarrayTest {

    private final MaximumProductSubarray solution = new MaximumProductSubarray();

    @Test
    void basicCase() {
        assertEquals(6, solution.maxProduct(new int[]{2, 3, -2, 4}));
    }

    @Test
    void singleElement() {
        assertEquals(3, solution.maxProduct(new int[]{3}));
    }

    @Test
    void allPositive() {
        assertEquals(24, solution.maxProduct(new int[]{1, 2, 3, 4}));
    }

    @Test
    void allNegative() {
        assertEquals(24, solution.maxProduct(new int[]{-2, -3, -4}));
    }

    @Test
    void withZero() {
        assertEquals(2, solution.maxProduct(new int[]{-2, 0, -1}));
    }

    @Test
    void mixed() {
        assertEquals(12, solution.maxProduct(new int[]{2, -5, -2, -4, 3}));
    }

    @Test
    void twoElements() {
        assertEquals(6, solution.maxProduct(new int[]{2, 3}));
        assertEquals(6, solution.maxProduct(new int[]{-2, -3}));
    }
}
