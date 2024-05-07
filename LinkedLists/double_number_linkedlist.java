package LinkedLists;
/*
 * LeetCode 2487 : Double the value of nodes in linked list
 * Link: https://leetcode.com/problems/double-the-value-of-nodes-in-linked-list/
 * TC : O(N)
 * SC : O(1)
 * MEDIUM
 * 
 * Approach : We need to double the value of nodes in linked list
 * We can do this by recursively calling the function and then adding the carry to the current node
 */

public class double_number_linkedlist {
    public ListNode doubleIt(ListNode head) {
        int carry = returnCarry(head);
        return carry == 0 ? head : new ListNode(carry, head);

    }

    private int returnCarry(ListNode head) {
        if (head == null)
            return 0;

        int sum = returnCarry(head.next) + head.val * 2;
        head.val = sum % 10;
        return sum / 10; // this will be the carry
    }
}
