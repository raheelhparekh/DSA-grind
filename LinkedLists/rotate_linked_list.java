package LinkedLists;
/*
 * LeetCode Prob No. 61 : Rotate Linked List
 * Link: https://leetcode.com/problems/rotate-list/
 * TC : 0(2N)
 * SC : 0(1)
 * Approach:1) Find the length of the linked list
 *          2) Connect the last node to the first node
 *          3) Find rotation k = k % length . since if k is greater than length then it will be same as rotating k%length times
 *          4) Skip first length-rotation-1 node bcoz we already connected the last node to the first node
 *          5) Connect head to the next node of the newLast
 *          6)Make the next node of the newLast as null and return the head 
 * 
 * Strivers A to Z
 */

public class rotate_linked_list {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null)
            return null;

        ListNode tail = head;
        ListNode temp = head;
        int length = 1;

        while (tail.next != null) {
            length++;
            tail = tail.next;
        }

        int val = k % length;
        if (val == 0)
            return head;

        int count = 1;
        int nodeToReach = length - val;
        while (count != nodeToReach) {
            count++;
            temp = temp.next;

        }
        tail.next = head;
        head = temp.next;
        temp.next = null;

        return head;

    }
}
