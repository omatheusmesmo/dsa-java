package dev.omatheus.dsa.heaps.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeightTest {

    private final LastStoneWeight solution = new LastStoneWeight();

    @Test
    void basicCase() {
        assertEquals(1, solution.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }

    @Test
    void singleStone() {
        assertEquals(10, solution.lastStoneWeight(new int[]{10}));
    }

    @Test
    void twoStones() {
        assertEquals(2, solution.lastStoneWeight(new int[]{5, 3}));
        assertEquals(0, solution.lastStoneWeight(new int[]{5, 5}));
    }

    @Test
    void allSame() {
        assertEquals(2, solution.lastStoneWeight(new int[]{4, 4, 4, 4}));
    }

    @Test
    void threeStones() {
        assertEquals(1, solution.lastStoneWeight(new int[]{3, 5, 4}));
    }

    @Test
    void alternating() {
        assertEquals(0, solution.lastStoneWeight(new int[]{1, 1, 1, 1}));
    }
}
