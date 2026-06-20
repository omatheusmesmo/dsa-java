package dev.omatheus.dsa.backtracking.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {

    private final WordSearch solution = new WordSearch();

    @Test
    void basicFound() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        assertTrue(solution.exist(board, "ABCCED"));
    }

    @Test
    void basicNotFound() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        assertFalse(solution.exist(board, "ABCB"));
    }

    @Test
    void singleCell() {
        assertTrue(solution.exist(new char[][]{{'A'}}, "A"));
        assertFalse(solution.exist(new char[][]{{'A'}}, "B"));
    }

    @Test
    void singleCharWord() {
        assertTrue(solution.exist(new char[][]{{'A', 'B'}, {'C', 'D'}}, "C"));
    }

    @Test
    void complexPath() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'E', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        assertTrue(solution.exist(board, "ABCESEEE"));
    }

    @Test
    void noMatch() {
        char[][] board = {
                {'A', 'B'},
                {'C', 'D'}
        };
        assertFalse(solution.exist(board, "ACDBE"));
    }

    @Test
    void fullBoard() {
        char[][] board = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };
        assertTrue(solution.exist(board, "ABCDEFGHI"));
    }
}
