package dev.omatheus.dsa.trees.easy;

import dev.omatheus.dsa.trees.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiameterOfBinaryTreeTest {

    private final DiameterOfBinaryTree solution = new DiameterOfBinaryTree();

    @Test
    void basicTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3));
        assertEquals(3, solution.diameterOfBinaryTree(root));
    }

    @Test
    void singleNode() {
        assertEquals(0, solution.diameterOfBinaryTree(new TreeNode(1)));
    }

    @Test
    void twoNodes() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        assertEquals(1, solution.diameterOfBinaryTree(root));
    }

    @Test
    void leftSkewed() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4),
                                null),
                        null),
                null);
        assertEquals(3, solution.diameterOfBinaryTree(root));
    }

    @Test
    void rightSkewed() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2,
                        null,
                        new TreeNode(3,
                                null,
                                new TreeNode(4))));
        assertEquals(3, solution.diameterOfBinaryTree(root));
    }

    @Test
    void balanced() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        assertEquals(4, solution.diameterOfBinaryTree(root));
    }

    @Test
    void complexTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, new TreeNode(6), new TreeNode(7)),
                        new TreeNode(5)),
                new TreeNode(3));
        assertEquals(5, solution.diameterOfBinaryTree(root));
    }
}
