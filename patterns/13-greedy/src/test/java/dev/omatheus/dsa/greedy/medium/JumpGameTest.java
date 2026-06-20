package dev.omatheus.dsa.greedy.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {

    private final JumpGame solution = new JumpGame();

    @Test
    void basicTrue() {
        assertTrue(solution.canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    @Test
    void singleElement() {
        assertTrue(solution.canJump(new int[]{0}));
    }

    @Test
    void allZeros() {
        assertFalse(solution.canJump(new int[]{0, 0, 0}));
    }

    @Test
    void allOnes() {
        assertTrue(solution.canJump(new int[]{1, 1, 1, 1}));
    }

    @Test
    void largeJumps() {
        assertTrue(solution.canJump(new int[]{10, 0, 0, 0, 0}));
    }

    @Test
    void stuckMiddle() {
        assertFalse(solution.canJump(new int[]{2, 0, 0, 0}));
    }
}
