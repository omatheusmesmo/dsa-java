package dev.omatheus.dsa.bitmanipulation.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    private final SingleNumber solution = new SingleNumber();

    @Test
    void basicCase() {
        assertEquals(1, solution.singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    void singleElement() {
        assertEquals(5, solution.singleNumber(new int[]{5}));
    }

    @Test
    void twoElements() {
        assertEquals(1, solution.singleNumber(new int[]{1, 2}));
    }

    @Test
    void threeElements() {
        assertEquals(2, solution.singleNumber(new int[]{1, 1, 2}));
    }

    @Test
    void allSameExceptOne() {
        assertEquals(5, solution.singleNumber(new int[]{3, 3, 3, 3, 5}));
    }

    @Test
    void negativeNumbers() {
        assertEquals(-2, solution.singleNumber(new int[]{-1, -1, -2}));
    }
}
