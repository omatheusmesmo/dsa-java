package dev.omatheus.dsa.linkedlists.medium;

import dev.omatheus.dsa.linkedlists.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {

    private final PalindromeLinkedList solution = new PalindromeLinkedList();

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
    void basicTrue() {
        assertTrue(solution.isPalindrome(createList(1, 2, 2, 1)));
    }

    @Test
    void basicFalse() {
        assertFalse(solution.isPalindrome(createList(1, 2, 3)));
    }

    @Test
    void singleNode() {
        assertTrue(solution.isPalindrome(createList(1)));
    }

    @Test
    void twoNodesTrue() {
        assertTrue(solution.isPalindrome(createList(1, 1)));
    }

    @Test
    void twoNodesFalse() {
        assertFalse(solution.isPalindrome(createList(1, 2)));
    }

    @Test
    void oddLength() {
        assertTrue(solution.isPalindrome(createList(1, 2, 3, 2, 1)));
    }

    @Test
    void evenLength() {
        assertTrue(solution.isPalindrome(createList(1, 2, 3, 3, 2, 1)));
    }

    @Test
    void allSame() {
        assertTrue(solution.isPalindrome(createList(5, 5, 5, 5)));
    }
}
