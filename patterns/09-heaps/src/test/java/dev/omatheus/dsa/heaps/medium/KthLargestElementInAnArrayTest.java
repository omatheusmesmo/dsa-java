package dev.omatheus.dsa.heaps.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementInAnArrayTest {

    private final KthLargestElementInAnArray solution = new KthLargestElementInAnArray();

    @Test
    void basicCase() {
        assertEquals(5, solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    void kEqualsOne() {
        assertEquals(5, solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 1));
    }

    @Test
    void kEqualsLength() {
        assertEquals(1, solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 6));
    }

    @Test
    void allSame() {
        assertEquals(3, solution.findKthLargest(new int[]{3, 3, 3, 3}, 2));
    }

    @Test
    void negativeNumbers() {
        assertEquals(0, solution.findKthLargest(new int[]{-1, -2, -3, 0}, 1));
    }

    @Test
    void singleElement() {
        assertEquals(1, solution.findKthLargest(new int[]{1}, 1));
    }

    @Test
    void duplicates() {
        assertEquals(4, solution.findKthLargest(new int[]{4, 4, 4, 4, 4, 4}, 3));
    }
}
