package dev.omatheus.dsa.math.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    private final PalindromeNumber solution = new PalindromeNumber();

    @Test
    void basicTrue() {
        assertTrue(solution.isPalindrome(121));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.isPalindrome(-121));
    }

    @Test
    void negativeNumber() {
        assertFalse(solution.isPalindrome(-1));
    }

    @Test
    void trailingZero() {
        assertFalse(solution.isPalindrome(10));
    }

    @Test
    void singleDigit() {
        assertTrue(solution.isPalindrome(5));
    }

    @Test
    void allSame() {
        assertTrue(solution.isPalindrome(1111));
    }

    @Test
    void largeNumber() {
        assertTrue(solution.isPalindrome(1234321));
    }
}
