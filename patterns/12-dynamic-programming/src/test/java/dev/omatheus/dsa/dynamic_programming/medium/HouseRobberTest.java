package dev.omatheus.dsa.dynamic_programming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    private final HouseRobber solution = new HouseRobber();

    @Test
    void basicCase() {
        assertEquals(4, solution.rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    void singleHouse() {
        assertEquals(10, solution.rob(new int[]{10}));
    }

    @Test
    void twoHouses() {
        assertEquals(2, solution.rob(new int[]{1, 2}));
    }

    @Test
    void allSame() {
        assertEquals(6, solution.rob(new int[]{2, 2, 2, 2}));
    }

    @Test
    void alternating() {
        assertEquals(5, solution.rob(new int[]{1, 3, 1, 3, 100}));
    }

    @Test
    void increasing() {
        assertEquals(12, solution.rob(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void allZero() {
        assertEquals(0, solution.rob(new int[]{0, 0, 0, 0}));
    }
}
