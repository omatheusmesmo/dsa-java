# Graphs

## Pattern Overview

Graphs are data structures consisting of nodes (vertices) connected by edges. They represent relationships between objects and are essential for modeling networks, dependencies, and connectivity problems.

## Key Concepts

### Graph Representations
1. **Adjacency Matrix**: 2D array where matrix[i][j] indicates an edge between i and j
2. **Adjacency List**: Map where each node maps to a list of its neighbors

### Graph Traversals
1. **BFS (Breadth-First Search)**: Explores level by level, uses queue
   - Finds shortest path in unweighted graphs
   - Good for level-order processing
2. **DFS (Depth-First Search)**: Explores as far as possible, uses stack/recursion
   - Good for cycle detection, path finding
   - Can detect connected components

### Graph Algorithms
- **Connected Components**: DFS/BFS to find all connected nodes
- **Cycle Detection**: DFS with visited states, or Union-Find
- **Topological Sort**: DFS or Kahn's algorithm for DAGs
- **Union-Find**: Efficient for dynamic connectivity problems
- **Shortest Path**: BFS for unweighted, Dijkstra for weighted

## When to Use
- Networks (social, computer, road)
- Dependencies (task scheduling, course prerequisites)
- Connectivity (islands, provinces)
- Path finding (shortest path, all paths)
- Grouping (connected components, accounts merge)

## Common Patterns
- Use visited set to avoid revisiting nodes
- Check for cycles using three states (unvisited, visiting, visited)
- BFS for shortest path in unweighted graphs
- Union-Find for dynamic connectivity
- Topological sort for ordering with dependencies

## Problems
| Difficulty | Problem | Key Insight |
|------------|---------|-------------|
| Medium | Number of Islands | DFS/BFS flood fill |
| Medium | Clone Graph | DFS/BFS with visited map |
| Medium | Max Area of Island | DFS flood fill with area |
| Medium | Pacific Atlantic Water Flow | Reverse BFS from oceans |
| Medium | Surrounded Regions | Mark border-connected O's |
| Medium | Rotting Oranges | Multi-source BFS |
| Medium | Course Schedule | Cycle detection in DAG |
| Medium | Course Schedule II | Topological sort |
| Medium | Graph Valid Tree | Union-Find or DFS |
| Medium | Number of Connected Components | DFS/BFS or Union-Find |
| Medium | Redundant Connection | Union-Find cycle detection |
| Medium | Accounts Merge | Union-Find on emails |
| Medium | Number of Provinces | DFS/BFS on matrix |
| Hard | Word Ladder | BFS for shortest transformation |
