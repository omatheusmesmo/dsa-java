package dev.omatheus.dsa.stacks.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotationTest {

    private final EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();

    @Test
    void basicAddition() {
        assertEquals(3, solution.evalRPN(new String[]{"2", "1", "+"}));
    }

    @Test
    void basicSubtraction() {
        assertEquals(1, solution.evalRPN(new String[]{"3", "2", "-"}));
    }

    @Test
    void basicMultiplication() {
        assertEquals(6, solution.evalRPN(new String[]{"2", "3", "*"}));
    }

    @Test
    void division() {
        assertEquals(2, solution.evalRPN(new String[]{"6", "3", "/"}));
    }

    @Test
    void complexExpression() {
        assertEquals(9, solution.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

    @Test
    void singleNumber() {
        assertEquals(5, solution.evalRPN(new String[]{"5"}));
    }

    @Test
    void negativeNumbers() {
        assertEquals(-3, solution.evalRPN(new String[]{"-2", "1", "-"}));
    }

    @Test
    void divisionByZero() {
        assertEquals(0, solution.evalRPN(new String[]{"0", "1", "/"}));
    }
}
