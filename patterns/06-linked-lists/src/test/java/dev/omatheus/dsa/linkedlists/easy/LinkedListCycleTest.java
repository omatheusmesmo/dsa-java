package dev.omatheus.dsa.linkedlists.easy;

import dev.omatheus.dsa.linkedlists.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    private final LinkedListCycle solution = new LinkedListCycle();

    @Test
    void noCycle() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        assertFalse(solution.hasCycle(head));
    }

    @Test
    void cycleAtStart() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        assertTrue(solution.hasCycle(head));
    }

    @Test
    void cycleInMiddle() {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        head.next = node2;
        node2.next = node3;
        node3.next = node2;
        assertTrue(solution.hasCycle(head));
    }

    @Test
    void singleNodeCycle() {
        ListNode head = new ListNode(1);
        head.next = head;
        assertTrue(solution.hasCycle(head));
    }

    @Test
    void twoNodeCycle() {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        head.next = node2;
        node2.next = head;
        assertTrue(solution.hasCycle(head));
    }

    @Test
    void emptyList() {
        assertFalse(solution.hasCycle(null));
    }

    @Test
    void longCycle() {
        ListNode head = new ListNode(1);
        ListNode tail = head;
        for (int i = 2; i <= 10000; i++) {
            tail.next = new ListNode(i);
            tail = tail.next;
        }
        tail.next = head;
        assertTrue(solution.hasCycle(head));
    }
}
