package dev.omatheus.dsa.graphs.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SurroundedRegionsTest {

    private final SurroundedRegions solution = new SurroundedRegions();

    @Test
    void basicCase() {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        solution.solve(board);
        assertArrayEquals(new char[]{'X', 'X', 'X', 'X'}, board[0]);
        assertArrayEquals(new char[]{'X', 'X', 'X', 'X'}, board[1]);
        assertArrayEquals(new char[]{'X', 'X', 'X', 'X'}, board[2]);
        assertArrayEquals(new char[]{'X', 'O', 'X', 'X'}, board[3]);
    }

    @Test
    void noCapture() {
        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'X', 'X'},
                {'X', 'O', 'X'}
        };
        solution.solve(board);
        assertArrayEquals(new char[]{'X', 'O', 'X'}, board[0]);
        assertArrayEquals(new char[]{'X', 'X', 'X'}, board[1]);
        assertArrayEquals(new char[]{'X', 'O', 'X'}, board[2]);
    }

    @Test
    void allCapture() {
        char[][] board = {
                {'X', 'X'},
                {'X', 'X'}
        };
        solution.solve(board);
        assertArrayEquals(new char[]{'X', 'X'}, board[0]);
        assertArrayEquals(new char[]{'X', 'X'}, board[1]);
    }

    @Test
    void borderCapture() {
        char[][] board = {
                {'O', 'X', 'O'},
                {'X', 'X', 'X'},
                {'O', 'X', 'O'}
        };
        solution.solve(board);
        assertArrayEquals(new char[]{'O', 'X', 'O'}, board[0]);
        assertArrayEquals(new char[]{'X', 'X', 'X'}, board[1]);
        assertArrayEquals(new char[]{'O', 'X', 'O'}, board[2]);
    }

    @Test
    void interiorCapture() {
        char[][] board = {
                {'X', 'X', 'X'},
                {'X', 'O', 'X'},
                {'X', 'X', 'X'}
        };
        solution.solve(board);
        assertArrayEquals(new char[]{'X', 'X', 'X'}, board[0]);
        assertArrayEquals(new char[]{'X', 'X', 'X'}, board[1]);
        assertArrayEquals(new char[]{'X', 'X', 'X'}, board[2]);
    }

    @Test
    void singleRow() {
        char[][] board = {{'X', 'O', 'X', 'O', 'X'}};
        solution.solve(board);
        assertArrayEquals(new char[]{'X', 'O', 'X', 'O', 'X'}, board[0]);
    }

    @Test
    void singleColumn() {
        char[][] board = {{'X'}, {'O'}, {'X'}, {'O'}, {'X'}};
        solution.solve(board);
        assertEquals('X', board[0][0]);
        assertEquals('O', board[1][0]);
        assertEquals('X', board[2][0]);
        assertEquals('O', board[3][0]);
        assertEquals('X', board[4][0]);
    }
}
