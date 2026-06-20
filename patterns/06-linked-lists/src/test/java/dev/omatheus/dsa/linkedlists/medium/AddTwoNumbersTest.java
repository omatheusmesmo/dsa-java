package dev.omatheus.dsa.linkedlists.medium;

import dev.omatheus.dsa.linkedlists.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    private final AddTwoNumbers solution = new AddTwoNumbers();

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
    void basicAdd() {
        ListNode result = solution.addTwoNumbers(createList(2, 4, 3), createList(5, 6, 4));
        assertArrayEquals(new int[]{7, 0, 8}, toArray(result));
    }

    @Test
    void carryOver() {
        ListNode result = solution.addTwoNumbers(createList(9, 9), createList(1));
        assertArrayEquals(new int[]{0, 0, 1}, toArray(result));
    }

    @Test
    void differentLengths() {
        ListNode result = solution.addTwoNumbers(createList(1, 8), createList(0));
        assertArrayEquals(new int[]{1, 8}, toArray(result));
    }

    @Test
    void bothSingleDigit() {
        ListNode result = solution.addTwoNumbers(createList(5), createList(5));
        assertArrayEquals(new int[]{0, 1}, toArray(result));
    }

    @Test
    void withZeros() {
        ListNode result = solution.addTwoNumbers(createList(0), createList(0));
        assertArrayEquals(new int[]{0}, toArray(result));
    }

    @Test
    void largeNumbers() {
        ListNode result = solution.addTwoNumbers(createList(9, 9, 9), createList(1));
        assertArrayEquals(new int[]{0, 0, 0, 1}, toArray(result));
    }

    @Test
    void carryAtEnd() {
        ListNode result = solution.addTwoNumbers(createList(2, 4, 3), createList(5, 6, 4));
        assertArrayEquals(new int[]{7, 0, 8}, toArray(result));
    }
}
