package dev.omatheus.dsa.bitmanipulation.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    private final ReverseInteger solution = new ReverseInteger();

    @Test
    void basicCase() {
        assertEquals(321, solution.reverse(123));
    }

    @Test
    void negativeNumber() {
        assertEquals(-321, solution.reverse(-123));
    }

    @Test
    void trailingZeros() {
        assertEquals(21, solution.reverse(120));
    }

    @Test
    void overflow() {
        assertEquals(0, solution.reverse(1534236469));
    }

    @Test
    void singleDigit() {
        assertEquals(5, solution.reverse(5));
    }

    @Test
    void maxInt() {
        assertEquals(0, solution.reverse(Integer.MAX_VALUE));
    }

    @Test
    void minInt() {
        assertEquals(0, solution.reverse(Integer.MIN_VALUE));
    }
}
