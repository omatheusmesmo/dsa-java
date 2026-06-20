package dev.omatheus.dsa.dynamic_programming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumPathSumTest {

    private final MinimumPathSum solution = new MinimumPathSum();

    @Test
    void basicCase() {
        assertEquals(7, solution.minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }

    @Test
    void singleCell() {
        assertEquals(5, solution.minPathSum(new int[][]{{5}}));
    }

    @Test
    void singleRow() {
        assertEquals(6, solution.minPathSum(new int[][]{{1, 2, 3}}));
    }

    @Test
    void singleColumn() {
        assertEquals(6, solution.minPathSum(new int[][]{{1}, {2}, {3}}));
    }

    @Test
    void allZeros() {
        assertEquals(0, solution.minPathSum(new int[][]{{0, 0}, {0, 0}}));
    }

    @Test
    void allSame() {
        assertEquals(4, solution.minPathSum(new int[][]{{1, 1}, {1, 1}}));
    }

    @Test
    void largeGrid() {
        int[][] grid = new int[200][200];
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++) {
                grid[i][j] = 1;
            }
        }
        assertEquals(399, solution.minPathSum(grid));
    }
}
