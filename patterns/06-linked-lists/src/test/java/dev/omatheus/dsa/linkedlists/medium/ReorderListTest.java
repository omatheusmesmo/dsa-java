package dev.omatheus.dsa.linkedlists.medium;

import dev.omatheus.dsa.linkedlists.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReorderListTest {

    private final ReorderList solution = new ReorderList();

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
    void basicList() {
        ListNode head = createList(1, 2, 3, 4);
        solution.reorderList(head);
        assertArrayEquals(new int[]{1, 4, 2, 3}, toArray(head));
    }

    @Test
    void twoNodes() {
        ListNode head = createList(1, 2);
        solution.reorderList(head);
        assertArrayEquals(new int[]{1, 2}, toArray(head));
    }

    @Test
    void threeNodes() {
        ListNode head = createList(1, 2, 3);
        solution.reorderList(head);
        assertArrayEquals(new int[]{1, 3, 2}, toArray(head));
    }

    @Test
    void fourNodes() {
        ListNode head = createList(1, 2, 3, 4);
        solution.reorderList(head);
        assertArrayEquals(new int[]{1, 4, 2, 3}, toArray(head));
    }

    @Test
    void fiveNodes() {
        ListNode head = createList(1, 2, 3, 4, 5);
        solution.reorderList(head);
        assertArrayEquals(new int[]{1, 5, 2, 4, 3}, toArray(head));
    }

    @Test
    void singleNode() {
        ListNode head = createList(1);
        solution.reorderList(head);
        assertArrayEquals(new int[]{1}, toArray(head));
    }
}
