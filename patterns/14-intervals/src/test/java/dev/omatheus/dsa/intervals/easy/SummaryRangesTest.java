package dev.omatheus.dsa.intervals.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class SummaryRangesTest {

    private final SummaryRanges solution = new SummaryRanges();

    @Test
    void basicCase() {
        assertEquals(List.of("0->2", "4->5", "7"), solution.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
    }

    @Test
    void emptyArray() {
        assertEquals(List.of(), solution.summaryRanges(new int[]{}));
    }

    @Test
    void singleElement() {
        assertEquals(List.of("0"), solution.summaryRanges(new int[]{0}));
    }

    @Test
    void consecutive() {
        assertEquals(List.of("0->4"), solution.summaryRanges(new int[]{0, 1, 2, 3, 4}));
    }

    @Test
    void gaps() {
        assertEquals(List.of("0", "2", "4", "6"), solution.summaryRanges(new int[]{0, 2, 4, 6}));
    }

    @Test
    void negativeNumbers() {
        assertEquals(List.of("-2->0", "2->3"), solution.summaryRanges(new int[]{-2, -1, 0, 2, 3}));
    }

    @Test
    void fullRange() {
        assertEquals(List.of("-2147483648->2147483647"), solution.summaryRanges(new int[]{-2147483648, 2147483647}));
    }
}
