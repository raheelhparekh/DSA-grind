package LinkedLists;
/*
 *  LeetCode Problem Number: 21
 *  Link: https://leetcode.com/problems/merge-two-sorted-lists/
 *  TC : 0(N+M)
 *  SC : 0(1)
 * 
 * DUMMY NODE
 * here we are just re arranging the links of the existing nodes
 * so we don't need to create new linked list
 * dummy node is used to avoid confusion and simply return dummy.next
 *  
 */

public class merge_two_LL {
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode t1 = list1;
            ListNode t2 = list2;

            ListNode dummy = new ListNode(-1);
            ListNode curr = dummy;

            while (t1 != null && t2 != null) {
                if (t1.val < t2.val) {
                    curr.next = t1;
                    t1 = t1.next;
                    curr = curr.next;
                } else {
                    curr.next = t2;
                    t2 = t2.next;
                    curr = curr.next;
                }
            }

            if (t1 != null) {
                curr.next = t1;
            }
            if (t2 != null) {
                curr.next = t2;
            }

            return dummy.next;

        }
    }
}
