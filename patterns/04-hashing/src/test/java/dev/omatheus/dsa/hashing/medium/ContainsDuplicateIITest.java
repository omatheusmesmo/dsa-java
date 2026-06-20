package dev.omatheus.dsa.hashing.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateIITest {

    private final ContainsDuplicateII solution = new ContainsDuplicateII();

    @Test
    void basicTrue() {
        assertTrue(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

    @Test
    void kZero() {
        assertFalse(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 0));
    }

    @Test
    void singleElement() {
        assertFalse(solution.containsNearbyDuplicate(new int[]{1}, 0));
    }

    @Test
    void twoElements() {
        assertTrue(solution.containsNearbyDuplicate(new int[]{1, 1}, 1));
    }

    @Test
    void allSame() {
        assertTrue(solution.containsNearbyDuplicate(new int[]{5, 5, 5, 5}, 1));
    }

    @Test
    void noDuplicates() {
        assertFalse(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 4, 5}, 2));
    }
}
