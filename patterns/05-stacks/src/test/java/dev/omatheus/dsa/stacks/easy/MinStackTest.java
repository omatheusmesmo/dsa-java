package dev.omatheus.dsa.stacks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

    @Test
    void pushPop() {
        MinStack stack = new MinStack();
        stack.push(1);
        assertEquals(1, stack.top());
        stack.pop();
    }

    @Test
    void getMinMultiple() {
        MinStack stack = new MinStack();
        stack.push(2);
        stack.push(1);
        stack.push(3);
        assertEquals(1, stack.getMin());
    }

    @Test
    void topElement() {
        MinStack stack = new MinStack();
        stack.push(5);
        assertEquals(5, stack.top());
    }

    @Test
    void pushMin() {
        MinStack stack = new MinStack();
        stack.push(-1);
        stack.push(-2);
        assertEquals(-2, stack.getMin());
    }

    @Test
    void popMin() {
        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(1);
        stack.pop();
        assertEquals(3, stack.getMin());
    }

    @Test
    void interleavedOperations() {
        MinStack stack = new MinStack();
        stack.push(0);
        stack.push(1);
        stack.push(0);
        assertEquals(0, stack.getMin());
        stack.pop();
        assertEquals(0, stack.getMin());
    }

    @Test
    void singleElement() {
        MinStack stack = new MinStack();
        stack.push(42);
        assertEquals(42, stack.getMin());
        assertEquals(42, stack.top());
    }
}
