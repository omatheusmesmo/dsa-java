package dev.omatheus.dsa.bitmanipulation.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOf1BitsTest {

    private final NumberOf1Bits solution = new NumberOf1Bits();

    @Test
    void basicCase() {
        assertEquals(3, solution.hammingWeight(11));
    }

    @Test
    void allOnes() {
        assertEquals(32, solution.hammingWeight(-1));
    }

    @Test
    void allZeros() {
        assertEquals(0, solution.hammingWeight(0));
    }

    @Test
    void singleBit() {
        assertEquals(1, solution.hammingWeight(1));
    }

    @Test
    void alternating() {
        assertEquals(16, solution.hammingWeight(0x55555555));
    }

    @Test
    void powerOfTwo() {
        assertEquals(1, solution.hammingWeight(1024));
    }
}
