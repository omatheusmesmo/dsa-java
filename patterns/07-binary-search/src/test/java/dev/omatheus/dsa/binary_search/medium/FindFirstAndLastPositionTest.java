package dev.omatheus.dsa.binary_search.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindFirstAndLastPositionTest {

    private final FindFirstAndLastPosition solution = new FindFirstAndLastPosition();

    @Test
    void basicFound() {
        assertArrayEquals(new int[]{3, 4}, solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }

    @Test
    void notFound() {
        assertArrayEquals(new int[]{-1, -1}, solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));
    }

    @Test
    void singleElement() {
        assertArrayEquals(new int[]{0, 0}, solution.searchRange(new int[]{1}, 1));
        assertArrayEquals(new int[]{-1, -1}, solution.searchRange(new int[]{1}, 2));
    }

    @Test
    void allSame() {
        assertArrayEquals(new int[]{0, 2}, solution.searchRange(new int[]{3, 3, 3}, 3));
    }

    @Test
    void targetAtStart() {
        assertArrayEquals(new int[]{0, 0}, solution.searchRange(new int[]{1, 2, 3, 4, 5}, 1));
    }

    @Test
    void targetAtEnd() {
        assertArrayEquals(new int[]{4, 4}, solution.searchRange(new int[]{1, 2, 3, 4, 5}, 5));
    }

    @Test
    void multipleOccurrences() {
        assertArrayEquals(new int[]{1, 3}, solution.searchRange(new int[]{1, 2, 2, 2, 3}, 2));
    }
}
