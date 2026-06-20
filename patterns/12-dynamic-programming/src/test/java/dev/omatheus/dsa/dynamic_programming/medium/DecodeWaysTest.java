package dev.omatheus.dsa.dynamic_programming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecodeWaysTest {

    private final DecodeWays solution = new DecodeWays();

    @Test
    void basicCase() {
        assertEquals(3, solution.numDecodings("226"));
    }

    @Test
    void singleDigit() {
        assertEquals(1, solution.numDecodings("1"));
    }

    @Test
    void doubleDigit() {
        assertEquals(2, solution.numDecodings("12"));
    }

    @Test
    void leadingZero() {
        assertEquals(0, solution.numDecodings("0"));
    }

    @Test
    void allZeros() {
        assertEquals(0, solution.numDecodings("00"));
    }

    @Test
    void complexString() {
        assertEquals(1, solution.numDecodings("27"));
    }
}
