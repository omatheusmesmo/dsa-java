package dev.omatheus.dsa.trees.medium;

import dev.omatheus.dsa.trees.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConstructBinaryTreeFromPreorderAndInorderTest {

    private final ConstructBinaryTreeFromPreorderAndInorder solution = new ConstructBinaryTreeFromPreorderAndInorder();

    @Test
    void basicTree() {
        TreeNode result = solution.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        assertEquals(3, result.val);
        assertEquals(9, result.left.val);
        assertEquals(20, result.right.val);
        assertEquals(15, result.right.left.val);
        assertEquals(7, result.right.right.val);
    }

    @Test
    void singleNode() {
        TreeNode result = solution.buildTree(new int[]{1}, new int[]{1});
        assertEquals(1, result.val);
        assertNull(result.left);
        assertNull(result.right);
    }

    @Test
    void twoNodes() {
        TreeNode result = solution.buildTree(new int[]{1, 2}, new int[]{2, 1});
        assertEquals(1, result.val);
        assertEquals(2, result.left.val);
        assertNull(result.right);
    }

    @Test
    void leftSkewed() {
        TreeNode result = solution.buildTree(new int[]{3, 2, 1}, new int[]{3, 2, 1});
        assertEquals(3, result.val);
        assertEquals(2, result.right.val);
        assertEquals(1, result.right.right.val);
    }

    @Test
    void rightSkewed() {
        TreeNode result = solution.buildTree(new int[]{1, 2, 3}, new int[]{1, 2, 3});
        assertEquals(1, result.val);
        assertEquals(2, result.right.val);
        assertEquals(3, result.right.right.val);
    }

    @Test
    void completeTree() {
        TreeNode result = solution.buildTree(new int[]{1, 2, 4, 5, 3, 6, 7}, new int[]{4, 2, 5, 1, 6, 3, 7});
        assertEquals(1, result.val);
        assertEquals(2, result.left.val);
        assertEquals(3, result.right.val);
        assertEquals(4, result.left.left.val);
        assertEquals(5, result.left.right.val);
        assertEquals(6, result.right.left.val);
        assertEquals(7, result.right.right.val);
    }

    @Test
    void complexTree() {
        TreeNode result = solution.buildTree(new int[]{10, 5, 3, 7, 12, 11, 15}, new int[]{3, 5, 7, 10, 11, 12, 15});
        assertEquals(10, result.val);
        assertEquals(5, result.left.val);
        assertEquals(12, result.right.val);
    }
}
