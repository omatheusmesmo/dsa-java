package dev.omatheus.dsa.trees.medium;

import dev.omatheus.dsa.trees.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidateBinarySearchTreeTest {

    private final ValidateBinarySearchTree solution = new ValidateBinarySearchTree();

    @Test
    void basicValid() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertTrue(solution.isValidBST(root));
    }

    @Test
    void basicInvalid() {
        TreeNode root = new TreeNode(5,
                new TreeNode(1),
                new TreeNode(4, new TreeNode(3), new TreeNode(6)));
        assertFalse(solution.isValidBST(root));
    }

    @Test
    void singleNode() {
        assertTrue(solution.isValidBST(new TreeNode(1)));
    }

    @Test
    void twoNodes() {
        TreeNode root = new TreeNode(2, new TreeNode(1), null);
        assertTrue(solution.isValidBST(root));
    }

    @Test
    void leftEqualsRoot() {
        TreeNode root = new TreeNode(2, new TreeNode(2), null);
        assertFalse(solution.isValidBST(root));
    }

    @Test
    void rightEqualsRoot() {
        TreeNode root = new TreeNode(2, null, new TreeNode(2));
        assertFalse(solution.isValidBST(root));
    }

    @Test
    void deepInvalid() {
        TreeNode root = new TreeNode(5,
                new TreeNode(1),
                new TreeNode(6,
                        new TreeNode(3),
                        new TreeNode(7)));
        assertFalse(solution.isValidBST(root));
    }

    @Test
    void complexTree() {
        TreeNode root = new TreeNode(5,
                new TreeNode(3, new TreeNode(2, new TreeNode(1), new TreeNode(4)), new TreeNode(6)),
                new TreeNode(7));
        assertTrue(solution.isValidBST(root));
    }
}
