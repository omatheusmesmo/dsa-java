package dev.omatheus.dsa.trees.medium;

import dev.omatheus.dsa.trees.TreeNode;

/**
 * <a href="https://leetcode.com/problems/path-sum-iii/">437. Path Sum III</a> (Medium)
 *
 * <p>Given the root of a binary tree and an integer targetSum, return the number of paths where
 * the sum of values along the path equals targetSum. The path does not need to start or end at
 * the root or a leaf, but it must go downwards (i.e., traveling only from parent nodes to child nodes).</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
 * Output: 3
 * Explanation: The paths that sum to 8 are: 5->3, 5->2->1, -3->11
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>The number of nodes in the tree is in the range [0, 1000]</li>
 *   <li>-10^9 <= Node.val <= 10^9</li>
 *   <li>-1000 <= targetSum <= 1000</li>
 * </ul>
 *
 * @see PathSumIIITest
 */
public class PathSumIII {

    /**
     * Counts the number of paths with sum equal to targetSum.
     *
     * @param root the root of the binary tree
     * @param targetSum the target sum
     * @return the number of paths
     */
    public int pathSum(TreeNode root, int targetSum) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
