package dev.omatheus.dsa.heaps.hard;

import dev.omatheus.dsa.heaps.hard.MergeKSortedLists.ListNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeKSortedListsTest {

    private final MergeKSortedLists solution = new MergeKSortedLists();

    private ListNode createList(int... values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    private void assertListEquals(ListNode head, int... expected) {
        for (int val : expected) {
            assertNotNull(head);
            assertEquals(val, head.val);
            head = head.next;
        }
        assertNull(head);
    }

    @Test
    void basicMerge() {
        ListNode[] lists = new ListNode[]{
                createList(1, 4, 5),
                createList(1, 3, 4),
                createList(2, 6)
        };
        ListNode result = solution.mergeKLists(lists);
        assertListEquals(result, 1, 1, 2, 3, 4, 4, 5, 6);
    }

    @Test
    void emptyList() {
        ListNode[] lists = new ListNode[]{};
        assertNull(solution.mergeKLists(lists));
    }

    @Test
    void singleList() {
        ListNode[] lists = new ListNode[]{createList(1, 2, 3)};
        ListNode result = solution.mergeKLists(lists);
        assertListEquals(result, 1, 2, 3);
    }

    @Test
    void differentLengths() {
        ListNode[] lists = new ListNode[]{
                createList(1),
                createList(2, 3, 4, 5)
        };
        ListNode result = solution.mergeKLists(lists);
        assertListEquals(result, 1, 2, 3, 4, 5);
    }

    @Test
    void allEmpty() {
        ListNode[] lists = new ListNode[]{null, null, null};
        assertNull(solution.mergeKLists(lists));
    }

    @Test
    void twoLists() {
        ListNode[] lists = new ListNode[]{
                createList(1, 3),
                createList(2, 4)
        };
        ListNode result = solution.mergeKLists(lists);
        assertListEquals(result, 1, 2, 3, 4);
    }
}
