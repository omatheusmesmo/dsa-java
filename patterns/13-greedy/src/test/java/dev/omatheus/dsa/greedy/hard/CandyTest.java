package dev.omatheus.dsa.greedy.hard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CandyTest {

    private final Candy solution = new Candy();

    @Test
    void basicCase() {
        assertEquals(5, solution.candy(new int[]{1, 0, 2}));
    }

    @Test
    void singleChild() {
        assertEquals(1, solution.candy(new int[]{5}));
    }

    @Test
    void allSame() {
        assertEquals(5, solution.candy(new int[]{3, 3, 3, 3, 3}));
    }

    @Test
    void increasing() {
        assertEquals(15, solution.candy(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void decreasing() {
        assertEquals(15, solution.candy(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    void valley() {
        assertEquals(7, solution.candy(new int[]{3, 2, 1, 2, 3}));
    }

    @Test
    void peak() {
        assertEquals(7, solution.candy(new int[]{1, 2, 3, 2, 1}));
    }

    @Test
    void complex() {
        assertEquals(11, solution.candy(new int[]{1, 3, 2, 2, 1}));
    }
}
