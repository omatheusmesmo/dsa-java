package dev.omatheus.dsa.backtracking.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class SubsetsIITest {

    private final SubsetsII solution = new SubsetsII();

    @Test
    void basicCase() {
        List<List<Integer>> result = solution.subsetsWithDup(new int[]{1, 2, 2});
        assertEquals(6, result.size());
    }

    @Test
    void withDuplicates() {
        List<List<Integer>> result = solution.subsetsWithDup(new int[]{2, 2, 1});
        assertEquals(6, result.size());
    }

    @Test
    void allSame() {
        List<List<Integer>> result = solution.subsetsWithDup(new int[]{1, 1, 1});
        assertEquals(4, result.size());
    }

    @Test
    void singleElement() {
        List<List<Integer>> result = solution.subsetsWithDup(new int[]{1});
        assertEquals(2, result.size());
    }

    @Test
    void twoElements() {
        List<List<Integer>> result = solution.subsetsWithDup(new int[]{1, 2});
        assertEquals(4, result.size());
    }

    @Test
    void noDuplicates() {
        List<List<Integer>> result = solution.subsetsWithDup(new int[]{1, 2, 3});
        assertEquals(8, result.size());
    }
}
