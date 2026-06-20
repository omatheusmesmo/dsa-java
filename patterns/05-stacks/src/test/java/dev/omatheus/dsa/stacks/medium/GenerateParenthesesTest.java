package dev.omatheus.dsa.stacks.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {

    private final GenerateParentheses solution = new GenerateParentheses();

    @Test
    void n1() {
        List<String> result = solution.generateParenthesis(1);
        assertEquals(1, result.size());
        assertTrue(result.contains("()"));
    }

    @Test
    void n2() {
        List<String> result = solution.generateParenthesis(2);
        assertEquals(2, result.size());
        assertTrue(result.contains("(())"));
        assertTrue(result.contains("()()"));
    }

    @Test
    void n3() {
        List<String> result = solution.generateParenthesis(3);
        assertEquals(5, result.size());
    }

    @Test
    void n4() {
        List<String> result = solution.generateParenthesis(4);
        assertEquals(14, result.size());
    }

    @Test
    void n5() {
        List<String> result = solution.generateParenthesis(5);
        assertEquals(42, result.size());
    }

    @Test
    void verifyAllValid() {
        List<String> result = solution.generateParenthesis(3);
        for (String s : result) {
            assertTrue(isValid(s));
        }
    }

    @Test
    void correctCount() {
        assertEquals(5, solution.generateParenthesis(3).size());
    }

    @Test
    void noEmptyResults() {
        assertFalse(solution.generateParenthesis(1).isEmpty());
    }

    private boolean isValid(String s) {
        int balance = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return balance == 0;
    }
}
