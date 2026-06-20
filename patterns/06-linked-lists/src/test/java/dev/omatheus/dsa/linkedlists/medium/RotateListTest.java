package dev.omatheus.dsa.linkedlists.medium;

import dev.omatheus.dsa.linkedlists.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateListTest {

    private final RotateList solution = new RotateList();

    private ListNode createList(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    private int[] toArray(ListNode head) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    @Test
    void basicRotation() {
        ListNode result = solution.rotateRight(createList(1, 2, 3, 4, 5), 2);
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, toArray(result));
    }

    @Test
    void singleNode() {
        ListNode result = solution.rotateRight(createList(1), 5);
        assertArrayEquals(new int[]{1}, toArray(result));
    }

    @Test
    void kEqualsLength() {
        ListNode result = solution.rotateRight(createList(1, 2, 3), 3);
        assertArrayEquals(new int[]{1, 2, 3}, toArray(result));
    }

    @Test
    void kGreaterThanLength() {
        ListNode result = solution.rotateRight(createList(1, 2, 3), 5);
        assertArrayEquals(new int[]{2, 3, 1}, toArray(result));
    }

    @Test
    void twoNodes() {
        ListNode result = solution.rotateRight(createList(1, 2), 1);
        assertArrayEquals(new int[]{2, 1}, toArray(result));
    }

    @Test
    void emptyList() {
        ListNode result = solution.rotateRight(null, 5);
        assertNull(result);
    }

    @Test
    void kZero() {
        ListNode result = solution.rotateRight(createList(1, 2, 3), 0);
        assertArrayEquals(new int[]{1, 2, 3}, toArray(result));
    }
}
