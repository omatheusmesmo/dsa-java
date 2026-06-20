package dev.omatheus.dsa.dynamic_programming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {

    private final CoinChange solution = new CoinChange();

    @Test
    void basicCase() {
        assertEquals(3, solution.coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    void impossible() {
        assertEquals(-1, solution.coinChange(new int[]{2}, 3));
    }

    @Test
    void singleCoin() {
        assertEquals(3, solution.coinChange(new int[]{1}, 3));
    }

    @Test
    void exactAmount() {
        assertEquals(1, solution.coinChange(new int[]{1, 5, 10}, 5));
    }

    @Test
    void largeAmount() {
        assertEquals(20, solution.coinChange(new int[]{1, 2, 5}, 100));
    }

    @Test
    void oneCoin() {
        assertEquals(1, solution.coinChange(new int[]{1}, 1));
    }
}
