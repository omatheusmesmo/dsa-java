package dev.omatheus.dsa.trees.medium;

import dev.omatheus.dsa.trees.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class BinaryTreeLevelOrderTraversalTest {

    private final BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();

    @Test
    void basicTree() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<List<Integer>> result = solution.levelOrder(root);
        assertEquals(3, result.size());
        assertEquals(List.of(3), result.get(0));
        assertEquals(List.of(9, 20), result.get(1));
        assertEquals(List.of(15, 7), result.get(2));
    }

    @Test
    void emptyTree() {
        assertTrue(solution.levelOrder(null).isEmpty());
    }

    @Test
    void singleNode() {
        List<List<Integer>> result = solution.levelOrder(new TreeNode(1));
        assertEquals(1, result.size());
        assertEquals(List.of(1), result.get(0));
    }

    @Test
    void leftSkewed() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3),
                        null),
                null);
        List<List<Integer>> result = solution.levelOrder(root);
        assertEquals(3, result.size());
        assertEquals(List.of(1), result.get(0));
        assertEquals(List.of(2), result.get(1));
        assertEquals(List.of(3), result.get(2));
    }

    @Test
    void rightSkewed() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2,
                        null,
                        new TreeNode(3)));
        List<List<Integer>> result = solution.levelOrder(root);
        assertEquals(3, result.size());
        assertEquals(List.of(1), result.get(0));
        assertEquals(List.of(2), result.get(1));
        assertEquals(List.of(3), result.get(2));
    }

    @Test
    void completeTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        List<List<Integer>> result = solution.levelOrder(root);
        assertEquals(3, result.size());
        assertEquals(List.of(1), result.get(0));
        assertEquals(List.of(2, 3), result.get(1));
        assertEquals(List.of(4, 5, 6, 7), result.get(2));
    }

    @Test
    void deepTree() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        List<List<Integer>> result = solution.levelOrder(root);
        assertEquals(2, result.size());
    }
}
