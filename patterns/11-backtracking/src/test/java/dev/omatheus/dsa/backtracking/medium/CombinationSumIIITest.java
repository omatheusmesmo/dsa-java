package dev.omatheus.dsa.backtracking.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class CombinationSumIIITest {

    private final CombinationSumIII solution = new CombinationSumIII();

    @Test
    void basicCase() {
        List<List<Integer>> result = solution.combinationSum3(3, 7);
        assertEquals(1, result.size());
        assertEquals(List.of(1, 2, 4), result.get(0));
    }

    @Test
    void noSolution() {
        List<List<Integer>> result = solution.combinationSum3(3, 2);
        assertTrue(result.isEmpty());
    }

    @Test
    void kEqualsOne() {
        List<List<Integer>> result = solution.combinationSum3(1, 5);
        assertEquals(1, result.size());
        assertEquals(List.of(5), result.get(0));
    }

    @Test
    void kEqualsNine() {
        List<List<Integer>> result = solution.combinationSum3(9, 45);
        assertEquals(1, result.size());
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9), result.get(0));
    }

    @Test
    void smallN() {
        List<List<Integer>> result = solution.combinationSum3(2, 3);
        assertEquals(1, result.size());
        assertEquals(List.of(1, 2), result.get(0));
    }

    @Test
    void largeN() {
        List<List<Integer>> result = solution.combinationSum3(3, 9);
        assertEquals(3, result.size());
    }
}
