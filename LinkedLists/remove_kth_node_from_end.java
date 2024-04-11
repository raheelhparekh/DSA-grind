package LinkedLists;
/*
 * Leetcode Prob 19: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * Tc: O(N) where N is the number of nodes in the linked list
 * SC: O(1)
 * 
 */

public class remove_kth_node_from_end {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current=head;
        int count=0;
        while (current != null) {
            count++;
            current = current.next;
        }
        int positionToRemove = count - n;

        // Handle edge case: if the position to remove is the head node
        if (positionToRemove == 0) {
            return head.next;
        }
        ListNode prev=head;

        current = head.next;
        for (int i = 1; i < positionToRemove; i++) {
            prev=prev.next;
            current = current.next;
        }
        prev.next = current.next;

        return head;

    }
}
