package dev.omatheus.dsa.math.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {

    private final IntegerToRoman solution = new IntegerToRoman();

    @Test
    void basicConversion() {
        assertEquals("III", solution.intToRoman(3));
    }

    @Test
    void subtraction() {
        assertEquals("IV", solution.intToRoman(4));
    }

    @Test
    void minNumber() {
        assertEquals("I", solution.intToRoman(1));
    }

    @Test
    void maxNumber() {
        assertEquals("MMMCMXCIX", solution.intToRoman(3999));
    }

    @Test
    void complexNumber() {
        assertEquals("MCMXCIV", solution.intToRoman(1994));
    }

    @Test
    void allSymbols() {
        assertEquals("MDCLXVI", solution.intToRoman(1666));
    }
}
