package dev.omatheus.dsa.graphs.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RottingOrangesTest {

    private final RottingOranges solution = new RottingOranges();

    @Test
    void basicCase() {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        assertEquals(4, solution.orangesRotting(grid));
    }

    @Test
    void noRotten() {
        int[][] grid = {{0, 1}};
        assertEquals(-1, solution.orangesRotting(grid));
    }

    @Test
    void alreadyRotten() {
        int[][] grid = {{2, 2}, {2, 2}};
        assertEquals(0, solution.orangesRotting(grid));
    }

    @Test
    void impossible() {
        int[][] grid = {{0, 1, 2}, {0, 1, 2}, {2, 1, 1}};
        assertEquals(-1, solution.orangesRotting(grid));
    }

    @Test
    void singleOrange() {
        assertEquals(0, solution.orangesRotting(new int[][]{{2}}));
        assertEquals(0, solution.orangesRotting(new int[][]{{0}}));
        assertEquals(-1, solution.orangesRotting(new int[][]{{1}}));
    }

    @Test
    void complexGrid() {
        int[][] grid = {
                {2, 1, 1, 1},
                {1, 1, 0, 1},
                {0, 0, 1, 1}
        };
        assertEquals(3, solution.orangesRotting(grid));
    }
}
