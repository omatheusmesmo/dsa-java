package dev.omatheus.dsa.graphs.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class PacificAtlanticWaterFlowTest {

    private final PacificAtlanticWaterFlow solution = new PacificAtlanticWaterFlow();

    @Test
    void basicCase() {
        int[][] heights = {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };
        List<List<Integer>> result = solution.pacificAtlantic(heights);
        assertEquals(7, result.size());
    }

    @Test
    void singleCell() {
        int[][] heights = {{1}};
        List<List<Integer>> result = solution.pacificAtlantic(heights);
        assertEquals(1, result.size());
    }

    @Test
    void allSame() {
        int[][] heights = {{1, 1}, {1, 1}};
        List<List<Integer>> result = solution.pacificAtlantic(heights);
        assertEquals(4, result.size());
    }

    @Test
    void corners() {
        int[][] heights = {
                {1, 2},
                {3, 4}
        };
        List<List<Integer>> result = solution.pacificAtlantic(heights);
        assertTrue(result.size() >= 1);
    }

    @Test
    void edges() {
        int[][] heights = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        List<List<Integer>> result = solution.pacificAtlantic(heights);
        assertEquals(9, result.size());
    }

    @Test
    void complexTerrain() {
        int[][] heights = {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };
        List<List<Integer>> result = solution.pacificAtlantic(heights);
        assertTrue(result.size() >= 1);
    }
}
