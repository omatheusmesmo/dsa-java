package dev.omatheus.dsa.linkedlists.medium;

import dev.omatheus.dsa.linkedlists.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteNodeInALinkedListTest {

    private final DeleteNodeInALinkedList solution = new DeleteNodeInALinkedList();

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
    void deleteFirst() {
        ListNode head = createList(4, 5, 1, 9);
        ListNode nodeToDelete = head.next;
        solution.deleteNode(nodeToDelete);
        assertArrayEquals(new int[]{4, 1, 9}, toArray(head));
    }

    @Test
    void deleteMiddle() {
        ListNode head = createList(1, 2, 3, 4, 5);
        ListNode nodeToDelete = head.next.next;
        solution.deleteNode(nodeToDelete);
        assertArrayEquals(new int[]{1, 2, 4, 5}, toArray(head));
    }

    @Test
    void twoNodes() {
        ListNode head = createList(1, 2);
        ListNode nodeToDelete = head;
        solution.deleteNode(nodeToDelete);
        assertArrayEquals(new int[]{2}, toArray(head));
    }

    @Test
    void threeNodes() {
        ListNode head = createList(1, 2, 3);
        ListNode nodeToDelete = head.next;
        solution.deleteNode(nodeToDelete);
        assertArrayEquals(new int[]{1, 3}, toArray(head));
    }

    @Test
    void longList() {
        ListNode head = createList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ListNode nodeToDelete = head.next.next.next;
        solution.deleteNode(nodeToDelete);
        assertArrayEquals(new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10}, toArray(head));
    }
}
