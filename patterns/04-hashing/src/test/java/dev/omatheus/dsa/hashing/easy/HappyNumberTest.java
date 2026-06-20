package dev.omatheus.dsa.hashing.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    private final HappyNumber solution = new HappyNumber();

    @Test
    void happyNumber1() {
        assertTrue(solution.isHappy(19));
    }

    @Test
    void unhappyNumber() {
        assertFalse(solution.isHappy(2));
    }

    @Test
    void singleDigit() {
        assertTrue(solution.isHappy(1));
    }

    @Test
    void largeNumber() {
        assertTrue(solution.isHappy(100));
    }

    @Test
    void cycleDetection() {
        assertFalse(solution.isHappy(4));
    }
}
