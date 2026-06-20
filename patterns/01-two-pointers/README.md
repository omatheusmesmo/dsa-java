# Two Pointers Pattern

The Two Pointers pattern uses two index pointers to traverse a data structure, typically an array or linked list, reducing time complexity from O(n²) to O(n).

## Core Idea

Instead of using nested loops to compare every pair of elements, we maintain two pointers that move according to specific rules, allowing us to solve problems in linear or near-linear time.

## Three Flavors

### 1. Opposite Direction (Converging)
- Start from both ends and move toward the center
- Use when: array is sorted, looking for pairs that satisfy a condition
- Example: Two Sum II, Container With Most Water, Valid Palindrome

### 2. Same Direction (Fast/Slow)
- Both pointers move in the same direction but at different speeds
- Use when: detecting cycles, finding middle elements
- Example: Linked List Cycle, Happy Number

### 3. Partitioning
- Both pointers move in the same direction, maintaining a boundary
- Use when: separating elements based on a condition
- Example: Sort Colors, Move Zeroes

## When to Use

- Input is a sorted array (or can be sorted)
- Need to find pairs or elements that satisfy a condition
- Comparing elements from both ends of the data structure
- Removing duplicates or partitioning arrays
- Palindrome checking

## Key Patterns

```java
// Opposite Direction
int left = 0, right = arr.length - 1;
while (left < right) {
    // process arr[left] and arr[right]
    if (condition) left++;
    else right--;
}

// Same Direction (Fast/Slow)
int slow = 0;
for (int fast = 0; fast < arr.length; fast++) {
    if (condition) arr[slow++] = arr[fast];
}

// Partitioning
int left = 0;
for (int right = 0; right < arr.length; right++) {
    if (condition) swap(arr, left++, right);
}
```

## Complexity Analysis

- Time: Typically O(n) - single pass or two passes
- Space: O(1) - in-place operations
