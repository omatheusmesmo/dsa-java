package dev.omatheus.dsa.stacks.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DailyTemperaturesTest {

    private final DailyTemperatures solution = new DailyTemperatures();

    @Test
    void basicCase() {
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, solution.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }

    @Test
    void allSame() {
        assertArrayEquals(new int[]{0, 0, 0}, solution.dailyTemperatures(new int[]{30, 30, 30}));
    }

    @Test
    void increasing() {
        assertArrayEquals(new int[]{1, 1, 1, 1}, solution.dailyTemperatures(new int[]{30, 31, 32, 33}));
    }

    @Test
    void decreasing() {
        assertArrayEquals(new int[]{0, 0, 0, 0}, solution.dailyTemperatures(new int[]{33, 32, 31, 30}));
    }

    @Test
    void noWarmer() {
        assertArrayEquals(new int[]{0, 0, 0}, solution.dailyTemperatures(new int[]{100, 99, 98}));
    }

    @Test
    void singleElement() {
        assertArrayEquals(new int[]{0}, solution.dailyTemperatures(new int[]{50}));
    }

    @Test
    void twoElements() {
        assertArrayEquals(new int[]{1, 0}, solution.dailyTemperatures(new int[]{30, 40}));
    }

    @Test
    void alternating() {
        assertArrayEquals(new int[]{1, 3, 1, 1, 0}, solution.dailyTemperatures(new int[]{55, 34, 50, 33, 60}));
    }
}
