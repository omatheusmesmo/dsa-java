package dev.omatheus.dsa.heaps.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class FindKPairsWithSmallestSumsTest {

    private final FindKPairsWithSmallestSums solution = new FindKPairsWithSmallestSums();

    @Test
    void basicCase() {
        List<List<Integer>> result = solution.kSmallestPairs(new int[]{1, 7, 11}, new int[]{2, 4, 6}, 3);
        assertEquals(3, result.size());
        assertEquals(List.of(1, 2), result.get(0));
        assertEquals(List.of(1, 4), result.get(1));
        assertEquals(List.of(1, 6), result.get(2));
    }

    @Test
    void kEqualsOne() {
        List<List<Integer>> result = solution.kSmallestPairs(new int[]{1, 7, 11}, new int[]{2, 4, 6}, 1);
        assertEquals(1, result.size());
        assertEquals(List.of(1, 2), result.get(0));
    }

    @Test
    void kEqualsLength() {
        List<List<Integer>> result = solution.kSmallestPairs(new int[]{1, 2}, new int[]{3}, 2);
        assertEquals(2, result.size());
    }

    @Test
    void allSame() {
        List<List<Integer>> result = solution.kSmallestPairs(new int[]{1, 1}, new int[]{1, 1}, 4);
        assertEquals(4, result.size());
    }

    @Test
    void negativeNumbers() {
        List<List<Integer>> result = solution.kSmallestPairs(new int[]{-1, 0}, new int[]{-2, 1}, 3);
        assertEquals(3, result.size());
    }

    @Test
    void singleElement() {
        List<List<Integer>> result = solution.kSmallestPairs(new int[]{1}, new int[]{2}, 1);
        assertEquals(1, result.size());
        assertEquals(List.of(1, 2), result.get(0));
    }

    @Test
    void largeArrays() {
        int[] nums1 = new int[1000];
        int[] nums2 = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums1[i] = i;
            nums2[i] = i;
        }
        List<List<Integer>> result = solution.kSmallestPairs(nums1, nums2, 100);
        assertEquals(100, result.size());
    }
}
