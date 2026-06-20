# Stacks Pattern

The Stacks pattern leverages the LIFO (Last In, First Out) data structure to solve problems involving nested structures, monotonic sequences, and expression evaluation.

## Core Idea

A stack maintains elements in order of insertion, with the most recently added element being the first to be removed. This makes it ideal for problems where we need to match or compare with previous elements.

## Key Applications

### 1. Balanced Parentheses
- Push opening brackets, pop on closing brackets
- Check if stack is empty at the end
- Example: Valid Parentheses, Min Stack

### 2. Monotonic Stack
- Maintain stack in increasing or decreasing order
- Find next greater/smaller element
- Example: Daily Temperatures, Largest Rectangle in Histogram

### 3. Expression Evaluation
- Convert infix to postfix (Shunting Yard)
- Evaluate Reverse Polish Notation
- Example: Evaluate RPN, Generate Parentheses

### 4. DFS Traversal
- Iterative DFS using explicit stack
- Simulate recursion

## When to Use

- Matching brackets/parentheses
- Finding next greater/smaller element
- Evaluating expressions
- Problems requiring "remembering" previous elements
- Nested structures (nested lists, matrices)

## Key Patterns

```java
// Balanced Parentheses
Stack<Character> stack = new Stack<>();
for (char c : s.toCharArray()) {
    if (c == '(') stack.push(')');
    else if (stack.isEmpty() || stack.pop() != c) return false;
}
return stack.isEmpty();

// Monotonic Stack (Next Greater Element)
Stack<Integer> stack = new Stack<>();
int[] result = new int[arr.length];
for (int i = arr.length - 1; i >= 0; i--) {
    while (!stack.isEmpty() && stack.peek() <= arr[i]) {
        stack.pop();
    }
    result[i] = stack.isEmpty() ? -1 : stack.peek();
    stack.push(arr[i]);
}
```

## Complexity Analysis

- Time: O(n) - each element is pushed/popped at most once
- Space: O(n) - stack storage
