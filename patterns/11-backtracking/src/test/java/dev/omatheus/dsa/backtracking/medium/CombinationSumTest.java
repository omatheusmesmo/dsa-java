package dev.omatheus.dsa.backtracking.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class CombinationSumTest {

    private final CombinationSum solution = new CombinationSum();

    @Test
    void basicCase() {
        List<List<Integer>> result = solution.combinationSum(new int[]{2, 3, 6, 7}, 7);
        assertEquals(2, result.size());
    }

    @Test
    void noSolution() {
        List<List<Integer>> result = solution.combinationSum(new int[]{2}, 3);
        assertTrue(result.isEmpty());
    }

    @Test
    void singleCandidate() {
        List<List<Integer>> result = solution.combinationSum(new int[]{2}, 6);
        assertEquals(1, result.size());
        assertEquals(List.of(2, 2, 2), result.get(0));
    }

    @Test
    void exactMatch() {
        List<List<Integer>> result = solution.combinationSum(new int[]{2, 3}, 5);
        assertEquals(1, result.size());
    }

    @Test
    void multipleCombinations() {
        List<List<Integer>> result = solution.combinationSum(new int[]{2, 3, 5}, 8);
        assertEquals(3, result.size());
    }

    @Test
    void largeTarget() {
        List<List<Integer>> result = solution.combinationSum(new int[]{2, 3}, 100);
        assertFalse(result.isEmpty());
    }
}
