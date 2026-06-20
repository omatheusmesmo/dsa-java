package dev.omatheus.dsa.bitmanipulation.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class LonelyIntegerHackerRankTest {

    private final LonelyIntegerHackerRank solution = new LonelyIntegerHackerRank();

    @Test
    void basicCase() {
        assertEquals(4, solution.lonelyInteger(List.of(1, 2, 3, 4, 3, 2, 1)));
    }

    @Test
    void singleElement() {
        assertEquals(5, solution.lonelyInteger(List.of(5)));
    }

    @Test
    void threeElements() {
        assertEquals(3, solution.lonelyInteger(List.of(1, 1, 3)));
    }

    @Test
    void fiveElements() {
        assertEquals(5, solution.lonelyInteger(List.of(1, 1, 2, 2, 5)));
    }

    @Test
    void allSameExceptOne() {
        assertEquals(99, solution.lonelyInteger(List.of(7, 7, 7, 7, 7, 7, 99)));
    }

    @Test
    void negativeNumbers() {
        assertEquals(-2, solution.lonelyInteger(List.of(-1, -1, -2)));
    }
}
