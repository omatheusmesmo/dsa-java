package dev.omatheus.dsa.binary_search.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {

    @Test
    void firstIsBad() {
        FirstBadVersion fbv = new FirstBadVersion() {
            @Override
            protected boolean isBadVersion(int version) {
                return version >= 1;
            }
        };
        assertEquals(1, fbv.firstBadVersion(5));
    }

    @Test
    void lastIsBad() {
        FirstBadVersion fbv = new FirstBadVersion() {
            @Override
            protected boolean isBadVersion(int version) {
                return version >= 5;
            }
        };
        assertEquals(5, fbv.firstBadVersion(5));
    }

    @Test
    void middleIsBad() {
        FirstBadVersion fbv = new FirstBadVersion() {
            @Override
            protected boolean isBadVersion(int version) {
                return version >= 3;
            }
        };
        assertEquals(3, fbv.firstBadVersion(5));
    }

    @Test
    void allGood() {
        FirstBadVersion fbv = new FirstBadVersion() {
            @Override
            protected boolean isBadVersion(int version) {
                return false;
            }
        };
        assertEquals(-1, fbv.firstBadVersion(5));
    }

    @Test
    void allBad() {
        FirstBadVersion fbv = new FirstBadVersion() {
            @Override
            protected boolean isBadVersion(int version) {
                return true;
            }
        };
        assertEquals(1, fbv.firstBadVersion(1));
    }

    @Test
    void singleVersion() {
        FirstBadVersion fbv = new FirstBadVersion() {
            @Override
            protected boolean isBadVersion(int version) {
                return true;
            }
        };
        assertEquals(1, fbv.firstBadVersion(1));
    }
}
