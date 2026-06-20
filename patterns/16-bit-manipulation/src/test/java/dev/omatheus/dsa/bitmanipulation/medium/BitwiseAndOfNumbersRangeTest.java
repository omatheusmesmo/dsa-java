package dev.omatheus.dsa.bitmanipulation.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BitwiseAndOfNumbersRangeTest {

    private final BitwiseAndOfNumbersRange solution = new BitwiseAndOfNumbersRange();

    @Test
    void basicCase() {
        assertEquals(4, solution.rangeBitwiseAnd(5, 7));
    }

    @Test
    void sameNumbers() {
        assertEquals(8, solution.rangeBitwiseAnd(8, 8));
    }

    @Test
    void powerOfTwo() {
        assertEquals(0, solution.rangeBitwiseAnd(2, 3));
    }

    @Test
    void allOnes() {
        assertEquals(1, solution.rangeBitwiseAnd(1, 3));
    }

    @Test
    void singleBit() {
        assertEquals(0, solution.rangeBitwiseAnd(0, 1));
    }

    @Test
    void largeRange() {
        assertEquals(0, solution.rangeBitwiseAnd(1, 2147483647));
    }
}
