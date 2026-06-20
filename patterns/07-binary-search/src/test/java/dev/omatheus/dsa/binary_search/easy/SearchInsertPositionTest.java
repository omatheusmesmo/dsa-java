package dev.omatheus.dsa.binary_search.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    private final SearchInsertPosition solution = new SearchInsertPosition();

    @Test
    void basicFound() {
        assertEquals(2, solution.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    @Test
    void insertBeginning() {
        assertEquals(0, solution.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }

    @Test
    void insertMiddle() {
        assertEquals(2, solution.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    @Test
    void insertEnd() {
        assertEquals(4, solution.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    @Test
    void singleElement() {
        assertEquals(0, solution.searchInsert(new int[]{1}, 1));
        assertEquals(1, solution.searchInsert(new int[]{1}, 2));
    }

    @Test
    void targetExactly() {
        assertEquals(3, solution.searchInsert(new int[]{1, 3, 5, 6}, 6));
    }
}
