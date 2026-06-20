package dev.omatheus.dsa.bitmanipulation.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SingleNumberIITest {

    private final SingleNumberII solution = new SingleNumberII();

    @Test
    void basicCase() {
        assertEquals(3, solution.singleNumber(new int[]{2, 2, 3, 2}));
    }

    @Test
    void singleElement() {
        assertEquals(5, solution.singleNumber(new int[]{5}));
    }

    @Test
    void allThreeTimes() {
        assertEquals(1, solution.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99}));
    }

    @Test
    void negativeNumbers() {
        assertEquals(-2, solution.singleNumber(new int[]{-1, -1, -1, -2}));
    }

    @Test
    void mixedSigns() {
        assertEquals(0, solution.singleNumber(new int[]{1, 1, 1, 0}));
    }
}
