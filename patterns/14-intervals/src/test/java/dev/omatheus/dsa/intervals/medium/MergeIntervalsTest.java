package dev.omatheus.dsa.intervals.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {

    private final MergeIntervals solution = new MergeIntervals();

    @Test
    void basicMerge() {
        int[][] result = solution.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, result);
    }

    @Test
    void noOverlap() {
        int[][] result = solution.merge(new int[][]{{1, 2}, {4, 5}});
        assertArrayEquals(new int[][]{{1, 2}, {4, 5}}, result);
    }

    @Test
    void allOverlap() {
        int[][] result = solution.merge(new int[][]{{1, 4}, {2, 3}});
        assertArrayEquals(new int[][]{{1, 4}}, result);
    }

    @Test
    void singleInterval() {
        int[][] result = solution.merge(new int[][]{{1, 3}});
        assertArrayEquals(new int[][]{{1, 3}}, result);
    }

    @Test
    void twoIntervals() {
        int[][] result = solution.merge(new int[][]{{1, 4}, {4, 5}});
        assertArrayEquals(new int[][]{{1, 5}}, result);
    }

    @Test
    void complexMerge() {
        int[][] result = solution.merge(new int[][]{{1, 4}, {0, 4}});
        assertArrayEquals(new int[][]{{0, 4}}, result);
    }
}
