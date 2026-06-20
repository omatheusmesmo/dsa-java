package dev.omatheus.dsa.trees.hard;

import dev.omatheus.dsa.trees.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountGoodNodesInBinaryTreeTest {

    private final CountGoodNodesInBinaryTree solution = new CountGoodNodesInBinaryTree();

    @Test
    void basicCase() {
        TreeNode root = new TreeNode(3,
                new TreeNode(1, new TreeNode(3), null),
                new TreeNode(4, new TreeNode(1), new TreeNode(5)));
        assertEquals(4, solution.goodNodes(root));
    }

    @Test
    void singleNode() {
        assertEquals(1, solution.goodNodes(new TreeNode(1)));
    }

    @Test
    void allSame() {
        TreeNode root = new TreeNode(1,
                new TreeNode(1, new TreeNode(1), new TreeNode(1)),
                new TreeNode(1));
        assertEquals(4, solution.goodNodes(root));
    }

    @Test
    void increasingPath() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null),
                null);
        assertEquals(4, solution.goodNodes(root));
    }

    @Test
    void decreasingPath() {
        TreeNode root = new TreeNode(4,
                new TreeNode(3, new TreeNode(2, new TreeNode(1), null), null),
                null);
        assertEquals(1, solution.goodNodes(root));
    }

    @Test
    void complexTree() {
        TreeNode root = new TreeNode(3,
                new TreeNode(3,
                        new TreeNode(4),
                        new TreeNode(2)),
                null);
        assertEquals(3, solution.goodNodes(root));
    }

    @Test
    void allNegative() {
        TreeNode root = new TreeNode(-3,
                new TreeNode(-2, new TreeNode(-1), null),
                null);
        assertEquals(1, solution.goodNodes(root));
    }
}
