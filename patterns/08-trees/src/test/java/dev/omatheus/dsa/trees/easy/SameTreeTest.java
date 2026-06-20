package dev.omatheus.dsa.trees.easy;

import dev.omatheus.dsa.trees.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {

    private final SameTree solution = new SameTree();

    @Test
    void basicTrue() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertTrue(solution.isSameTree(p, q));
    }

    @Test
    void basicFalse() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(4));
        assertFalse(solution.isSameTree(p, q));
    }

    @Test
    void bothEmpty() {
        assertTrue(solution.isSameTree(null, null));
    }

    @Test
    void oneEmpty() {
        assertFalse(solution.isSameTree(new TreeNode(1), null));
        assertFalse(solution.isSameTree(null, new TreeNode(1)));
    }

    @Test
    void singleNode() {
        assertTrue(solution.isSameTree(new TreeNode(1), new TreeNode(1)));
        assertFalse(solution.isSameTree(new TreeNode(1), new TreeNode(2)));
    }

    @Test
    void differentStructure() {
        TreeNode p = new TreeNode(1, new TreeNode(2), null);
        TreeNode q = new TreeNode(1, null, new TreeNode(2));
        assertFalse(solution.isSameTree(p, q));
    }

    @Test
    void sameStructureDifferentValues() {
        TreeNode p = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5, new TreeNode(6), new TreeNode(7)));
        TreeNode q = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5, new TreeNode(6), new TreeNode(8)));
        assertFalse(solution.isSameTree(p, q));
    }
}
