package dev.omatheus.dsa.binary_search.hard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {

    private final MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();

    @Test
    void basicCase() {
        assertEquals(2.0, solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 0.00001);
    }

    @Test
    void emptyFirst() {
        assertEquals(2.5, solution.findMedianSortedArrays(new int[]{}, new int[]{1, 3}), 0.00001);
    }

    @Test
    void emptySecond() {
        assertEquals(2.0, solution.findMedianSortedArrays(new int[]{2}, new int[]{}), 0.00001);
    }

    @Test
    void singleElement() {
        assertEquals(1.5, solution.findMedianSortedArrays(new int[]{1}, new int[]{2}), 0.00001);
    }

    @Test
    void differentLengths() {
        assertEquals(2.0, solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 4, 5}), 0.00001);
    }

    @Test
    void allSame() {
        assertEquals(2.0, solution.findMedianSortedArrays(new int[]{2, 2}, new int[]{2}), 0.00001);
    }

    @Test
    void negativeNumbers() {
        assertEquals(0.0, solution.findMedianSortedArrays(new int[]{-2, -1}, new int[]{1, 2}), 0.00001);
    }

    @Test
    void largeArrays() {
        int[] nums1 = new int[1000];
        int[] nums2 = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums1[i] = i;
            nums2[i] = i + 1000;
        }
        assertEquals(999.5, solution.findMedianSortedArrays(nums1, nums2), 0.00001);
    }
}
