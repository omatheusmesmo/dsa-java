# Sliding Window Pattern

The Sliding Window pattern maintains a window of elements and slides it across the data structure, typically an array or string, to solve problems involving contiguous subarrays or substrings.

## Core Idea

Instead of using nested loops to check every possible subarray (O(n²)), we maintain a window that can expand or contract as we iterate through the data, achieving O(n) time complexity.

## Two Types

### 1. Fixed Size Window
- Window size is predetermined (k)
- Slide the window by removing the leftmost element and adding the next element
- Use when: finding max/min in subarrays of size k

### 2. Variable Size Window
- Window expands and contracts based on a condition
- Use when: finding longest/shortest subarray satisfying a condition

## When to Use

- Contiguous subarrays or substrings
- Maximum/minimum sum in window of size k
- Longest substring with certain properties
- Minimum window containing all required elements
- Problems asking for consecutive elements

## Key Patterns

```java
// Fixed Size Window
int windowSum = 0;
for (int i = 0; i < k; i++) windowSum += arr[i];
int maxSum = windowSum;
for (int i = k; i < arr.length; i++) {
    windowSum += arr[i] - arr[i - k];
    maxSum = Math.max(maxSum, windowSum);
}

// Variable Size Window (Longest)
int left = 0, maxLen = 0;
for (int right = 0; right < arr.length; right++) {
    // expand window
    while (condition) {
        // shrink window
        left++;
    }
    maxLen = Math.max(maxLen, right - left + 1);
}

// Variable Size Window (Shortest)
int left = 0, minLen = Integer.MAX_VALUE;
for (int right = 0; right < arr.length; right++) {
    // expand window
    while (condition) {
        minLen = Math.min(minLen, right - left + 1);
        // shrink window
        left++;
    }
}
```

## Complexity Analysis

- Time: Typically O(n) - single pass or two passes
- Space: O(1) or O(k) depending on the problem
