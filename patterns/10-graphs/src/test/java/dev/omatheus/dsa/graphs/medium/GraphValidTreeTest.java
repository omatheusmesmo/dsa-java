package dev.omatheus.dsa.graphs.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GraphValidTreeTest {

    private final GraphValidTree solution = new GraphValidTree();

    @Test
    void basicTrue() {
        assertTrue(solution.validTree(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 4}}));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.validTree(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}}));
    }

    @Test
    void singleNode() {
        assertTrue(solution.validTree(1, new int[][]{}));
    }

    @Test
    void noEdges() {
        assertFalse(solution.validTree(2, new int[][]{}));
    }

    @Test
    void cycle() {
        assertFalse(solution.validTree(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}));
    }

    @Test
    void disconnected() {
        assertFalse(solution.validTree(4, new int[][]{{0, 1}, {2, 3}}));
    }
}
