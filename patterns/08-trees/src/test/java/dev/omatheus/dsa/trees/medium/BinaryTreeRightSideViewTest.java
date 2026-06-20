package dev.omatheus.dsa.trees.medium;

import dev.omatheus.dsa.trees.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class BinaryTreeRightSideViewTest {

    private final BinaryTreeRightSideView solution = new BinaryTreeRightSideView();

    @Test
    void basicTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(4)));
        assertEquals(List.of(1, 3, 4), solution.rightSideView(root));
    }

    @Test
    void emptyTree() {
        assertTrue(solution.rightSideView(null).isEmpty());
    }

    @Test
    void singleNode() {
        assertEquals(List.of(1), solution.rightSideView(new TreeNode(1)));
    }

    @Test
    void leftSkewed() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), null),
                null);
        assertEquals(List.of(1, 2, 3), solution.rightSideView(root));
    }

    @Test
    void rightSkewed() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2, null, new TreeNode(3)));
        assertEquals(List.of(1, 2, 3), solution.rightSideView(root));
    }

    @Test
    void completeTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        assertEquals(List.of(1, 3, 7), solution.rightSideView(root));
    }

    @Test
    void multiplePerLevel() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, new TreeNode(8), null),
                        new TreeNode(5)),
                new TreeNode(3,
                        new TreeNode(6),
                        new TreeNode(7, null, new TreeNode(9))));
        assertEquals(List.of(1, 3, 7, 9), solution.rightSideView(root));
    }
}
