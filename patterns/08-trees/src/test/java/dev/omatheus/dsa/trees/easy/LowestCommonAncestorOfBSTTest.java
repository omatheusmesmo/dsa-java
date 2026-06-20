package dev.omatheus.dsa.trees.easy;

import dev.omatheus.dsa.trees.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorOfBSTTest {

    private final LowestCommonAncestorOfBST solution = new LowestCommonAncestorOfBST();

    @Test
    void basicCase() {
        TreeNode root = new TreeNode(6,
                new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                new TreeNode(8, new TreeNode(7), new TreeNode(9)));
        TreeNode p = root.left;
        TreeNode q = root.right;
        assertEquals(6, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void bothInLeft() {
        TreeNode root = new TreeNode(6,
                new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                new TreeNode(8, new TreeNode(7), new TreeNode(9)));
        TreeNode p = root.left.left;
        TreeNode q = root.left.right.left;
        assertEquals(2, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void bothInRight() {
        TreeNode root = new TreeNode(6,
                new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                new TreeNode(8, new TreeNode(7), new TreeNode(9)));
        TreeNode p = root.right.left;
        TreeNode q = root.right.right;
        assertEquals(8, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void splitNodes() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode p = root.left;
        TreeNode q = root.right;
        assertEquals(2, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void parentIsRoot() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        TreeNode p = root;
        TreeNode q = root.left;
        assertEquals(1, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void deepNodes() {
        TreeNode root = new TreeNode(5,
                new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4)),
                new TreeNode(7, new TreeNode(6), new TreeNode(8)));
        TreeNode p = root.left.left.left;
        TreeNode q = root.left.right;
        assertEquals(3, solution.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    void directParent() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null);
        TreeNode p = root.left;
        TreeNode q = root.left.left;
        assertEquals(2, solution.lowestCommonAncestor(root, p, q).val);
    }
}
