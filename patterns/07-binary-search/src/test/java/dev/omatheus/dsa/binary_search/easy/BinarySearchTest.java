package dev.omatheus.dsa.binary_search.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private final BinarySearch solution = new BinarySearch();

    @Test
    void basicFound() {
        assertEquals(4, solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    @Test
    void basicNotFound() {
        assertEquals(-1, solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

    @Test
    void singleElement() {
        assertEquals(0, solution.search(new int[]{5}, 5));
    }

    @Test
    void twoElements() {
        assertEquals(0, solution.search(new int[]{1, 3}, 1));
        assertEquals(1, solution.search(new int[]{1, 3}, 3));
    }

    @Test
    void firstElement() {
        assertEquals(0, solution.search(new int[]{-10, -5, 0, 5, 10}, -10));
    }

    @Test
    void lastElement() {
        assertEquals(4, solution.search(new int[]{-10, -5, 0, 5, 10}, 10));
    }

    @Test
    void targetBetween() {
        assertEquals(-1, solution.search(new int[]{-10, -5, 0, 5, 10}, 3));
    }
}
