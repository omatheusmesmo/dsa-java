# Prefix Sum Pattern

The Prefix Sum pattern preprocesses an array to compute cumulative sums, enabling O(1) range sum queries after O(n) preprocessing.

## Core Idea

Build a prefix sum array where `prefix[i]` = sum of elements from index 0 to i-1. Then, the sum of any subarray from index i to j can be computed as `prefix[j+1] - prefix[i]`.

## Types

### 1D Prefix Sum
```java
int[] prefix = new int[nums.length + 1];
for (int i = 0; i < nums.length; i++) {
    prefix[i + 1] = prefix[i] + nums[i];
}
// Sum of subarray from i to j (inclusive)
int rangeSum = prefix[j + 1] - prefix[i];
```

### 2D Prefix Sum (Matrix)
```java
int[][] prefix = new int[m + 1][n + 1];
for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
        prefix[i + 1][j + 1] = prefix[i][j + 1] + prefix[i + 1][j] - prefix[i][j] + matrix[i][j];
    }
}
```

## When to Use

- Range sum queries (multiple queries on same array)
- Finding subarrays with a specific sum
- Counting subarrays satisfying a condition
- 2D matrix range sum queries
- Problems where cumulative sums help (e.g., pivot index, contiguous array)

## Key Insight

The hash map approach for prefix sum:
```java
Map<Integer, Integer> prefixCount = new HashMap<>();
prefixCount.put(0, 1);
int sum = 0, count = 0;
for (int num : nums) {
    sum += num;
    count += prefixCount.getOrDefault(sum - k, 0);
    prefixCount.merge(sum, 1, Integer::sum);
}
```

## Complexity Analysis

- Preprocessing: O(n) for 1D, O(m*n) for 2D
- Query: O(1)
- Space: O(n) for 1D, O(m*n) for 2D
