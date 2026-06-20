package dev.omatheus.dsa.trees.easy;

import dev.omatheus.dsa.trees.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubtreeOfAnotherTreeTest {

    private final SubtreeOfAnotherTree solution = new SubtreeOfAnotherTree();

    @Test
    void basicTrue() {
        TreeNode root = new TreeNode(3,
                new TreeNode(4, new TreeNode(1), new TreeNode(2)),
                new TreeNode(5));
        TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        assertTrue(solution.isSubtree(root, subRoot));
    }

    @Test
    void basicFalse() {
        TreeNode root = new TreeNode(3,
                new TreeNode(4, new TreeNode(1), new TreeNode(2)),
                new TreeNode(5));
        TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(3));
        assertFalse(solution.isSubtree(root, subRoot));
    }

    @Test
    void identicalTrees() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode subRoot = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertTrue(solution.isSubtree(root, subRoot));
    }

    @Test
    void singleNode() {
        TreeNode root = new TreeNode(1);
        TreeNode subRoot = new TreeNode(1);
        assertTrue(solution.isSubtree(root, subRoot));
    }

    @Test
    void notSubtree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5));
        TreeNode subRoot = new TreeNode(2, new TreeNode(3), new TreeNode(6));
        assertFalse(solution.isSubtree(root, subRoot));
    }

    @Test
    void deepSubtree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4, new TreeNode(1), new TreeNode(2)),
                                null),
                        null),
                null);
        TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        assertTrue(solution.isSubtree(root, subRoot));
    }
}
