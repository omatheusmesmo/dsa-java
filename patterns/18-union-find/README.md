# Union-Find Pattern

Union-Find (Disjoint Set Union) is a data structure for tracking connected components. It supports two operations: `find` (which set an element belongs to) and `union` (merge two sets).

## When to Use
- Connected components in undirected graphs
- Cycle detection in undirected graphs
- Grouping elements by equivalence
- Dynamic connectivity queries

## Key Optimizations
1. **Path compression**: Flatten the tree during `find` for near O(1) operations
2. **Union by rank/size**: Attach smaller tree under larger to keep balanced

## Time Complexity
- `find`: O(α(n)) - amortized near constant (α is inverse Ackermann)
- `union`: O(α(n)) - amortized near constant

## Implementation
```java
class UnionFind {
    int[] parent;
    int[] rank;

    void union(int x, int y) { ... }
    int find(int x) { ... }
}
```

## Problems

### Medium
- [Number of Connected Components in an Undirected Graph](src/main/java/dev/omatheus/dsa/unionfind/medium/NumberOfConnectedComponents.java)
- [Redundant Connection](src/main/java/dev/omatheus/dsa/unionfind/medium/RedundantConnection.java)
- [Accounts Merge](src/main/java/dev/omatheus/dsa/unionfind/medium/AccountsMerge.java)
- [Smallest String With Swaps](src/main/java/dev/omatheus/dsa/unionfind/medium/SmallestStringWithSwaps.java)
