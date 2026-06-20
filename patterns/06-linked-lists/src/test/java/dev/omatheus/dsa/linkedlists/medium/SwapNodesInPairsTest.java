package dev.omatheus.dsa.linkedlists.medium;

import dev.omatheus.dsa.linkedlists.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodesInPairsTest {

    private final SwapNodesInPairs solution = new SwapNodesInPairs();

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
        ListNode result = solution.swapPairs(createList(1, 2, 3, 4));
        assertArrayEquals(new int[]{2, 1, 4, 3}, toArray(result));
    }

    @Test
    void oddNodes() {
        ListNode result = solution.swapPairs(createList(1, 2, 3));
        assertArrayEquals(new int[]{2, 1, 3}, toArray(result));
    }

    @Test
    void singleNode() {
        ListNode result = solution.swapPairs(createList(1));
        assertArrayEquals(new int[]{1}, toArray(result));
    }

    @Test
    void emptyList() {
        ListNode result = solution.swapPairs(null);
        assertNull(result);
    }

    @Test
    void fourNodes() {
        ListNode result = solution.swapPairs(createList(1, 2, 3, 4));
        assertArrayEquals(new int[]{2, 1, 4, 3}, toArray(result));
    }

    @Test
    void sixNodes() {
        ListNode result = solution.swapPairs(createList(1, 2, 3, 4, 5, 6));
        assertArrayEquals(new int[]{2, 1, 4, 3, 6, 5}, toArray(result));
    }
}
