package dev.omatheus.dsa.heaps.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KClosestPointsToOriginTest {

    private final KClosestPointsToOrigin solution = new KClosestPointsToOrigin();

    @Test
    void basicCase() {
        int[][] result = solution.kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2);
        assertEquals(2, result.length);
    }

    @Test
    void kEqualsLength() {
        int[][] result = solution.kClosest(new int[][]{{1, 3}, {-2, 2}}, 2);
        assertEquals(2, result.length);
    }

    @Test
    void singlePoint() {
        int[][] result = solution.kClosest(new int[][]{{1, 1}}, 1);
        assertEquals(1, result.length);
        assertArrayEquals(new int[]{1, 1}, result[0]);
    }

    @Test
    void ties() {
        int[][] result = solution.kClosest(new int[][]{{1, 0}, {0, 1}}, 1);
        assertEquals(1, result.length);
    }

    @Test
    void negativeCoords() {
        int[][] result = solution.kClosest(new int[][]{{-1, -1}, {1, 1}, {0, 0}}, 2);
        assertEquals(2, result.length);
    }

    @Test
    void largeK() {
        int[][] points = new int[100][2];
        for (int i = 0; i < 100; i++) {
            points[i] = new int[]{i, i};
        }
        int[][] result = solution.kClosest(points, 50);
        assertEquals(50, result.length);
    }

    @Test
    void allSameDistance() {
        int[][] result = solution.kClosest(new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}, 2);
        assertEquals(2, result.length);
    }
}
