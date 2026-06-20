package dev.omatheus.dsa.trees.easy;

import dev.omatheus.dsa.trees.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeTest {

    private final InvertBinaryTree solution = new InvertBinaryTree();

    @Test
    void basicTree() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        TreeNode result = solution.invertTree(root);
        assertEquals(4, result.val);
        assertEquals(7, result.left.val);
        assertEquals(2, result.right.val);
        assertEquals(9, result.left.left.val);
        assertEquals(6, result.left.right.val);
        assertEquals(3, result.right.left.val);
        assertEquals(1, result.right.right.val);
    }

    @Test
    void emptyTree() {
        assertNull(solution.invertTree(null));
    }

    @Test
    void singleNode() {
        TreeNode result = solution.invertTree(new TreeNode(1));
        assertEquals(1, result.val);
        assertNull(result.left);
        assertNull(result.right);
    }

    @Test
    void leftOnly() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        TreeNode result = solution.invertTree(root);
        assertNull(result.left);
        assertEquals(2, result.right.val);
    }

    @Test
    void rightOnly() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2));
        TreeNode result = solution.invertTree(root);
        assertEquals(2, result.left.val);
        assertNull(result.right);
    }

    @Test
    void completeTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        TreeNode result = solution.invertTree(root);
        assertEquals(3, result.left.val);
        assertEquals(2, result.right.val);
        assertEquals(7, result.left.left.val);
        assertEquals(6, result.left.right.val);
        assertEquals(5, result.right.left.val);
        assertEquals(4, result.right.right.val);
    }

    @Test
    void deepTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), null),
                null);
        TreeNode result = solution.invertTree(root);
        assertNull(result.left);
        assertEquals(2, result.right.val);
        assertNull(result.right.left);
        assertEquals(3, result.right.right.val);
    }
}
