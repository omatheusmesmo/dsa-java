package dev.omatheus.dsa.prefixsum.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContiguousArrayTest {

    private final ContiguousArray solution = new ContiguousArray();

    @Test
    void basicCase() {
        assertEquals(2, solution.findMaxLength(new int[]{0, 1}));
    }

    @Test
    void allOnes() {
        assertEquals(0, solution.findMaxLength(new int[]{1, 1, 1, 1}));
    }

    @Test
    void allZeros() {
        assertEquals(0, solution.findMaxLength(new int[]{0, 0, 0, 0}));
    }

    @Test
    void alternating() {
        assertEquals(4, solution.findMaxLength(new int[]{0, 1, 0, 1}));
    }

    @Test
    void singleElement() {
        assertEquals(0, solution.findMaxLength(new int[]{0}));
    }

    @Test
    void noSubarray() {
        assertEquals(0, solution.findMaxLength(new int[]{0, 0, 1}));
    }

    @Test
    void entireArray() {
        assertEquals(6, solution.findMaxLength(new int[]{0, 0, 1, 0, 0, 0, 1, 1}));
    }
}
