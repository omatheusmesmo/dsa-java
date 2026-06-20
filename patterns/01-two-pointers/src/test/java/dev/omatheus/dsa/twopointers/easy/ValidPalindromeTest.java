package dev.omatheus.dsa.twopointers.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    private final ValidPalindrome solution = new ValidPalindrome();

    @Test
    void basicPalindrome() {
        assertTrue(solution.isPalindrome("racecar"));
    }

    @Test
    void withSpaces() {
        assertTrue(solution.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    void withPunctuation() {
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void emptyString() {
        assertTrue(solution.isPalindrome(""));
    }

    @Test
    void singleChar() {
        assertTrue(solution.isPalindrome("a"));
    }

    @Test
    void mixedCase() {
        assertTrue(solution.isPalindrome("RaceCar"));
    }

    @Test
    void allSpecialChars() {
        assertTrue(solution.isPalindrome("!!!@@@###"));
    }

    @Test
    void numericPalindrome() {
        assertTrue(solution.isPalindrome("12321"));
    }
}
