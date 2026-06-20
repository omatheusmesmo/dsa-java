package dev.omatheus.dsa.trees.hard;

import dev.omatheus.dsa.trees.TreeNode;

/**
 * <a href="https://leetcode.com/problems/count-good-nodes-in-binary-tree/">1448. Count Good Nodes in Binary Tree</a> (Hard)
 *
 * <p>Given a binary tree root, a node X in the tree is named good if in the path from root to X
 * there are no nodes with a value greater than X. Return the number of good nodes in the binary tree.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: root = [3,1,4,3,null,1,5]
 * Output: 4
 * Explanation: Node in blue is good. Root is a good node. Node 4 -> 3 -> 5 has no node with value > 5.
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>The number of nodes in the binary tree is in the range [1, 10^5]</li>
 *   <li>-10^4 <= Node.val <= 10^4</li>
 * </ul>
 *
 * @see CountGoodNodesInBinaryTreeTest
 */
public class CountGoodNodesInBinaryTree {

    /**
     * Counts the number of good nodes in the binary tree.
     *
     * @param root the root of the binary tree
     * @return the number of good nodes
     */
    public int goodNodes(TreeNode root) {
        throw new UnsupportedOperationException("Solve this problem!");
    }
}
