package dev.omatheus.dsa.backtracking.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class PermutationsTest {

    private final Permutations solution = new Permutations();

    @Test
    void basicCase() {
        List<List<Integer>> result = solution.permute(new int[]{1, 2, 3});
        assertEquals(6, result.size());
    }

    @Test
    void singleElement() {
        List<List<Integer>> result = solution.permute(new int[]{1});
        assertEquals(1, result.size());
    }

    @Test
    void twoElements() {
        List<List<Integer>> result = solution.permute(new int[]{1, 2});
        assertEquals(2, result.size());
    }

    @Test
    void threeElements() {
        List<List<Integer>> result = solution.permute(new int[]{1, 2, 3});
        assertEquals(6, result.size());
    }

    @Test
    void negativeNumbers() {
        List<List<Integer>> result = solution.permute(new int[]{-1, 0, 1});
        assertEquals(6, result.size());
    }

    @Test
    void fourElements() {
        List<List<Integer>> result = solution.permute(new int[]{1, 2, 3, 4});
        assertEquals(24, result.size());
    }
}
