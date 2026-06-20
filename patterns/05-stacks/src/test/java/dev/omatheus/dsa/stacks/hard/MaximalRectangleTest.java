package dev.omatheus.dsa.stacks.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximalRectangleTest {

    private final MaximalRectangle solution = new MaximalRectangle();

    @Test
    void basicCase() {
        char[][] matrix = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };
        assertEquals(6, solution.maximalRectangle(matrix));
    }

    @Test
    void allOnes() {
        char[][] matrix = {{'1', '1'}, {'1', '1'}};
        assertEquals(4, solution.maximalRectangle(matrix));
    }

    @Test
    void allZeros() {
        char[][] matrix = {{'0', '0'}, {'0', '0'}};
        assertEquals(0, solution.maximalRectangle(matrix));
    }

    @Test
    void singleRow() {
        char[][] matrix = {{'1', '1', '1'}};
        assertEquals(3, solution.maximalRectangle(matrix));
    }

    @Test
    void singleColumn() {
        char[][] matrix = {{'1'}, {'1'}, {'1'}};
        assertEquals(3, solution.maximalRectangle(matrix));
    }

    @Test
    void withHoles() {
        char[][] matrix = {{'1', '0', '1'}, {'1', '1', '1'}};
        assertEquals(3, solution.maximalRectangle(matrix));
    }

    @Test
    void largeMatrix() {
        char[][] matrix = {{'1'}};
        assertEquals(1, solution.maximalRectangle(matrix));
    }

    @Test
    void complexPattern() {
        char[][] matrix = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '1', '1', '0'},
            {'0', '1', '1', '1', '1'}
        };
        assertEquals(6, solution.maximalRectangle(matrix));
    }
}
