package dev.omatheus.dsa.graphs.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxAreaOfIslandTest {

    private final MaxAreaOfIsland solution = new MaxAreaOfIsland();

    @Test
    void basicCase() {
        int[][] grid = {
                {0, 0, 1, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 1, 1}
        };
        assertEquals(4, solution.maxAreaOfIsland(grid));
    }

    @Test
    void noIsland() {
        int[][] grid = {{0, 0}, {0, 0}};
        assertEquals(0, solution.maxAreaOfIsland(grid));
    }

    @Test
    void singleCell() {
        assertEquals(1, solution.maxAreaOfIsland(new int[][]{{1}}));
        assertEquals(0, solution.maxAreaOfIsland(new int[][]{{0}}));
    }

    @Test
    void allLand() {
        int[][] grid = {{1, 1}, {1, 1}};
        assertEquals(4, solution.maxAreaOfIsland(grid));
    }

    @Test
    void complexShape() {
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 1, 1}
        };
        assertEquals(7, solution.maxAreaOfIsland(grid));
    }

    @Test
    void multipleIslands() {
        int[][] grid = {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };
        assertEquals(1, solution.maxAreaOfIsland(grid));
    }
}
