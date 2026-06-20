package dev.omatheus.dsa.backtracking.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class LetterCombinationsOfPhoneNumberTest {

    private final LetterCombinationsOfPhoneNumber solution = new LetterCombinationsOfPhoneNumber();

    @Test
    void basicCase() {
        List<String> result = solution.letterCombinations("23");
        assertEquals(9, result.size());
    }

    @Test
    void emptyInput() {
        List<String> result = solution.letterCombinations("");
        assertTrue(result.isEmpty());
    }

    @Test
    void singleDigit() {
        List<String> result = solution.letterCombinations("2");
        assertEquals(3, result.size());
    }

    @Test
    void twoDigits() {
        List<String> result = solution.letterCombinations("23");
        assertEquals(9, result.size());
    }

    @Test
    void allNines() {
        List<String> result = solution.letterCombinations("99");
        assertEquals(16, result.size());
    }

    @Test
    void allTwos() {
        List<String> result = solution.letterCombinations("22");
        assertEquals(9, result.size());
    }

    @Test
    void complexInput() {
        List<String> result = solution.letterCombinations("234");
        assertEquals(27, result.size());
    }
}
