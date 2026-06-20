package dev.omatheus.dsa.math.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PowXNTest {

    private final PowXN solution = new PowXN();

    @Test
    void basicCase() {
        assertEquals(1024.0, solution.myPow(2.0, 10), 0.0001);
    }

    @Test
    void zeroExponent() {
        assertEquals(1.0, solution.myPow(2.0, 0), 0.0001);
    }

    @Test
    void negativeExponent() {
        assertEquals(0.25, solution.myPow(2.0, -2), 0.0001);
    }

    @Test
    void oneBase() {
        assertEquals(1.0, solution.myPow(1.0, 1000000), 0.0001);
    }

    @Test
    void fractionBase() {
        assertEquals(0.125, solution.myPow(0.5, 3), 0.0001);
    }

    @Test
    void largeExponent() {
        assertEquals(1.0, solution.myPow(1.0, Integer.MAX_VALUE), 0.0001);
    }

    @Test
    void negativeBase() {
        assertEquals(-8.0, solution.myPow(-2.0, 3), 0.0001);
    }
}
