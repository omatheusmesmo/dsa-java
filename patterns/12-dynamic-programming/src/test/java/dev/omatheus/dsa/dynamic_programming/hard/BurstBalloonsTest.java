package dev.omatheus.dsa.dynamic_programming.hard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BurstBalloonsTest {

    private final BurstBalloons solution = new BurstBalloons();

    @Test
    void basicCase() {
        assertEquals(167, solution.maxCoins(new int[]{3, 1, 5, 8}));
    }

    @Test
    void singleBalloon() {
        assertEquals(3, solution.maxCoins(new int[]{3}));
    }

    @Test
    void twoBalloons() {
        assertEquals(10, solution.maxCoins(new int[]{3, 5}));
    }

    @Test
    void allSame() {
        assertEquals(45, solution.maxCoins(new int[]{3, 3, 3}));
    }

    @Test
    void increasing() {
        assertEquals(30, solution.maxCoins(new int[]{1, 2, 3}));
    }

    @Test
    void decreasing() {
        assertEquals(30, solution.maxCoins(new int[]{3, 2, 1}));
    }

    @Test
    void complex() {
        assertEquals(216, solution.maxCoins(new int[]{3, 1, 5, 8}));
    }
}
