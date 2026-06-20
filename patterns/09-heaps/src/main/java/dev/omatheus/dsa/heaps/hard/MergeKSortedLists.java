package dev.omatheus.dsa.heaps.hard;

/**
 * <a href="https://leetcode.com/problems/merge-k-sorted-lists/">23. Merge k Sorted Lists</a> (Hard)
 *
 * <p>You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * Merge all the linked-lists into one sorted linked-list and return it.</p>
 *
 * <p><strong>Example:</strong></p>
 * <pre>
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 * </pre>
 *
 * <p><strong>Constraints:</strong></p>
 * <ul>
 *   <li>k == lists.length</li>
 *   <li>0 <= k <= 10^4</li>
 *   <li>0 <= lists[i].length <= 500</li>
 *   <li>-10^4 <= lists[i][j] <= 10^4</li>
 *   <li>lists[i] is sorted in ascending order</li>
 * </ul>
 *
 * @see MergeKSortedListsTest
 */
public class MergeKSortedLists {

    /**
     * Merges k sorted linked lists into one sorted linked list.
     *
     * @param lists array of sorted linked list heads
     * @return the head of the merged sorted linked list
     */
    public ListNode mergeKLists(ListNode[] lists) {
        throw new UnsupportedOperationException("Solve this problem!");
    }

    /**
     * ListNode definition for linked list.
     */
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
