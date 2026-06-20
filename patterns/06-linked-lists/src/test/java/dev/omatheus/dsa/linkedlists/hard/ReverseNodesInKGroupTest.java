package dev.omatheus.dsa.linkedlists.hard;

import dev.omatheus.dsa.linkedlists.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNodesInKGroupTest {

    private final ReverseNodesInKGroup solution = new ReverseNodesInKGroup();

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
    void basicSwap() {
        ListNode result = solution.reverseKGroup(createList(1, 2, 3, 4, 5), 2);
        assertArrayEquals(new int[]{2, 1, 4, 3, 5}, toArray(result));
    }

    @Test
    void kEqualsLength() {
        ListNode result = solution.reverseKGroup(createList(1, 2, 3), 3);
        assertArrayEquals(new int[]{3, 2, 1}, toArray(result));
    }

    @Test
    void kGreaterThanLength() {
        ListNode result = solution.reverseKGroup(createList(1, 2), 3);
        assertArrayEquals(new int[]{1, 2}, toArray(result));
    }

    @Test
    void kOne() {
        ListNode result = solution.reverseKGroup(createList(1, 2, 3), 1);
        assertArrayEquals(new int[]{1, 2, 3}, toArray(result));
    }

    @Test
    void twoGroups() {
        ListNode result = solution.reverseKGroup(createList(1, 2, 3, 4), 2);
        assertArrayEquals(new int[]{2, 1, 4, 3}, toArray(result));
    }

    @Test
    void threeNodes() {
        ListNode result = solution.reverseKGroup(createList(1, 2, 3), 2);
        assertArrayEquals(new int[]{2, 1, 3}, toArray(result));
    }

    @Test
    void fourNodes() {
        ListNode result = solution.reverseKGroup(createList(1, 2, 3, 4), 2);
        assertArrayEquals(new int[]{2, 1, 4, 3}, toArray(result));
    }
}
