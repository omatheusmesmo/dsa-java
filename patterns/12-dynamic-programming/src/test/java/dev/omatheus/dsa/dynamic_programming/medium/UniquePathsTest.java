package dev.omatheus.dsa.dynamic_programming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UniquePathsTest {

    private final UniquePaths solution = new UniquePaths();

    @Test
    void basicCase() {
        assertEquals(28, solution.uniquePaths(3, 7));
    }

    @Test
    void singleRow() {
        assertEquals(1, solution.uniquePaths(1, 5));
    }

    @Test
    void singleColumn() {
        assertEquals(1, solution.uniquePaths(5, 1));
    }

    @Test
    void square() {
        assertEquals(6, solution.uniquePaths(3, 3));
    }

    @Test
    void largeGrid() {
        assertEquals(184756, solution.uniquePaths(10, 10));
    }

    @Test
    void smallGrid() {
        assertEquals(1, solution.uniquePaths(1, 1));
    }
}
