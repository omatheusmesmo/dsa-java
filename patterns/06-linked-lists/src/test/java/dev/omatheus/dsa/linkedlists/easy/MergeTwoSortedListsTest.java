package dev.omatheus.dsa.linkedlists.easy;

import dev.omatheus.dsa.linkedlists.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists solution = new MergeTwoSortedLists();

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
    void bothNonEmpty() {
        ListNode result = solution.mergeTwoLists(createList(1, 2, 4), createList(1, 3, 4));
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, toArray(result));
    }

    @Test
    void oneEmpty() {
        ListNode result = solution.mergeTwoLists(createList(1, 2, 3), null);
        assertArrayEquals(new int[]{1, 2, 3}, toArray(result));
    }

    @Test
    void bothEmpty() {
        ListNode result = solution.mergeTwoLists(null, null);
        assertNull(result);
    }

    @Test
    void differentLengths() {
        ListNode result = solution.mergeTwoLists(createList(1), createList(2, 3, 4, 5));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, toArray(result));
    }

    @Test
    void allSame() {
        ListNode result = solution.mergeTwoLists(createList(1, 1, 1), createList(1, 1));
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, toArray(result));
    }

    @Test
    void oneLarger() {
        ListNode result = solution.mergeTwoLists(createList(5), createList(1, 2, 3));
        assertArrayEquals(new int[]{1, 2, 3, 5}, toArray(result));
    }
}
