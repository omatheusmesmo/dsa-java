package dev.omatheus.dsa.backtracking.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NQueensIITest {

    private final NQueensII solution = new NQueensII();

    @Test
    void n1() {
        assertEquals(1, solution.totalNQueens(1));
    }

    @Test
    void n2() {
        assertEquals(0, solution.totalNQueens(2));
    }

    @Test
    void n3() {
        assertEquals(0, solution.totalNQueens(3));
    }

    @Test
    void n4() {
        assertEquals(2, solution.totalNQueens(4));
    }

    @Test
    void n5() {
        assertEquals(10, solution.totalNQueens(5));
    }

    @Test
    void n6() {
        assertEquals(4, solution.totalNQueens(6));
    }

    @Test
    void n7() {
        assertEquals(40, solution.totalNQueens(7));
    }

    @Test
    void n8() {
        assertEquals(92, solution.totalNQueens(8));
    }

    @Test
    void n9() {
        assertEquals(352, solution.totalNQueens(9));
    }
}
