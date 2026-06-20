package dev.omatheus.dsa.backtracking.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class CombinationSumIITest {

    private final CombinationSumII solution = new CombinationSumII();

    @Test
    void basicCase() {
        List<List<Integer>> result = solution.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        assertEquals(4, result.size());
    }

    @Test
    void noSolution() {
        List<List<Integer>> result = solution.combinationSum2(new int[]{2}, 3);
        assertTrue(result.isEmpty());
    }

    @Test
    void singleCandidate() {
        List<List<Integer>> result = solution.combinationSum2(new int[]{8}, 8);
        assertEquals(1, result.size());
    }

    @Test
    void exactMatch() {
        List<List<Integer>> result = solution.combinationSum2(new int[]{3, 5}, 8);
        assertEquals(1, result.size());
    }

    @Test
    void duplicates() {
        List<List<Integer>> result = solution.combinationSum2(new int[]{1, 1, 2}, 3);
        assertEquals(1, result.size());
    }

    @Test
    void largeTarget() {
        List<List<Integer>> result = solution.combinationSum2(new int[]{1, 2, 3, 4, 5}, 15);
        assertEquals(1, result.size());
    }
}
