# Backtracking

## Pattern Overview

Backtracking is a systematic method for solving problems by exploring all possible candidates and abandoning ("backtracking") a candidate as soon as it is determined that it cannot lead to a valid solution. It is particularly useful for generating all possible solutions (subsets, permutations, combinations) and constraint satisfaction problems.

## Key Concepts

### Backtracking Framework
1. **Choose**: Make a choice from available options
2. **Explore**: Recursively explore with that choice
3. **Unchoose**: Undo the choice (backtrack) and try other options

### Common Patterns
- **Subsets/Permutations**: Generate all possible arrangements
- **Combinations**: Find combinations that meet criteria
- **Constraint Satisfaction**: Place items with constraints (N-Queens)
- **Path Finding**: Explore all paths with pruning

### Pruning Optimization
- Sort the input to skip duplicates early
- Stop exploring when current path cannot lead to valid solution
- Use constraints to eliminate branches

## When to Use
- Generate all possible solutions
- Explore decision space
- Problem has "choose" or "not choose" decisions
- Need to find all valid arrangements
- Constraint satisfaction problems

## Common Patterns
- Use recursion with backtracking
- Sort input for duplicate handling
- Use visited array/set for tracking
- Prune invalid branches early
- Return when solution is complete

## Problems
| Difficulty | Problem | Key Insight |
|------------|---------|-------------|
| Medium | Subsets | Include/exclude each element |
| Medium | Subsets II | Handle duplicates with sorting |
| Medium | CombinationSum | Allow reuse of elements |
| Medium | CombinationSum II | No reuse, handle duplicates |
| Medium | Permutations | Track used elements |
| Medium | Permutations II | Handle duplicates |
| Medium | CombinationSum III | Fixed size, range constraint |
| Medium | Word Search | DFS with backtracking on grid |
| Medium | Palindrome Partitioning | Check palindrome, backtrack |
| Medium | Letter Combinations | Map digits to letters |
| Medium | N-Queens | Place queens row by row |
| Medium | N-Queens II | Count solutions |
