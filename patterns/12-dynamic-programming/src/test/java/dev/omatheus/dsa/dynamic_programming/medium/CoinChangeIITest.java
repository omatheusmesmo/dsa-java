package dev.omatheus.dsa.dynamic_programming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoinChangeIITest {

    private final CoinChangeII solution = new CoinChangeII();

    @Test
    void basicCase() {
        assertEquals(4, solution.change(5, new int[]{1, 2, 5}));
    }

    @Test
    void zeroAmount() {
        assertEquals(1, solution.change(0, new int[]{1}));
    }

    @Test
    void singleCoin() {
        assertEquals(1, solution.change(3, new int[]{1}));
    }

    @Test
    void noSolution() {
        assertEquals(0, solution.change(3, new int[]{2}));
    }

    @Test
    void largeAmount() {
        assertEquals(1, solution.change(100, new int[]{100}));
    }

    @Test
    void allSameCoins() {
        assertEquals(1, solution.change(4, new int[]{1, 1, 1}));
    }
}
