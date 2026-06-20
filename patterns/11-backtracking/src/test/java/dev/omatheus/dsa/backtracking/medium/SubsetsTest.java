package dev.omatheus.dsa.backtracking.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class SubsetsTest {

    private final Subsets solution = new Subsets();

    @Test
    void basicCase() {
        List<List<Integer>> result = solution.subsets(new int[]{1, 2, 3});
        assertEquals(8, result.size());
    }

    @Test
    void singleElement() {
        List<List<Integer>> result = solution.subsets(new int[]{1});
        assertEquals(2, result.size());
    }

    @Test
    void twoElements() {
        List<List<Integer>> result = solution.subsets(new int[]{1, 2});
        assertEquals(4, result.size());
    }

    @Test
    void threeElements() {
        List<List<Integer>> result = solution.subsets(new int[]{1, 2, 3});
        assertEquals(8, result.size());
    }

    @Test
    void negativeNumbers() {
        List<List<Integer>> result = solution.subsets(new int[]{-1, 0, 1});
        assertEquals(8, result.size());
    }

    @Test
    void allSame() {
        List<List<Integer>> result = solution.subsets(new int[]{1, 1, 1});
        assertEquals(8, result.size());
    }

    @Test
    void emptyResult() {
        List<List<Integer>> result = solution.subsets(new int[]{});
        assertEquals(1, result.size());
        assertTrue(result.get(0).isEmpty());
    }
}
