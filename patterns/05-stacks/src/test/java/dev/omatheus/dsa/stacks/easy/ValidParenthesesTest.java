package dev.omatheus.dsa.stacks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    private final ValidParentheses solution = new ValidParentheses();

    @Test
    void basicTrue() {
        assertTrue(solution.isValid("()"));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.isValid("(]"));
    }

    @Test
    void nested() {
        assertTrue(solution.isValid("([{}])"));
    }

    @Test
    void interleaved() {
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void singleChar() {
        assertFalse(solution.isValid("("));
    }

    @Test
    void empty() {
        assertTrue(solution.isValid(""));
    }

    @Test
    void unmatchedOpen() {
        assertFalse(solution.isValid("((()"));
    }

    @Test
    void unmatchedClose() {
        assertFalse(solution.isValid("())"));
    }

    @Test
    void complexNested() {
        assertTrue(solution.isValid("{[()]}"));
    }
}
