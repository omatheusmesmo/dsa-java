package dev.omatheus.dsa.trees.easy;

import dev.omatheus.dsa.trees.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class TreeInorderTraversalTest {

    private final TreeInorderTraversal solution = new TreeInorderTraversal();

    @Test
    void basicTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        assertEquals(List.of(4, 2, 5, 1, 6, 3, 7), solution.inorder(root));
    }

    @Test
    void emptyTree() {
        assertTrue(solution.inorder(null).isEmpty());
    }

    @Test
    void singleNode() {
        assertEquals(List.of(1), solution.inorder(new TreeNode(1)));
    }

    @Test
    void leftSkewed() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), null),
                null);
        assertEquals(List.of(3, 2, 1), solution.inorder(root));
    }

    @Test
    void rightSkewed() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2, null, new TreeNode(3)));
        assertEquals(List.of(1, 2, 3), solution.inorder(root));
    }

    @Test
    void completeTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        assertEquals(List.of(4, 2, 5, 1, 6, 3, 7), solution.inorder(root));
    }
}
