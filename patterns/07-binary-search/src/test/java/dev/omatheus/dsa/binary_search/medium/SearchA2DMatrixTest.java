package dev.omatheus.dsa.binary_search.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchA2DMatrixTest {

    private final SearchA2DMatrix solution = new SearchA2DMatrix();

    @Test
    void basicFound() {
        assertTrue(solution.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
    }

    @Test
    void basicNotFound() {
        assertFalse(solution.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13));
    }

    @Test
    void singleRow() {
        assertTrue(solution.searchMatrix(new int[][]{{1, 3, 5, 7}}, 5));
        assertFalse(solution.searchMatrix(new int[][]{{1, 3, 5, 7}}, 4));
    }

    @Test
    void singleColumn() {
        assertTrue(solution.searchMatrix(new int[][]{{1}, {3}, {5}, {7}}, 3));
        assertFalse(solution.searchMatrix(new int[][]{{1}, {3}, {5}, {7}}, 4));
    }

    @Test
    void firstElement() {
        assertTrue(solution.searchMatrix(new int[][]{{1, 3}, {5, 7}}, 1));
    }

    @Test
    void lastElement() {
        assertTrue(solution.searchMatrix(new int[][]{{1, 3}, {5, 7}}, 7));
    }

    @Test
    void matrixMiddle() {
        assertTrue(solution.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 11));
    }
}
