package dev.omatheus.dsa.heaps.hard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMedianFromDataStreamTest {

    @Test
    void basicAddFind() {
        FindMedianFromDataStream mf = new FindMedianFromDataStream();
        mf.addNum(1);
        mf.addNum(2);
        assertEquals(1.5, mf.findMedian(), 0.00001);
        mf.addNum(3);
        assertEquals(2.0, mf.findMedian(), 0.00001);
    }

    @Test
    void singleElement() {
        FindMedianFromDataStream mf = new FindMedianFromDataStream();
        mf.addNum(5);
        assertEquals(5.0, mf.findMedian(), 0.00001);
    }

    @Test
    void twoElements() {
        FindMedianFromDataStream mf = new FindMedianFromDataStream();
        mf.addNum(1);
        mf.addNum(2);
        assertEquals(1.5, mf.findMedian(), 0.00001);
    }

    @Test
    void multipleElements() {
        FindMedianFromDataStream mf = new FindMedianFromDataStream();
        mf.addNum(1);
        mf.addNum(2);
        mf.addNum(3);
        mf.addNum(4);
        mf.addNum(5);
        assertEquals(3.0, mf.findMedian(), 0.00001);
    }

    @Test
    void negativeNumbers() {
        FindMedianFromDataStream mf = new FindMedianFromDataStream();
        mf.addNum(-1);
        mf.addNum(-2);
        mf.addNum(-3);
        assertEquals(-2.0, mf.findMedian(), 0.00001);
    }

    @Test
    void largeStream() {
        FindMedianFromDataStream mf = new FindMedianFromDataStream();
        for (int i = 1; i <= 1000; i++) {
            mf.addNum(i);
        }
        assertEquals(500.5, mf.findMedian(), 0.00001);
    }

    @Test
    void alternatingSigns() {
        FindMedianFromDataStream mf = new FindMedianFromDataStream();
        mf.addNum(-1);
        mf.addNum(2);
        mf.addNum(-3);
        mf.addNum(4);
        assertEquals(0.5, mf.findMedian(), 0.00001);
    }
}
