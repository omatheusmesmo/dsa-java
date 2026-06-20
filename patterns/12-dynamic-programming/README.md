# Dynamic Programming

## Pattern Overview

Dynamic Programming (DP) is an algorithmic technique for solving optimization problems by breaking them down into simpler subproblems and storing the results of subproblems to avoid redundant computation. DP is applicable when problems have overlapping subproblems and optimal substructure.

## Key Concepts

### Two Approaches
1. **Memoization (Top-Down)**: Start from the main problem, recursively solve subproblems, cache results
2. **Tabulation (Bottom-Up)**: Start from smallest subproblems, iteratively build up to the solution

### When to Use DP
- **Overlapping Subproblems**: Same subproblems are solved multiple times
- **Optimal Substructure**: Optimal solution contains optimal solutions to subproblems
- **Decision at Each Step**: Multiple choices that affect future decisions

### Common DP Patterns
1. **Fibonacci-like**: Current state depends on previous states (Climbing Stairs, House Robber)
2. **Knapsack**: Selection problem with constraints (0/1 Knapsack, Subset Sum)
3. **String DP**: Operations on strings (LCS, Edit Distance)
4. **Grid DP**: Paths in grids (Unique Paths, Min Path Sum)
5. **Interval DP**: Problems on subarrays (Burst Balloons)
6. **Tree DP**: Problems on trees (Diameter, Path Sum)

## When to Use
- Optimization problems (min/max)
- Counting problems (number of ways)
- Decision problems (true/false)
- String matching/comparison
- Grid path problems
- Sequence problems

## Common Patterns
- Define state clearly (what does dp[i] represent?)
- Find recurrence relation (how to compute dp[i] from previous states)
- Initialize base cases
- Determine iteration order
- Extract final answer from dp array

## Problems
| Difficulty | Problem | Key Insight |
|------------|---------|-------------|
| Easy | Climbing Stairs | Fibonacci variation |
| Easy | Min Cost Climbing Stairs | Add cost to state |
| Medium | House Robber | Include/exclude current |
| Medium | House Robber II | Two linear runs |
| Medium | Longest Palindromic Substring | Expand around center |
| Medium | Palindromic Substrings | Count all palindromes |
| Medium | Decode Ways | Count decoding paths |
| Medium | Coin Change | Minimum coins for amount |
| Medium | Maximum Product Subarray | Track min and max |
| Medium | Maximum Subarray | Kadane's algorithm |
| Medium | Word Break | Dictionary segmentation |
| Medium | Longest Increasing Subsequence | LIS with binary search |
| Medium | Partition Equal Subset Sum | Subset sum variation |
| Medium | Unique Paths | Grid traversal |
| Medium | Unique Paths II | Grid with obstacles |
| Medium | Minimum Path Sum | Min cost path |
| Medium | Longest Common Subsequence | 2D string comparison |
| Medium | Interleaving String | 3D string merge |
| Medium | Target Sum | Count ways with signs |
| Medium | Longest Increasing Path in Matrix | DFS + memoization |
| Medium | Coin Change II | Count combinations |
| Hard | Edit Distance | 2D string transformation |
| Hard | Burst Balloons | Interval DP |
