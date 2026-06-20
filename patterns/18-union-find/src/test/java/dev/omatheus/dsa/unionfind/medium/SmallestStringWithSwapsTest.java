package dev.omatheus.dsa.unionfind.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class SmallestStringWithSwapsTest {

    private final SmallestStringWithSwaps solution = new SmallestStringWithSwaps();

    @Test
    void basicCase() {
        assertEquals("bacd", solution.smallestStringWithSwaps("dcab", List.of(List.of(0, 3), List.of(1, 2))));
    }

    @Test
    void noSwaps() {
        assertEquals("abc", solution.smallestStringWithSwaps("abc", List.of()));
    }

    @Test
    void allSwaps() {
        assertEquals("abcd", solution.smallestStringWithSwaps("dcba", List.of(List.of(0, 3), List.of(1, 2))));
    }

    @Test
    void singlePair() {
        assertEquals("bac", solution.smallestStringWithSwaps("abc", List.of(List.of(0, 1))));
    }

    @Test
    void complexSwaps() {
        String result = solution.smallestStringWithSwaps("cba", List.of(List.of(0, 1), List.of(1, 2)));
        assertEquals("abc", result);
    }

    @Test
    void alreadySorted() {
        assertEquals("abc", solution.smallestStringWithSwaps("abc", List.of(List.of(0, 1))));
    }
}
