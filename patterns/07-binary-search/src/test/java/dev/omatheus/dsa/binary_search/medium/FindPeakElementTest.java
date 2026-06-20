package dev.omatheus.dsa.binary_search.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindPeakElementTest {

    private final FindPeakElement solution = new FindPeakElement();

    @Test
    void basicPeak() {
        assertEquals(2, solution.findPeakElement(new int[]{1, 2, 3, 1}));
    }

    @Test
    void singleElement() {
        assertEquals(0, solution.findPeakElement(new int[]{1}));
    }

    @Test
    void twoElements() {
        int result = solution.findPeakElement(new int[]{1, 2});
        assertTrue(result == 0 || result == 1);
    }

    @Test
    void increasing() {
        int result = solution.findPeakElement(new int[]{1, 2, 3, 4, 5});
        assertTrue(result == 4);
    }

    @Test
    void decreasing() {
        assertEquals(0, solution.findPeakElement(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    void multiplePeaks() {
        int result = solution.findPeakElement(new int[]{1, 3, 2, 5, 4});
        assertTrue(result == 1 || result == 3);
    }

    @Test
    void plateau() {
        // Since nums[i] != nums[i+1], this tests strictly increasing
        int result = solution.findPeakElement(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertTrue(result == 9);
    }
}
