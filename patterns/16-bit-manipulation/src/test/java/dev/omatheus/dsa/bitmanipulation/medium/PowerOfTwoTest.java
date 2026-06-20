package dev.omatheus.dsa.bitmanipulation.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {

    private final PowerOfTwo solution = new PowerOfTwo();

    @Test
    void basicTrue() {
        assertTrue(solution.isPowerOfTwo(1));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.isPowerOfTwo(3));
    }

    @Test
    void singleOne() {
        assertTrue(solution.isPowerOfTwo(2));
    }

    @Test
    void largePower() {
        assertTrue(solution.isPowerOfTwo(1024));
    }

    @Test
    void negativeNumber() {
        assertFalse(solution.isPowerOfTwo(-16));
    }

    @Test
    void zero() {
        assertFalse(solution.isPowerOfTwo(0));
    }

    @Test
    void one() {
        assertTrue(solution.isPowerOfTwo(1));
    }
}
