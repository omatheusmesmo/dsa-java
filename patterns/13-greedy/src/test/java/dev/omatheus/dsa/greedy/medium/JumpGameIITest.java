package dev.omatheus.dsa.greedy.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JumpGameIITest {

    private final JumpGameII solution = new JumpGameII();

    @Test
    void basicCase() {
        assertEquals(2, solution.jump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    void singleElement() {
        assertEquals(0, solution.jump(new int[]{0}));
    }

    @Test
    void twoElements() {
        assertEquals(1, solution.jump(new int[]{2, 1}));
    }

    @Test
    void allOnes() {
        assertEquals(4, solution.jump(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    void largeJumps() {
        assertEquals(1, solution.jump(new int[]{10, 0, 0, 0}));
    }

    @Test
    void optimalPath() {
        assertEquals(2, solution.jump(new int[]{2, 3, 1, 1, 4}));
    }
}
