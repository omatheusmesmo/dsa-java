package dev.omatheus.dsa.unionfind.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfConnectedComponentsTest {

    private final NumberOfConnectedComponents solution = new NumberOfConnectedComponents();

    @Test
    void basicCase() {
        assertEquals(2, solution.countComponents(5, new int[][]{{0, 1}, {1, 2}, {3, 4}}));
    }

    @Test
    void allConnected() {
        assertEquals(1, solution.countComponents(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}}));
    }

    @Test
    void noEdges() {
        assertEquals(5, solution.countComponents(5, new int[][]{}));
    }

    @Test
    void singleComponent() {
        assertEquals(1, solution.countComponents(3, new int[][]{{0, 1}, {1, 2}}));
    }

    @Test
    void complexGraph() {
        assertEquals(2, solution.countComponents(6, new int[][]{{0, 1}, {0, 2}, {3, 4}, {4, 5}}));
    }

    @Test
    void isolatedNodes() {
        assertEquals(3, solution.countComponents(4, new int[][]{{0, 1}}));
    }
}
