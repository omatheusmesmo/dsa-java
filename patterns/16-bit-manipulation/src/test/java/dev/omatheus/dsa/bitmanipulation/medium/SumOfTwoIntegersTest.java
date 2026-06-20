package dev.omatheus.dsa.bitmanipulation.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoIntegersTest {

    private final SumOfTwoIntegers solution = new SumOfTwoIntegers();

    @Test
    void basicCase() {
        assertEquals(3, solution.getSum(1, 2));
    }

    @Test
    void bothPositive() {
        assertEquals(10, solution.getSum(4, 6));
    }

    @Test
    void bothNegative() {
        assertEquals(-10, solution.getSum(-4, -6));
    }

    @Test
    void onePositive() {
        assertEquals(0, solution.getSum(-5, 5));
    }

    @Test
    void zeros() {
        assertEquals(0, solution.getSum(0, 0));
    }

    @Test
    void largeNumbers() {
        assertEquals(1999, solution.getSum(1000, 999));
    }

    @Test
    void overflow() {
        assertEquals(-2147483648, solution.getSum(Integer.MAX_VALUE, 1));
    }
}
