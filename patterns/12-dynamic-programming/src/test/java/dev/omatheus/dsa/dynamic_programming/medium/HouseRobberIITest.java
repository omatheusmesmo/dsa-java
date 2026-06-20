package dev.omatheus.dsa.dynamic_programming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HouseRobberIITest {

    private final HouseRobberII solution = new HouseRobberII();

    @Test
    void basicCase() {
        assertEquals(3, solution.rob(new int[]{2, 3, 2}));
    }

    @Test
    void singleHouse() {
        assertEquals(10, solution.rob(new int[]{10}));
    }

    @Test
    void twoHouses() {
        assertEquals(3, solution.rob(new int[]{1, 3}));
    }

    @Test
    void allSame() {
        assertEquals(4, solution.rob(new int[]{2, 2, 2, 2}));
    }

    @Test
    void alternating() {
        assertEquals(5, solution.rob(new int[]{1, 3, 1, 3, 100}));
    }

    @Test
    void circular() {
        assertEquals(3, solution.rob(new int[]{2, 3, 2}));
    }
}
