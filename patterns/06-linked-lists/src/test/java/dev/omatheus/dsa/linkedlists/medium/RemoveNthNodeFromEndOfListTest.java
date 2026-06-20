package dev.omatheus.dsa.linkedlists.medium;

import dev.omatheus.dsa.linkedlists.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfListTest {

    private final RemoveNthNodeFromEndOfList solution = new RemoveNthNodeFromEndOfList();

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
    void removeLast() {
        ListNode result = solution.removeNthFromEnd(createList(1, 2, 3, 4, 5), 1);
        assertArrayEquals(new int[]{1, 2, 3, 4}, toArray(result));
    }

    @Test
    void removeFirst() {
        ListNode result = solution.removeNthFromEnd(createList(1, 2, 3, 4, 5), 5);
        assertArrayEquals(new int[]{2, 3, 4, 5}, toArray(result));
    }

    @Test
    void removeMiddle() {
        ListNode result = solution.removeNthFromEnd(createList(1, 2, 3, 4, 5), 2);
        assertArrayEquals(new int[]{1, 2, 3, 5}, toArray(result));
    }

    @Test
    void singleNode() {
        ListNode result = solution.removeNthFromEnd(createList(1), 1);
        assertNull(result);
    }

    @Test
    void twoNodes() {
        ListNode result = solution.removeNthFromEnd(createList(1, 2), 1);
        assertArrayEquals(new int[]{1}, toArray(result));
    }

    @Test
    void nEqualsLength() {
        ListNode result = solution.removeNthFromEnd(createList(1, 2, 3), 3);
        assertArrayEquals(new int[]{2, 3}, toArray(result));
    }

    @Test
    void nEqualsOne() {
        ListNode result = solution.removeNthFromEnd(createList(1, 2, 3), 1);
        assertArrayEquals(new int[]{1, 2}, toArray(result));
    }
}
