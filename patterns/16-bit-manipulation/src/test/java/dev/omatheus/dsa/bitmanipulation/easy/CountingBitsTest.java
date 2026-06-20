package dev.omatheus.dsa.bitmanipulation.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountingBitsTest {

    private final CountingBits solution = new CountingBits();

    @Test
    void n0() {
        assertArrayEquals(new int[]{0}, solution.countBits(0));
    }

    @Test
    void n1() {
        assertArrayEquals(new int[]{0, 1}, solution.countBits(1));
    }

    @Test
    void n5() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, solution.countBits(5));
    }

    @Test
    void n10() {
        int[] result = solution.countBits(10);
        assertEquals(11, result.length);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
        assertEquals(2, result[8]);
        assertEquals(1, result[10]);
    }

    @Test
    void singleBit() {
        assertArrayEquals(new int[]{0, 1}, solution.countBits(1));
    }

    @Test
    void allBits() {
        int[] result = solution.countBits(15);
        for (int i = 0; i <= 15; i++) {
            int expected = Integer.bitCount(i);
            assertEquals(expected, result[i]);
        }
    }
}
