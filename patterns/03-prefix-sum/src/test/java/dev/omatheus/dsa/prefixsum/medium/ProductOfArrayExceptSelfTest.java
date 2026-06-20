package dev.omatheus.dsa.prefixsum.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();

    @Test
    void basicCase() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, solution.productExceptSelf(new int[]{1, 2, 3, 4}));
    }

    @Test
    void withZero() {
        assertArrayEquals(new int[]{0, 0, 4, 0}, solution.productExceptSelf(new int[]{1, 2, 0, 4}));
    }

    @Test
    void withNegative() {
        assertArrayEquals(new int[]{-6, 3, 2, -1}, solution.productExceptSelf(new int[]{1, -2, 3, -4}));
    }

    @Test
    void twoElements() {
        assertArrayEquals(new int[]{2, 1}, solution.productExceptSelf(new int[]{1, 2}));
    }

    @Test
    void allOnes() {
        assertArrayEquals(new int[]{1, 1, 1}, solution.productExceptSelf(new int[]{1, 1, 1}));
    }

    @Test
    void largeNumbers() {
        assertArrayEquals(new int[]{30, 24, 20, 15}, solution.productExceptSelf(new int[]{2, 3, 4, 5}));
    }

    @Test
    void singleZero() {
        assertArrayEquals(new int[]{0, 0, 0}, solution.productExceptSelf(new int[]{0, 1, 2}));
    }
}
