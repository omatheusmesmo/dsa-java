package dev.omatheus.dsa.graphs.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfProvincesTest {

    private final NumberOfProvinces solution = new NumberOfProvinces();

    @Test
    void basicCase() {
        assertEquals(2, solution.findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
    }

    @Test
    void allConnected() {
        assertEquals(1, solution.findCircleNum(new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}));
    }

    @Test
    void noConnections() {
        assertEquals(3, solution.findCircleNum(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
    }

    @Test
    void singleCity() {
        assertEquals(1, solution.findCircleNum(new int[][]{{1}}));
    }

    @Test
    void complexGraph() {
        assertEquals(2, solution.findCircleNum(new int[][]{{1, 1, 0, 0}, {1, 1, 0, 0}, {0, 0, 1, 1}, {0, 0, 1, 1}}));
    }
}
