package dev.omatheus.dsa.slidingwindow.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    private final BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

    @Test
    void basicProfit() {
        assertEquals(5, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void noProfit() {
        assertEquals(0, solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    void decreasingPrices() {
        assertEquals(0, solution.maxProfit(new int[]{10, 8, 6, 4, 2}));
    }

    @Test
    void singleDay() {
        assertEquals(0, solution.maxProfit(new int[]{5}));
    }

    @Test
    void twoDays() {
        assertEquals(1, solution.maxProfit(new int[]{1, 2}));
    }

    @Test
    void samePrices() {
        assertEquals(0, solution.maxProfit(new int[]{3, 3, 3, 3}));
    }

    @Test
    void peakInMiddle() {
        assertEquals(4, solution.maxProfit(new int[]{1, 3, 2, 5, 1}));
    }

    @Test
    void valleyThenPeak() {
        assertEquals(5, solution.maxProfit(new int[]{1, 6}));
    }
}
