package dev.omatheus.dsa.dynamic_programming.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {

    private final MinCostClimbingStairs solution = new MinCostClimbingStairs();

    @Test
    void basicCase() {
        assertEquals(15, solution.minCostClimbingStairs(new int[]{10, 15, 20}));
    }

    @Test
    void twoSteps() {
        assertEquals(15, solution.minCostClimbingStairs(new int[]{10, 15}));
    }

    @Test
    void allSame() {
        assertEquals(20, solution.minCostClimbingStairs(new int[]{20, 20, 20}));
    }

    @Test
    void increasing() {
        assertEquals(15, solution.minCostClimbingStairs(new int[]{10, 15, 20, 25}));
    }

    @Test
    void decreasing() {
        assertEquals(10, solution.minCostClimbingStairs(new int[]{25, 20, 15, 10}));
    }

    @Test
    void singleStep() {
        assertEquals(0, solution.minCostClimbingStairs(new int[]{10}));
    }

    @Test
    void largeCost() {
        assertEquals(0, solution.minCostClimbingStairs(new int[]{0, 0, 0}));
    }
}
