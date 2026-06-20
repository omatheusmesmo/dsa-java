package dev.omatheus.dsa.backtracking.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class PermutationsIITest {

    private final PermutationsII solution = new PermutationsII();

    @Test
    void basicCase() {
        List<List<Integer>> result = solution.permuteUnique(new int[]{1, 1, 2});
        assertEquals(3, result.size());
    }

    @Test
    void withDuplicates() {
        List<List<Integer>> result = solution.permuteUnique(new int[]{2, 2, 1});
        assertEquals(3, result.size());
    }

    @Test
    void allSame() {
        List<List<Integer>> result = solution.permuteUnique(new int[]{1, 1, 1});
        assertEquals(1, result.size());
    }

    @Test
    void singleElement() {
        List<List<Integer>> result = solution.permuteUnique(new int[]{1});
        assertEquals(1, result.size());
    }

    @Test
    void twoElements() {
        List<List<Integer>> result = solution.permuteUnique(new int[]{1, 2});
        assertEquals(2, result.size());
    }

    @Test
    void noDuplicates() {
        List<List<Integer>> result = solution.permuteUnique(new int[]{1, 2, 3});
        assertEquals(6, result.size());
    }
}
