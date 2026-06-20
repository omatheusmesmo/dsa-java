# Binary Search

## Pattern Overview

Binary Search is an efficient algorithm for finding an item from a sorted list of items. It works by repeatedly dividing the search interval in half. If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. Otherwise, narrow it to the upper half.

## Key Concepts

### Classic Binary Search
- Works on sorted arrays
- Time complexity: O(log n)
- Space complexity: O(1) iterative, O(log n) recursive

### Binary Search Variants
1. **Search in Rotated Array**: Array is sorted but rotated at some pivot
2. **Binary Search on Answer (Minimax)**: Search for optimal value in a range
3. **Boundary Finding**: Find first/last occurrence of an element

## When to Use
- Sorted arrays
- Searching with monotonic property
- Finding optimal value in a sorted/range space
- Problems where brute force is O(n) but can be optimized to O(log n)

## Common Patterns
- `left <= right` for finding exact match
- `left < right` for finding boundary/insertion point
- `mid = left + (right - left) / 2` to avoid overflow
- Update `left = mid + 1` or `right = mid` (not `mid - 1` or `mid + 1` carelessly)

## Problems
| Difficulty | Problem | Key Insight |
|------------|---------|-------------|
| Easy | Binary Search | Classic implementation |
| Easy | First Bad Version | Find first true in sorted bool array |
| Easy | Search Insert Position | Find insertion point |
| Medium | Search a 2D Matrix | Flatten to 1D binary search |
| Medium | Find Peak Element | Local maximum with binary search |
| Medium | Search in Rotated Sorted Array | Modified binary search |
| Medium | Find First and Last Position | Two binary searches |
| Medium | Find Minimum in Rotated Sorted Array | Find pivot point |
| Medium | Koko Eating Bananas | Binary search on answer |
| Medium | Time Based Key-Value Store | Binary search on timestamps |
| Hard | Median of Two Sorted Arrays | Binary search on partition |
