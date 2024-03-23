package LinkedLists;
/*
 * LeetCode Prob No. 92 : Reverse Linked List II
 * Link: https://leetcode.com/problems/reverse-linked-list-ii/
 * TC : 0(N)
 * SC : 0(1)
 * Approach:
 * Refer Kunal Kushwaha's video for better understanding
 */

public class reverse_linked_list2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode prev = null;
        ListNode current = head;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;

        }
        // storing the first node of reversal to connect with the end
        ListNode newEnd = current;
        // storing the node just before the reversal so to connect with the end of
        // reversal
        ListNode last = prev;

        ListNode forward = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            // reverse the linked list
            current.next = prev;
            prev = current;
            current = forward;
            if (forward != null) {
                forward = forward.next;
            }
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;

        }

        newEnd.next = current;
        return head;

    }
}
