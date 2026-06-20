package dev.omatheus.dsa.greedy.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GasStationTest {

    private final GasStation solution = new GasStation();

    @Test
    void basicCase() {
        assertEquals(3, solution.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    void noSolution() {
        assertEquals(-1, solution.canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }

    @Test
    void singleStation() {
        assertEquals(0, solution.canCompleteCircuit(new int[]{5}, new int[]{4}));
    }

    @Test
    void twoStations() {
        assertEquals(0, solution.canCompleteCircuit(new int[]{3, 1}, new int[]{1, 2}));
    }

    @Test
    void allSame() {
        assertEquals(0, solution.canCompleteCircuit(new int[]{5, 5, 5}, new int[]{5, 5, 5}));
    }

    @Test
    void complex() {
        assertEquals(4, solution.canCompleteCircuit(new int[]{5, 1, 2, 3, 4}, new int[]{4, 4, 1, 5, 1}));
    }
}
