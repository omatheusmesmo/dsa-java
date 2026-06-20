package dev.omatheus.dsa.dynamic_programming.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    private final ClimbingStairs solution = new ClimbingStairs();

    @Test
    void n1() {
        assertEquals(1, solution.climbStairs(1));
    }

    @Test
    void n2() {
        assertEquals(2, solution.climbStairs(2));
    }

    @Test
    void n3() {
        assertEquals(3, solution.climbStairs(3));
    }

    @Test
    void n4() {
        assertEquals(5, solution.climbStairs(4));
    }

    @Test
    void n5() {
        assertEquals(8, solution.climbStairs(5));
    }

    @Test
    void n10() {
        assertEquals(89, solution.climbStairs(10));
    }

    @Test
    void n45() {
        assertEquals(1836311903, solution.climbStairs(45));
    }
}
