package dev.omatheus.dsa.linkedlists.medium;

/**
 * Definition for a Node with random pointer.
 */
class RandomListNode {
    public int val;
    public RandomListNode next;
    public RandomListNode random;

    public RandomListNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
