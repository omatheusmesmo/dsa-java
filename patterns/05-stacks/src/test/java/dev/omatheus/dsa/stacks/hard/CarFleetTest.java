package dev.omatheus.dsa.stacks.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarFleetTest {

    private final CarFleet solution = new CarFleet();

    @Test
    void basicCase() {
        assertEquals(3, solution.carFleet(12, new int[]{10, 8, 0, 5, 3}, new int[]{2, 4, 1, 1, 3}));
    }

    @Test
    void singleCar() {
        assertEquals(1, solution.carFleet(10, new int[]{5}, new int[]{2}));
    }

    @Test
    void noFleet() {
        assertEquals(3, solution.carFleet(10, new int[]{0, 3, 7}, new int[]{1, 1, 1}));
    }

    @Test
    void allSameSpeed() {
        assertEquals(1, solution.carFleet(10, new int[]{0, 5}, new int[]{2, 2}));
    }

    @Test
    void allDifferent() {
        assertEquals(2, solution.carFleet(10, new int[]{0, 5}, new int[]{1, 2}));
    }

    @Test
    void targetReached() {
        assertEquals(1, solution.carFleet(5, new int[]{0, 1, 2}, new int[]{1, 1, 1}));
    }

    @Test
    void complexScenario() {
        assertEquals(2, solution.carFleet(10, new int[]{8, 3, 7, 1, 5}, new int[]{4, 4, 4, 4, 4}));
    }
}
