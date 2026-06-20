package dev.omatheus.dsa.math.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    private final RomanToInteger solution = new RomanToInteger();

    @Test
    void basicConversion() {
        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    void subtraction() {
        assertEquals(4, solution.romanToInt("IV"));
    }

    @Test
    void singleChar() {
        assertEquals(5, solution.romanToInt("V"));
    }

    @Test
    void maxNumber() {
        assertEquals(3999, solution.romanToInt("MMMCMXCIX"));
    }

    @Test
    void complexNumber() {
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }

    @Test
    void allSymbols() {
        assertEquals(1666, solution.romanToInt("MDCLXVI"));
    }
}
