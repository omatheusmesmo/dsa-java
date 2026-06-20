package dev.omatheus.dsa.dynamic_programming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UniquePathsIITest {

    private final UniquePathsII solution = new UniquePathsII();

    @Test
    void basicCase() {
        assertEquals(2, solution.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
    }

    @Test
    void noObstacles() {
        assertEquals(3, solution.uniquePathsWithObstacles(new int[][]{{0, 0, 0}}));
    }

    @Test
    void allObstacles() {
        assertEquals(0, solution.uniquePathsWithObstacles(new int[][]{{1}}));
    }

    @Test
    void startBlocked() {
        assertEquals(0, solution.uniquePathsWithObstacles(new int[][]{{1, 0}}));
    }

    @Test
    void endBlocked() {
        assertEquals(0, solution.uniquePathsWithObstacles(new int[][]{{0, 1}}));
    }

    @Test
    void complexPath() {
        assertEquals(1, solution.uniquePathsWithObstacles(new int[][]{{0, 1}, {0, 0}}));
    }
}
