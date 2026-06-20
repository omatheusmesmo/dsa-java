package dev.omatheus.dsa.prefixsum.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeSumQueryImmutableTest {

    @Test
    void basicRange() {
        RangeSumQueryImmutable obj = new RangeSumQueryImmutable(new int[]{-2, 0, 3, -5, 2, -1});
        assertEquals(1, obj.sumRange(0, 2));
        assertEquals(-1, obj.sumRange(2, 5));
        assertEquals(-3, obj.sumRange(0, 5));
    }

    @Test
    void singleElement() {
        RangeSumQueryImmutable obj = new RangeSumQueryImmutable(new int[]{5});
        assertEquals(5, obj.sumRange(0, 0));
    }

    @Test
    void fullRange() {
        RangeSumQueryImmutable obj = new RangeSumQueryImmutable(new int[]{1, 2, 3, 4, 5});
        assertEquals(15, obj.sumRange(0, 4));
    }

    @Test
    void consecutiveRanges() {
        RangeSumQueryImmutable obj = new RangeSumQueryImmutable(new int[]{1, 2, 3, 4, 5});
        assertEquals(3, obj.sumRange(0, 1));
        assertEquals(5, obj.sumRange(1, 2));
        assertEquals(7, obj.sumRange(2, 3));
    }

    @Test
    void negativeNumbers() {
        RangeSumQueryImmutable obj = new RangeSumQueryImmutable(new int[]{-1, -2, -3, -4, -5});
        assertEquals(-3, obj.sumRange(0, 1));
        assertEquals(-15, obj.sumRange(0, 4));
    }
}
