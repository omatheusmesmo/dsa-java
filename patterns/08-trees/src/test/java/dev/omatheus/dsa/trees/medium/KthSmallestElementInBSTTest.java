package dev.omatheus.dsa.trees.medium;

import dev.omatheus.dsa.trees.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KthSmallestElementInBSTTest {

    private final KthSmallestElementInBST solution = new KthSmallestElementInBST();

    @Test
    void basicCase() {
        TreeNode root = new TreeNode(3,
                new TreeNode(1, null, new TreeNode(2)),
                new TreeNode(4));
        assertEquals(1, solution.kthSmallest(root, 1));
    }

    @Test
    void kEqualsOne() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertEquals(1, solution.kthSmallest(root, 1));
    }

    @Test
    void kEqualsSize() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertEquals(3, solution.kthSmallest(root, 3));
    }

    @Test
    void singleNode() {
        assertEquals(1, solution.kthSmallest(new TreeNode(1), 1));
    }

    @Test
    void leftSkewed() {
        TreeNode root = new TreeNode(4,
                new TreeNode(3,
                        new TreeNode(2,
                                new TreeNode(1),
                                null),
                        null),
                null);
        assertEquals(3, solution.kthSmallest(root, 3));
    }

    @Test
    void rightSkewed() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2,
                        null,
                        new TreeNode(3)));
        assertEquals(3, solution.kthSmallest(root, 3));
    }

    @Test
    void balanced() {
        TreeNode root = new TreeNode(3,
                new TreeNode(1, null, new TreeNode(2)),
                new TreeNode(4));
        assertEquals(2, solution.kthSmallest(root, 2));
    }
}
