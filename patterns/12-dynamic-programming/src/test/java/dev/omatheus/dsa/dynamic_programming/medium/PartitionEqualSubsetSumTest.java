package dev.omatheus.dsa.dynamic_programming.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartitionEqualSubsetSumTest {

    private final PartitionEqualSubsetSum solution = new PartitionEqualSubsetSum();

    @Test
    void basicTrue() {
        assertTrue(solution.canPartition(new int[]{1, 5, 11, 5}));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.canPartition(new int[]{1, 2, 3, 5}));
    }

    @Test
    void singleElement() {
        assertFalse(solution.canPartition(new int[]{1}));
    }

    @Test
    void twoElements() {
        assertTrue(solution.canPartition(new int[]{1, 1}));
        assertFalse(solution.canPartition(new int[]{1, 2}));
    }

    @Test
    void allSame() {
        assertTrue(solution.canPartition(new int[]{2, 2, 2, 2}));
    }

    @Test
    void oddSum() {
        assertFalse(solution.canPartition(new int[]{1, 2, 3}));
    }

    @Test
    void evenSum() {
        assertTrue(solution.canPartition(new int[]{1, 2, 3, 4}));
    }
}
