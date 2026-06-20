# Heaps / Priority Queue

## Pattern Overview

A Heap is a specialized tree-based data structure that satisfies the heap property. In a max-heap, for any given node I, the value of I is greater than or equal to the values of its children. In a min-heap, the value of I is less than or equal to the values of its children. Heaps are commonly implemented as binary heaps using arrays.

## Key Concepts

### Heap Properties
- **Complete Binary Tree**: All levels are filled except possibly the last
- **Heap Property**: Parent is always greater (max-heap) or smaller (min-heap) than children
- **Array Representation**: For node at index i, left child at 2i+1, right child at 2i+2, parent at (i-1)/2

### Time Complexity
- Insert: O(log n)
- Extract min/max: O(log n)
- Peek at min/max: O(1)
- Build heap from array: O(n)

### Java Implementation
- `PriorityQueue<Integer>` - min-heap by default
- `PriorityQueue<Integer>(Collections.reverseOrder())` - max-heap
- `PriorityQueue<Node>(Comparator.comparingInt(...))` - custom comparator

## When to Use
- Finding Kth largest/smallest element
- Merging K sorted lists
- Median of a data stream
- Task scheduling with priorities
- Top K elements problems
- Streaming data processing

## Common Patterns
- Use min-heap of size k to find kth largest
- Use max-heap to track largest elements seen
- Two heaps (min and max) for median finding
- Custom comparators for complex objects

## Problems
| Difficulty | Problem | Key Insight |
|------------|---------|-------------|
| Easy | Last Stone Weight | Max-heap simulation |
| Medium | Kth Largest Element | Min-heap of size k |
| Medium | Task Scheduler | Greedy + heap |
| Medium | K Closest Points | Max-heap of size k |
| Medium | K Pairs with Smallest Sums | Min-heap with expansion |
| Medium | Design Twitter | Merge K sorted feeds |
| Hard | Find Median from Data Stream | Two heaps |
| Hard | Merge K Sorted Lists | Min-heap across lists |
