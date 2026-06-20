package dev.omatheus.dsa.dynamic_programming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingPathInMatrixTest {

    private final LongestIncreasingPathInMatrix solution = new LongestIncreasingPathInMatrix();

    @Test
    void basicCase() {
        assertEquals(4, solution.longestIncreasingPath(new int[][]{{9, 9, 4}, {6, 6, 8}, {2, 1, 1}}));
    }

    @Test
    void singleCell() {
        assertEquals(1, solution.longestIncreasingPath(new int[][]{{1}}));
    }

    @Test
    void allSame() {
        assertEquals(1, solution.longestIncreasingPath(new int[][]{{1, 1}, {1, 1}}));
    }

    @Test
    void allIncreasing() {
        assertEquals(4, solution.longestIncreasingPath(new int[][]{{1, 2}, {3, 4}}));
    }

    @Test
    void snake() {
        assertEquals(6, solution.longestIncreasingPath(new int[][]{{3, 4, 5}, {2, 1, 6}, {7, 8, 9}}));
    }

    @Test
    void complexMatrix() {
        assertEquals(4, solution.longestIncreasingPath(new int[][]{{9, 9, 4}, {6, 6, 8}, {2, 1, 1}}));
    }
}
