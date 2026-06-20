package dev.omatheus.dsa.dynamic_programming.hard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EditDistanceTest {

    private final EditDistance solution = new EditDistance();

    @Test
    void basicCase() {
        assertEquals(3, solution.minDistance("horse", "ros"));
    }

    @Test
    void emptyStrings() {
        assertEquals(3, solution.minDistance("", "abc"));
        assertEquals(3, solution.minDistance("abc", ""));
    }

    @Test
    void identical() {
        assertEquals(0, solution.minDistance("abc", "abc"));
    }

    @Test
    void singleChar() {
        assertEquals(1, solution.minDistance("a", "b"));
        assertEquals(0, solution.minDistance("a", "a"));
    }

    @Test
    void allDifferent() {
        assertEquals(6, solution.minDistance("abc", "xyz"));
    }

    @Test
    void complexStrings() {
        assertEquals(5, solution.minDistance("intention", "execution"));
    }
}
