package dev.omatheus.dsa.stacks.easy;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/min-stack/">155. Min Stack</a> (Easy)
 *
 * <p>Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin(); // return -3
 * minStack.pop();
 * minStack.top();    // return 0
 * minStack.getMin(); // return -2
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>-2^31 <= val <= 2^31 - 1</li>
 *   <li>Methods pop, top and getMin operations will always be called on non-empty stacks</li>
 *   <li>At most 3 * 10^4 calls</li>
 * </ul>
 *
 * @see dev.omatheus.dsa.stacks.easy.MinStackTest
 */
public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        throw new UnsupportedOperationException("Solve this problem!");
    }

    /**
     * Pushes a value onto the stack.
     *
     * @param val the value to push
     */
    public void push(int val) {
        throw new UnsupportedOperationException("Solve this problem!");
    }

    /**
     * Removes the element on top of the stack.
     */
    public void pop() {
        throw new UnsupportedOperationException("Solve this problem!");
    }

    /**
     * Gets the top element of the stack.
     *
     * @return the top element
     */
    public int top() {
        throw new UnsupportedOperationException("Solve this problem!");
    }

    /**
     * Retrieves the minimum element in the stack.
     *
     * @return the minimum element
     */
    public int getMin() {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
