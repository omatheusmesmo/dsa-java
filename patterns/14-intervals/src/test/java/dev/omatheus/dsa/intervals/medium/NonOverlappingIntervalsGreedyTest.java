package dev.omatheus.dsa.intervals.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NonOverlappingIntervalsGreedyTest {

    private final NonOverlappingIntervalsGreedy solution = new NonOverlappingIntervalsGreedy();

    @Test
    void basicCase() {
        assertEquals(1, solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}));
    }

    @Test
    void noOverlap() {
        assertEquals(0, solution.eraseOverlapIntervals(new int[][]{{1, 2}, {3, 4}}));
    }

    @Test
    void allOverlap() {
        assertEquals(2, solution.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 3}, {1, 4}}));
    }

    @Test
    void singleInterval() {
        assertEquals(0, solution.eraseOverlapIntervals(new int[][]{{1, 5}}));
    }

    @Test
    void twoIntervals() {
        assertEquals(1, solution.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 3}}));
    }

    @Test
    void complex() {
        assertEquals(2, solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}, {2, 4}}));
    }
}
