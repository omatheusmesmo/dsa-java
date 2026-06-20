package dev.omatheus.dsa.slidingwindow.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarrayITest {

    private final MaximumAverageSubarrayI solution = new MaximumAverageSubarrayI();

    @Test
    void basicCase() {
        assertEquals(12.75, solution.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4), 0.0001);
    }

    @Test
    void allSame() {
        assertEquals(5.0, solution.findMaxAverage(new int[]{5, 5, 5, 5}, 2), 0.0001);
    }

    @Test
    void singleElement() {
        assertEquals(3.0, solution.findMaxAverage(new int[]{3}, 1), 0.0001);
    }

    @Test
    void allPositive() {
        assertEquals(4.0, solution.findMaxAverage(new int[]{1, 2, 3, 4, 5}, 1), 0.0001);
    }

    @Test
    void allNegative() {
        assertEquals(-1.0, solution.findMaxAverage(new int[]{-5, -3, -1, -2}, 2), 0.0001);
    }

    @Test
    void kEqualsLength() {
        assertEquals(2.0, solution.findMaxAverage(new int[]{1, 2, 3}, 3), 0.0001);
    }
}
