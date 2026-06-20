package dev.omatheus.dsa.math.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxPointsOnALineTest {

    private final MaxPointsOnALine solution = new MaxPointsOnALine();

    @Test
    void basicCase() {
        assertEquals(3, solution.maxPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 5}}));
    }

    @Test
    void singlePoint() {
        assertEquals(1, solution.maxPoints(new int[][]{{1, 1}}));
    }

    @Test
    void twoPoints() {
        assertEquals(2, solution.maxPoints(new int[][]{{1, 1}, {2, 2}}));
    }

    @Test
    void allSame() {
        assertEquals(3, solution.maxPoints(new int[][]{{1, 1}, {1, 1}, {1, 1}}));
    }

    @Test
    void collinear() {
        assertEquals(4, solution.maxPoints(new int[][]{{0, 0}, {1, 1}, {2, 2}, {3, 3}}));
    }

    @Test
    void complexLine() {
        assertEquals(3, solution.maxPoints(new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}}));
    }

    @Test
    void verticalLine() {
        assertEquals(3, solution.maxPoints(new int[][]{{1, 1}, {1, 2}, {1, 3}, {2, 1}}));
    }
}
