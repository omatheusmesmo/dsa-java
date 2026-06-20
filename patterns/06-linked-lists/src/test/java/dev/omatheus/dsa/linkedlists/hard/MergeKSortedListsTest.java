package dev.omatheus.dsa.linkedlists.hard;

import dev.omatheus.dsa.linkedlists.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeKSortedListsTest {

    private final MergeKSortedLists solution = new MergeKSortedLists();

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
    void basicMerge() {
        ListNode[] lists = {createList(1, 4, 5), createList(1, 3, 4), createList(2, 6)};
        ListNode result = solution.mergeKLists(lists);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4, 5, 6}, toArray(result));
    }

    @Test
    void emptyList() {
        ListNode[] lists = {};
        ListNode result = solution.mergeKLists(lists);
        assertNull(result);
    }

    @Test
    void singleList() {
        ListNode[] lists = {createList(1, 2, 3)};
        ListNode result = solution.mergeKLists(lists);
        assertArrayEquals(new int[]{1, 2, 3}, toArray(result));
    }

    @Test
    void differentLengths() {
        ListNode[] lists = {createList(1), createList(2, 3, 4, 5)};
        ListNode result = solution.mergeKLists(lists);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, toArray(result));
    }

    @Test
    void allEmpty() {
        ListNode[] lists = {null, null, null};
        ListNode result = solution.mergeKLists(lists);
        assertNull(result);
    }

    @Test
    void twoLists() {
        ListNode[] lists = {createList(1, 3), createList(2, 4)};
        ListNode result = solution.mergeKLists(lists);
        assertArrayEquals(new int[]{1, 2, 3, 4}, toArray(result));
    }

    @Test
    void fiveLists() {
        ListNode[] lists = {
            createList(1), createList(2), createList(3), createList(4), createList(5)
        };
        ListNode result = solution.mergeKLists(lists);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, toArray(result));
    }
}
