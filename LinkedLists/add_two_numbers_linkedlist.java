package LinkedLists;
/*
 * LeetCode Problem 2: Add Two Numbers
 * Link: https://leetcode.com/problems/add-two-numbers/
 * 
 * DUMMY NODE 
 * Whenever you are asked to create a new Linkedlist always use dummy node concept to keep the list clean and avoid confusion
 * 
 * TC= O( MAX(L1,L2))
 */

public class add_two_numbers_linkedlist {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        ListNode t1 = l1;
        ListNode t2 = l2;
        int carry = 0;
        int sum = 0;

        while (t1 != null || t2 != null) {
            sum = carry;

            if (t1 != null) {
                sum += t1.val;
            }
            if (t2 != null) {
                sum += t2.val;
            }

            int digit = sum % 10;
            carry = sum / 10;

            curr.next = new ListNode(digit);
            curr = curr.next;

            if (t1 != null) {
                t1 = t1.next;
            }
            if (t2 != null) {
                t2 = t2.next;
            }

        }

        if (carry > 0) {
            curr.next = new ListNode(carry);

        }
        return dummy.next;
    }
}
