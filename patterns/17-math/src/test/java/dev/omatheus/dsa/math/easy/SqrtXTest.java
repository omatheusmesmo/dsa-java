package dev.omatheus.dsa.math.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SqrtXTest {

    private final SqrtX solution = new SqrtX();

    @Test
    void basicCase() {
        assertEquals(2, solution.mySqrt(8));
    }

    @Test
    void zero() {
        assertEquals(0, solution.mySqrt(0));
    }

    @Test
    void one() {
        assertEquals(1, solution.mySqrt(1));
    }

    @Test
    void perfectSquare() {
        assertEquals(4, solution.mySqrt(16));
    }

    @Test
    void nonPerfect() {
        assertEquals(3, solution.mySqrt(10));
    }

    @Test
    void maxInt() {
        assertEquals(46340, solution.mySqrt(Integer.MAX_VALUE));
    }

    @Test
    void largeNumber() {
        assertEquals(46340, solution.mySqrt(Integer.MAX_VALUE));
    }
}
