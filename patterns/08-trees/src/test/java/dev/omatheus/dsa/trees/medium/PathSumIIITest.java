package dev.omatheus.dsa.trees.medium;

import dev.omatheus.dsa.trees.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PathSumIIITest {

    private final PathSumIII solution = new PathSumIII();

    @Test
    void basicCase() {
        TreeNode root = new TreeNode(10,
                new TreeNode(5,
                        new TreeNode(3, new TreeNode(3), new TreeNode(-2)),
                        new TreeNode(2, null, new TreeNode(1))),
                new TreeNode(-3, null, new TreeNode(11)));
        assertEquals(3, solution.pathSum(root, 8));
    }

    @Test
    void noPath() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertEquals(0, solution.pathSum(root, 10));
    }

    @Test
    void singleNode() {
        assertEquals(1, solution.pathSum(new TreeNode(1), 1));
        assertEquals(0, solution.pathSum(new TreeNode(1), 2));
    }

    @Test
    void multiplePaths() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));
        assertEquals(2, solution.pathSum(root, 3));
    }

    @Test
    void negativeValues() {
        TreeNode root = new TreeNode(5,
                new TreeNode(-3,
                        new TreeNode(2,
                                new TreeNode(3),
                                new TreeNode(-2)),
                        null),
                new TreeNode(8));
        assertEquals(2, solution.pathSum(root, 5));
    }

    @Test
    void zeroPath() {
        TreeNode root = new TreeNode(0);
        assertEquals(1, solution.pathSum(root, 0));
    }

    @Test
    void complexTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4),
                                new TreeNode(5)),
                        new TreeNode(6)),
                new TreeNode(7));
        assertEquals(2, solution.pathSum(root, 10));
    }
}
