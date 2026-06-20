package dev.omatheus.dsa.prefixsum.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPivotIndexTest {

    private final FindPivotIndex solution = new FindPivotIndex();

    @Test
    void basicCase() {
        assertEquals(3, solution.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    @Test
    void leftEqualsRight() {
        assertEquals(0, solution.pivotIndex(new int[]{1, 2, 3}));
    }

    @Test
    void noPivot() {
        assertEquals(-1, solution.pivotIndex(new int[]{1, 2}));
    }

    @Test
    void firstIndex() {
        assertEquals(0, solution.pivotIndex(new int[]{2, 1, -1}));
    }

    @Test
    void lastIndex() {
        assertEquals(2, solution.pivotIndex(new int[]{-1, -1, 0, 1, 1, 0}));
    }

    @Test
    void singleElement() {
        assertEquals(0, solution.pivotIndex(new int[]{5}));
    }

    @Test
    void allZeros() {
        assertEquals(0, solution.pivotIndex(new int[]{0, 0, 0, 0}));
    }

    @Test
    void negativeNumbers() {
        assertEquals(0, solution.pivotIndex(new int[]{-1, 1, 0}));
    }
}
