package dev.omatheus.dsa.backtracking.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class NQueensTest {

    private final NQueens solution = new NQueens();

    @Test
    void n1() {
        assertEquals(1, solution.solveNQueens(1).size());
    }

    @Test
    void n2() {
        assertEquals(0, solution.solveNQueens(2).size());
    }

    @Test
    void n3() {
        assertEquals(0, solution.solveNQueens(3).size());
    }

    @Test
    void n4() {
        assertEquals(2, solution.solveNQueens(4).size());
    }

    @Test
    void n5() {
        assertEquals(10, solution.solveNQueens(5).size());
    }

    @Test
    void n6() {
        assertEquals(4, solution.solveNQueens(6).size());
    }

    @Test
    void n7() {
        assertEquals(40, solution.solveNQueens(7).size());
    }

    @Test
    void n8() {
        assertEquals(92, solution.solveNQueens(8).size());
    }

    @Test
    void n9() {
        assertEquals(352, solution.solveNQueens(9).size());
    }
}
