package dev.omatheus.dsa.intervals.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalTest {

    private final InsertInterval solution = new InsertInterval();

    @Test
    void basicInsert() {
        int[][] result = solution.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5});
        assertArrayEquals(new int[][]{{1, 5}, {6, 9}}, result);
    }

    @Test
    void noOverlap() {
        int[][] result = solution.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{10, 12});
        assertArrayEquals(new int[][]{{1, 3}, {6, 9}, {10, 12}}, result);
    }

    @Test
    void fullOverlap() {
        int[][] result = solution.insert(new int[][]{{1, 3}}, new int[]{2, 2});
        assertArrayEquals(new int[][]{{1, 3}}, result);
    }

    @Test
    void partialOverlap() {
        int[][] result = solution.insert(new int[][]{{1, 2}, {3, 5}}, new int[]{2, 4});
        assertArrayEquals(new int[][]{{1, 5}}, result);
    }

    @Test
    void emptyArray() {
        int[][] result = solution.insert(new int[][]{}, new int[]{5, 7});
        assertArrayEquals(new int[][]{{5, 7}}, result);
    }

    @Test
    void beginning() {
        int[][] result = solution.insert(new int[][]{{3, 5}, {6, 9}}, new int[]{1, 2});
        assertArrayEquals(new int[][]{{1, 2}, {3, 5}, {6, 9}}, result);
    }

    @Test
    void end() {
        int[][] result = solution.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{10, 11});
        assertArrayEquals(new int[][]{{1, 3}, {6, 9}, {10, 11}}, result);
    }
}
