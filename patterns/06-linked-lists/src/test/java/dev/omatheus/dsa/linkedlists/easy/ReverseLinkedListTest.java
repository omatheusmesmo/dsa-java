package dev.omatheus.dsa.linkedlists.easy;

import dev.omatheus.dsa.linkedlists.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    private final ReverseLinkedList solution = new ReverseLinkedList();

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
        ListNode result = solution.reverseList(createList(1, 2, 3, 4, 5));
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, toArray(result));
    }

    @Test
    void singleNode() {
        ListNode result = solution.reverseList(createList(1));
        assertArrayEquals(new int[]{1}, toArray(result));
    }

    @Test
    void twoNodes() {
        ListNode result = solution.reverseList(createList(1, 2));
        assertArrayEquals(new int[]{2, 1}, toArray(result));
    }

    @Test
    void fiveNodes() {
        ListNode result = solution.reverseList(createList(10, 20, 30, 40, 50));
        assertArrayEquals(new int[]{50, 40, 30, 20, 10}, toArray(result));
    }

    @Test
    void emptyList() {
        ListNode result = solution.reverseList(null);
        assertNull(result);
    }

    @Test
    void allSameValues() {
        ListNode result = solution.reverseList(createList(5, 5, 5, 5));
        assertArrayEquals(new int[]{5, 5, 5, 5}, toArray(result));
    }
}
