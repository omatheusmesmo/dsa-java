package dev.omatheus.dsa.dynamic_programming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TargetSumTest {

    private final TargetSum solution = new TargetSum();

    @Test
    void basicCase() {
        assertEquals(5, solution.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }

    @Test
    void singleElement() {
        assertEquals(1, solution.findTargetSumWays(new int[]{1}, 1));
        assertEquals(1, solution.findTargetSumWays(new int[]{1}, -1));
    }

    @Test
    void allSame() {
        assertEquals(1, solution.findTargetSumWays(new int[]{1, 1, 1}, 3));
    }

    @Test
    void zeroTarget() {
        assertEquals(2, solution.findTargetSumWays(new int[]{1, 1}, 0));
    }

    @Test
    void largeTarget() {
        assertEquals(0, solution.findTargetSumWays(new int[]{1, 2, 3}, 10));
    }

    @Test
    void negativeNumbers() {
        assertEquals(5, solution.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }
}
