package dev.omatheus.dsa.math.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultiplyStringsTest {

    private final MultiplyStrings solution = new MultiplyStrings();

    @Test
    void basicCase() {
        assertEquals("6", solution.multiply("2", "3"));
    }

    @Test
    void singleDigit() {
        assertEquals("12", solution.multiply("3", "4"));
    }

    @Test
    void withZeros() {
        assertEquals("0", solution.multiply("0", "123"));
    }

    @Test
    void largeNumbers() {
        assertEquals("121932631112635269", solution.multiply("123456789", "987654321"));
    }

    @Test
    void bothSingle() {
        assertEquals("81", solution.multiply("9", "9"));
    }

    @Test
    void complexMultiplication() {
        assertEquals("56088", solution.multiply("123", "456"));
    }
}
