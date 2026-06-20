package dev.omatheus.dsa.bitmanipulation.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class FlippingBitsHackerRankTest {

    private final FlippingBitsHackerRank solution = new FlippingBitsHackerRank();

    @Test
    void basicCase() {
        long result = solution.flippingBits(List.of(1L, 2L, 3L));
        assertEquals(4294967294L, result);
    }

    @Test
    void allOnes() {
        long result = solution.flippingBits(List.of(0xFFFFFFFFL));
        assertEquals(0L, result);
    }

    @Test
    void allZeros() {
        long result = solution.flippingBits(List.of(0L));
        assertEquals(4294967295L, result);
    }

    @Test
    void alternating() {
        long result = solution.flippingBits(List.of(0xAAAAAAAAAAAAAAAAL));
        assertEquals(0x5555555555555555L, result);
    }

    @Test
    void largeNumbers() {
        long result = solution.flippingBits(List.of(2147483647L));
        assertEquals(2147483648L, result);
    }

    @Test
    void singleElement() {
        long result = solution.flippingBits(List.of(4294967295L));
        assertEquals(0L, result);
    }
}
