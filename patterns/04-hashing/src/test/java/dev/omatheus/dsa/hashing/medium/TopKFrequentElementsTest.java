package dev.omatheus.dsa.hashing.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    private final TopKFrequentElements solution = new TopKFrequentElements();

    @Test
    void basicCase() {
        int[] result = solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        Set<Integer> resultSet = new HashSet<>(Arrays.stream(result).boxed().toList());
        assertTrue(resultSet.contains(1));
        assertTrue(resultSet.contains(2));
    }

    @Test
    void kEqualsOne() {
        int[] result = solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 1);
        assertEquals(1, result.length);
        assertEquals(1, result[0]);
    }

    @Test
    void allSame() {
        int[] result = solution.topKFrequent(new int[]{1, 1, 1}, 1);
        assertEquals(1, result.length);
        assertEquals(1, result[0]);
    }

    @Test
    void allUnique() {
        int[] result = solution.topKFrequent(new int[]{1, 2, 3, 4, 5}, 3);
        assertEquals(3, result.length);
    }

    @Test
    void negativeNumbers() {
        int[] result = solution.topKFrequent(new int[]{-1, -1, -2, -2, -3}, 2);
        Set<Integer> resultSet = new HashSet<>(Arrays.stream(result).boxed().toList());
        assertTrue(resultSet.contains(-1));
        assertTrue(resultSet.contains(-2));
    }

    @Test
    void largeArray() {
        int[] nums = new int[100000];
        for (int i = 0; i < 100000; i++) nums[i] = i % 100;
        int[] result = solution.topKFrequent(nums, 5);
        assertEquals(5, result.length);
    }

    @Test
    void kEqualsLength() {
        int[] result = solution.topKFrequent(new int[]{1, 2, 3}, 3);
        assertEquals(3, result.length);
    }
}
