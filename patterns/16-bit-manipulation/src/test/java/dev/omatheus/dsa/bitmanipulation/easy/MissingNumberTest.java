package dev.omatheus.dsa.bitmanipulation.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    private final MissingNumber solution = new MissingNumber();

    @Test
    void basicCase() {
        assertEquals(2, solution.missingNumber(new int[]{3, 0, 1}));
    }

    @Test
    void singleElement() {
        assertEquals(0, solution.missingNumber(new int[]{1}));
    }

    @Test
    void missingZero() {
        assertEquals(0, solution.missingNumber(new int[]{1, 2, 3}));
    }

    @Test
    void missingLast() {
        assertEquals(3, solution.missingNumber(new int[]{0, 1, 2}));
    }

    @Test
    void shuffled() {
        assertEquals(2, solution.missingNumber(new int[]{0, 3, 1}));
    }

    @Test
    void allSameExceptOne() {
        assertEquals(9, solution.missingNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}));
    }
}
