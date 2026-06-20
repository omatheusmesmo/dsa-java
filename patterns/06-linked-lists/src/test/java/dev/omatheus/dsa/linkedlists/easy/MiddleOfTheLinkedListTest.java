package dev.omatheus.dsa.linkedlists.easy;

import dev.omatheus.dsa.linkedlists.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedListTest {

    private final MiddleOfTheLinkedList solution = new MiddleOfTheLinkedList();

    private ListNode createList(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    @Test
    void oddLength() {
        ListNode result = solution.middleNode(createList(1, 2, 3, 4, 5));
        assertEquals(3, result.val);
    }

    @Test
    void evenLength() {
        ListNode result = solution.middleNode(createList(1, 2, 3, 4, 5, 6));
        assertEquals(4, result.val);
    }

    @Test
    void singleNode() {
        ListNode result = solution.middleNode(createList(1));
        assertEquals(1, result.val);
    }

    @Test
    void twoNodes() {
        ListNode result = solution.middleNode(createList(1, 2));
        assertEquals(2, result.val);
    }

    @Test
    void threeNodes() {
        ListNode result = solution.middleNode(createList(1, 2, 3));
        assertEquals(2, result.val);
    }

    @Test
    void longList() {
        int[] values = new int[100];
        for (int i = 0; i < 100; i++) values[i] = i + 1;
        ListNode result = solution.middleNode(createList(values));
        assertEquals(51, result.val);
    }
}
