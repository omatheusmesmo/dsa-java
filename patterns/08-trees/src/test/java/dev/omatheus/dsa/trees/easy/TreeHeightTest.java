package dev.omatheus.dsa.trees.easy;

import dev.omatheus.dsa.trees.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TreeHeightTest {

    private final TreeHeight solution = new TreeHeight();

    @Test
    void basicTree() {
        TreeNode root = new TreeNode(3,
                new TreeNode(2, new TreeNode(1), null),
                new TreeNode(4));
        assertEquals(2, solution.height(root));
    }

    @Test
    void emptyTree() {
        assertEquals(-1, solution.height(null));
    }

    @Test
    void singleNode() {
        assertEquals(0, solution.height(new TreeNode(1)));
    }

    @Test
    void leftSkewed() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null),
                null);
        assertEquals(3, solution.height(root));
    }

    @Test
    void rightSkewed() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4))));
        assertEquals(3, solution.height(root));
    }

    @Test
    void balanced() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        assertEquals(2, solution.height(root));
    }

    @Test
    void deepTree() {
        TreeNode root = new TreeNode(1);
        TreeNode current = root;
        for (int i = 2; i <= 100; i++) {
            current.left = new TreeNode(i);
            current = current.left;
        }
        assertEquals(99, solution.height(root));
    }
}
