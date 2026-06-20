package dev.omatheus.dsa.bitmanipulation.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseBitsTest {

    private final ReverseBits solution = new ReverseBits();

    @Test
    void basicCase() {
        assertEquals(-1073741825, solution.reverseBits(0b00000010100101000001111010011100));
    }

    @Test
    void allOnes() {
        assertEquals(-1, solution.reverseBits(-1));
    }

    @Test
    void allZeros() {
        assertEquals(0, solution.reverseBits(0));
    }

    @Test
    void singleBit() {
        assertEquals(Integer.MIN_VALUE, solution.reverseBits(1));
    }

    @Test
    void alternating() {
        int result = solution.reverseBits(0b10101010101010101010101010101010);
        assertEquals(0b01010101010101010101010101010101, result);
    }

    @Test
    void powerOfTwo() {
        int result = solution.reverseBits(1 << 30);
        assertEquals(1 << 1, result);
    }
}
