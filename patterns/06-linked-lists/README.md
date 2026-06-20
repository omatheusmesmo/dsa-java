# Linked Lists Pattern

The Linked Lists pattern covers techniques for manipulating singly and doubly linked lists, including reversal, cycle detection, merging, and two-pointer approaches.

## Core Idea

Linked lists store elements in nodes where each node contains data and a pointer to the next node. This structure allows efficient insertions and deletions but requires traversal for access.

## Key Techniques

### 1. Dummy Head (Sentinel Node)
- Simplifies edge cases (empty list, single element)
- Points to the head of the result list
- Avoids special case handling

### 2. Fast and Slow Pointers (Floyd's)
- Detect cycles in O(1) space
- Find middle element
- Detect cycle start point

### 3. Two Pointers
- Merge sorted lists
- Find intersection
- Remove nth node from end

### 4. Reversal
- Reverse entire list
- Reverse in groups
- Reverse between positions

## When to Use

- Insertions/deletions at arbitrary positions
- Cycle detection
- Merging sorted sequences
- Reversing sequences
- Finding middle elements
- Implementing LRU caches

## Key Patterns

```java
// Dummy Head Technique
ListNode dummy = new ListNode(0);
ListNode current = dummy;
while (list != null) {
    current.next = list;
    current = current.next;
    list = list.next;
}
return dummy.next;

// Fast and Slow Pointers
ListNode slow = head, fast = head;
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
}
// slow is now at middle

// Cycle Detection
ListNode slow = head, fast = head;
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
    if (slow == fast) return true;
}
return false;
```

## Complexity Analysis

- Traversal: O(n)
- Insertion/Deletion: O(1) if position is known
- Space: O(1) for iterative, O(n) for recursive
