package dev.omatheus.dsa.graphs.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RedundantConnectionTest {

    private final RedundantConnection solution = new RedundantConnection();

    @Test
    void basicCase() {
        assertArrayEquals(new int[]{2, 3}, solution.findRedundantConnection(new int[][]{{1, 2}, {1, 3}, {2, 3}}));
    }

    @Test
    void simpleCycle() {
        assertArrayEquals(new int[]{1, 3}, solution.findRedundantConnection(new int[][]{{1, 2}, {2, 3}, {3, 1}}));
    }

    @Test
    void complexCycle() {
        assertArrayEquals(new int[]{1, 4}, solution.findRedundantConnection(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}}));
    }

    @Test
    void triangle() {
        assertArrayEquals(new int[]{2, 3}, solution.findRedundantConnection(new int[][]{{1, 2}, {1, 3}, {2, 3}}));
    }

    @Test
    void square() {
        assertArrayEquals(new int[]{1, 4}, solution.findRedundantConnection(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 1}}));
    }
}
