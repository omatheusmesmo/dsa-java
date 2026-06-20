package dev.omatheus.dsa.trees.medium;

import dev.omatheus.dsa.trees.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SerializeAndDeserializeBinaryTreeTest {

    private final SerializeAndDeserializeBinaryTree solution = new SerializeAndDeserializeBinaryTree();

    @Test
    void basicTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        String serialized = solution.serialize(root);
        TreeNode deserialized = solution.deserialize(serialized);
        assertEquals(1, deserialized.val);
        assertEquals(2, deserialized.left.val);
        assertEquals(3, deserialized.right.val);
        assertEquals(4, deserialized.right.left.val);
        assertEquals(5, deserialized.right.right.val);
    }

    @Test
    void emptyTree() {
        String serialized = solution.serialize(null);
        assertNull(solution.deserialize(serialized));
    }

    @Test
    void singleNode() {
        TreeNode root = new TreeNode(1);
        String serialized = solution.serialize(root);
        TreeNode deserialized = solution.deserialize(serialized);
        assertEquals(1, deserialized.val);
        assertNull(deserialized.left);
        assertNull(deserialized.right);
    }

    @Test
    void leftSkewed() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), null),
                null);
        String serialized = solution.serialize(root);
        TreeNode deserialized = solution.deserialize(serialized);
        assertEquals(1, deserialized.val);
        assertEquals(2, deserialized.left.val);
        assertEquals(3, deserialized.left.left.val);
    }

    @Test
    void rightSkewed() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2, null, new TreeNode(3)));
        String serialized = solution.serialize(root);
        TreeNode deserialized = solution.deserialize(serialized);
        assertEquals(1, deserialized.val);
        assertEquals(2, deserialized.right.val);
        assertEquals(3, deserialized.right.right.val);
    }

    @Test
    void completeTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        String serialized = solution.serialize(root);
        TreeNode deserialized = solution.deserialize(serialized);
        assertEquals(1, deserialized.val);
        assertEquals(2, deserialized.left.val);
        assertEquals(3, deserialized.right.val);
        assertEquals(4, deserialized.left.left.val);
        assertEquals(5, deserialized.left.right.val);
        assertEquals(6, deserialized.right.left.val);
        assertEquals(7, deserialized.right.right.val);
    }

    @Test
    void roundTrip() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));
        String s1 = solution.serialize(root);
        TreeNode d1 = solution.deserialize(s1);
        String s2 = solution.serialize(d1);
        assertEquals(s1, s2);
    }
}
