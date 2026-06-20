package dev.omatheus.dsa.linkedlists.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopyListWithRandomPointerTest {

    private final CopyListWithRandomPointer solution = new CopyListWithRandomPointer();

    @Test
    void basicList() {
        RandomListNode head = new RandomListNode(1);
        head.next = new RandomListNode(2);
        head.random = head.next;
        RandomListNode result = solution.copyRandomList(head);
        assertNotNull(result);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(result.next, result.random);
    }

    @Test
    void withRandom() {
        RandomListNode head = new RandomListNode(1);
        head.next = new RandomListNode(2);
        head.next.next = new RandomListNode(3);
        head.random = head.next.next;
        head.next.random = head;
        RandomListNode result = solution.copyRandomList(head);
        assertNotSame(head, result);
        assertNotSame(head.next, result.next);
    }

    @Test
    void allRandomNull() {
        RandomListNode head = new RandomListNode(1);
        head.next = new RandomListNode(2);
        RandomListNode result = solution.copyRandomList(head);
        assertNull(result.random);
        assertNull(result.next.random);
    }

    @Test
    void singleNode() {
        RandomListNode head = new RandomListNode(5);
        RandomListNode result = solution.copyRandomList(head);
        assertEquals(5, result.val);
        assertNull(result.next);
    }

    @Test
    void twoNodes() {
        RandomListNode head = new RandomListNode(1);
        head.next = new RandomListNode(2);
        head.random = head.next;
        head.next.random = head;
        RandomListNode result = solution.copyRandomList(head);
        assertNotSame(head, result);
        assertNotSame(head.next, result.next);
    }
}
