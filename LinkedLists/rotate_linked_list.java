package LinkedLists;
/*
 * LeetCode Prob No. 61 : Rotate Linked List
 * Link: https://leetcode.com/problems/rotate-list/
 * TC : 0(N)
 * SC : 0(1)
 * Approach:1) Find the length of the linked list
 *          2) Connect the last node to the first node
 *          3) Find rotation k = k % length . since if k is greater than length then it will be same as rotating k%length times
 *          4) Skip first length-rotation-1 node bcoz we already connected the last node to the first node
 *          5) Connect head to the next node of the newLast
 *          6)Make the next node of the newLast as null and return the head 
 * 
 * Reference: to Kunal Kushwaha's video for better understanding
 */

public class rotate_linked_list {
    // TC =O(n)
    // SC=O(1)
    public ListNode rotateRight(ListNode head, int k) {
        if (k <= 0 || head == null)
            return head;
        // step 1 : finding length of Linked lIST
        ListNode last = head;
        int c = 1;
        while (last.next != null) {
            last = last.next;
            c++;
        }

        last.next = head;
        int rotations = k % c;
        ListNode newLast = head;

        // skip first length-rotations node
        for (int i = 0; i < (c - rotations - 1); i++) {
            newLast = newLast.next;

        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }
}
