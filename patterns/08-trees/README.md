# Trees

## Pattern Overview

Trees are hierarchical data structures consisting of nodes connected by edges. Each tree has a root node, and every node (except the root) has exactly one parent node. Trees are fundamental for representing hierarchical relationships and enabling efficient searching, sorting, and range queries.

## Key Concepts

### Tree Traversals
1. **DFS (Depth-First Search)**: Goes deep before going wide
   - **Preorder**: Root -> Left -> Right
   - **Inorder**: Left -> Root -> Right
   - **Postorder**: Left -> Right -> Root
2. **BFS (Breadth-First Search)**: Visits level by level
   - **Level Order**: Visit each level from left to right

### Binary Search Tree (BST)
- Left subtree contains only nodes with keys less than the node's key
- Right subtree contains only nodes with keys greater than the node's key
- Both left and right subtrees must also be binary search trees
- Enables O(log n) search, insert, and delete operations

### Tree Construction
- From traversal arrays (preorder + inorder, postorder + inorder)
- From serialized representation

## When to Use
- Hierarchical data representation
- Fast searching (BST): O(log n) average
- Range queries and ordered operations
- Expression parsing
- File system representation
- Decision trees

## Common Patterns
- Recursion is natural for tree problems
- Use DFS for path problems, subtree problems
- Use BFS for level-by-level processing
- Think about base cases: null node, single node
- Consider both top-down and bottom-up approaches

## Problems
| Difficulty | Problem | Key Insight |
|------------|---------|-------------|
| Easy | Invert Binary Tree | Swap children recursively |
| Easy | Maximum Depth | DFS/BFS height calculation |
| Easy | Same Tree | Parallel DFS/BFS |
| Easy | Subtree of Another Tree | Tree matching |
| Easy | LCA of BST | Exploit BST property |
| Easy | Diameter of Binary Tree | Track max path through each node |
| Medium | Level Order Traversal | BFS with level tracking |
| Medium | Validate BST | Inorder traversal or bounds checking |
| Medium | Kth Smallest in BST | Inorder traversal |
| Medium | Construct from Preorder and Inorder | Recursive construction |
| Medium | Binary Tree Right Side View | BFS, take last of each level |
| Medium | Path Sum III | Prefix sum on tree |
| Medium | Serialize/Deserialize | Design encoding scheme |
| Hard | Binary Tree Maximum Path Sum | Track max gain per node |
| Hard | Count Good Nodes | Track max along path |
| HackerRank | Preorder Traversal | Classic traversal |
| HackerRank | Inorder Traversal | Classic traversal |
| HackerRank | Tree Height | Height calculation |
