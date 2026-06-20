package dev.omatheus.dsa.math.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTrailingZeroesTest {

    private final FactorialTrailingZeroes solution = new FactorialTrailingZeroes();

    @Test
    void basicCase() {
        assertEquals(1, solution.trailingZeroes(5));
    }

    @Test
    void zero() {
        assertEquals(0, solution.trailingZeroes(0));
    }

    @Test
    void one() {
        assertEquals(0, solution.trailingZeroes(1));
    }

    @Test
    void five() {
        assertEquals(1, solution.trailingZeroes(5));
    }

    @Test
    void ten() {
        assertEquals(2, solution.trailingZeroes(10));
    }

    @Test
    void twentyFive() {
        assertEquals(6, solution.trailingZeroes(25));
    }

    @Test
    void largeN() {
        assertEquals(2, solution.trailingZeroes(10));
    }
}
