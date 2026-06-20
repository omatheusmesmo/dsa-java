package dev.omatheus.dsa.binary_search.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KokoEatingBananasTest {

    private final KokoEatingBananas solution = new KokoEatingBananas();

    @Test
    void basicCase() {
        assertEquals(4, solution.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
    }

    @Test
    void singlePile() {
        assertEquals(1, solution.minEatingSpeed(new int[]{30}, 30));
    }

    @Test
    void hEqualsLength() {
        assertEquals(7, solution.minEatingSpeed(new int[]{3, 6, 7, 11}, 4));
    }

    @Test
    void kIsOne() {
        assertEquals(1, solution.minEatingSpeed(new int[]{1, 1, 1}, 3));
    }

    @Test
    void largePiles() {
        assertEquals(2, solution.minEatingSpeed(new int[]{1000000000}, 1000000000));
    }

    @Test
    void allSame() {
        assertEquals(5, solution.minEatingSpeed(new int[]{5, 5, 5, 5}, 4));
    }
}
