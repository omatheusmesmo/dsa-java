package dev.omatheus.dsa.graphs.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {

    private final NumberOfIslands solution = new NumberOfIslands();

    @Test
    void basicCase() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertEquals(1, solution.numIslands(grid));
    }

    @Test
    void noIslands() {
        char[][] grid = {{'0', '0'}, {'0', '0'}};
        assertEquals(0, solution.numIslands(grid));
    }

    @Test
    void allLand() {
        char[][] grid = {{'1', '1'}, {'1', '1'}};
        assertEquals(1, solution.numIslands(grid));
    }

    @Test
    void allWater() {
        char[][] grid = {{'0', '0', '0'}, {'0', '0', '0'}};
        assertEquals(0, solution.numIslands(grid));
    }

    @Test
    void singleCell() {
        assertEquals(1, solution.numIslands(new char[][]{{'1'}}));
        assertEquals(0, solution.numIslands(new char[][]{{'0'}}));
    }

    @Test
    void complexIslands() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, solution.numIslands(grid));
    }

    @Test
    void multipleIslands() {
        char[][] grid = {
                {'1', '0', '1'},
                {'0', '0', '0'},
                {'1', '0', '1'}
        };
        assertEquals(4, solution.numIslands(grid));
    }
}
