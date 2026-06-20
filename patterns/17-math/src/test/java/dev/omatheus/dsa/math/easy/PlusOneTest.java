package dev.omatheus.dsa.math.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    private final PlusOne solution = new PlusOne();

    @Test
    void basicCase() {
        assertArrayEquals(new int[]{1, 2, 4}, solution.plusOne(new int[]{1, 2, 3}));
    }

    @Test
    void carryOver() {
        assertArrayEquals(new int[]{1, 3, 0}, solution.plusOne(new int[]{1, 2, 9}));
    }

    @Test
    void allNines() {
        assertArrayEquals(new int[]{1, 0, 0, 0}, solution.plusOne(new int[]{9, 9, 9}));
    }

    @Test
    void singleDigit() {
        assertArrayEquals(new int[]{1}, solution.plusOne(new int[]{0}));
    }

    @Test
    void twoDigits() {
        assertArrayEquals(new int[]{2, 0}, solution.plusOne(new int[]{1, 9}));
    }

    @Test
    void largeNumber() {
        assertArrayEquals(new int[]{1, 0, 0, 0, 0}, solution.plusOne(new int[]{9, 9, 9, 9}));
    }
}
