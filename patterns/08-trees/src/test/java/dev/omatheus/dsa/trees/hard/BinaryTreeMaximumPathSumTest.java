package dev.omatheus.dsa.trees.hard;

import dev.omatheus.dsa.trees.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeMaximumPathSumTest {

    private final BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

    @Test
    void basicCase() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));
        assertEquals(6, solution.maxPathSum(root));
    }

    @Test
    void singleNode() {
        assertEquals(1, solution.maxPathSum(new TreeNode(1)));
    }

    @Test
    void negativeValues() {
        TreeNode root = new TreeNode(-3);
        assertEquals(-3, solution.maxPathSum(root));
    }

    @Test
    void allPositive() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5));
        assertEquals(15, solution.maxPathSum(root));
    }

    @Test
    void leftSkewed() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), null),
                null);
        assertEquals(6, solution.maxPathSum(root));
    }

    @Test
    void rightSkewed() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2, null, new TreeNode(3)));
        assertEquals(6, solution.maxPathSum(root));
    }

    @Test
    void complexTree() {
        TreeNode root = new TreeNode(-10,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(42, solution.maxPathSum(root));
    }

    @Test
    void mixedSigns() {
        TreeNode root = new TreeNode(5,
                new TreeNode(-3,
                        new TreeNode(4),
                        new TreeNode(2, null, new TreeNode(-1))),
                new TreeNode(2));
        assertEquals(9, solution.maxPathSum(root));
    }
}
