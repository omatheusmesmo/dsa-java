package dev.omatheus.dsa.greedy.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HandOfStraightsTest {

    private final HandOfStraights solution = new HandOfStraights();

    @Test
    void basicTrue() {
        assertTrue(solution.isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.isNStraightHand(new int[]{1, 2, 3, 4, 5}, 4));
    }

    @Test
    void singleGroup() {
        assertTrue(solution.isNStraightHand(new int[]{1, 2, 3}, 3));
    }

    @Test
    void allSame() {
        assertFalse(solution.isNStraightHand(new int[]{3, 3, 3, 3}, 2));
    }

    @Test
    void twoGroups() {
        assertTrue(solution.isNStraightHand(new int[]{1, 2, 3, 1, 2, 3}, 3));
    }

    @Test
    void impossible() {
        assertFalse(solution.isNStraightHand(new int[]{1, 2, 3, 4, 5, 6}, 4));
    }
}
