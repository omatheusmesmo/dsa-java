package dev.omatheus.dsa.binary_search.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArrayTest {

    private final SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();

    @Test
    void basicFound() {
        assertEquals(4, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    @Test
    void basicNotFound() {
        assertEquals(-1, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }

    @Test
    void singleElement() {
        assertEquals(0, solution.search(new int[]{1}, 1));
    }

    @Test
    void twoElements() {
        assertEquals(0, solution.search(new int[]{3, 1}, 3));
        assertEquals(1, solution.search(new int[]{3, 1}, 1));
    }

    @Test
    void pivotAtStart() {
        assertEquals(0, solution.search(new int[]{1}, 1));
    }

    @Test
    void pivotAtEnd() {
        assertEquals(3, solution.search(new int[]{2, 1}, 2));
    }

    @Test
    void noRotation() {
        assertEquals(2, solution.search(new int[]{1, 2, 3, 4, 5}, 3));
    }

    @Test
    void fullRotation() {
        assertEquals(2, solution.search(new int[]{1, 2, 3, 4, 5}, 3));
    }
}
