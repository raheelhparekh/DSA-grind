package LinkedLists;
/*
 *  Leetcode 83. Remove Duplicates from Sorted List
 *  Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 *  Time Complexity: O(n)
 *  Space Complexity: O(1)
 *  
 * 
 */

public class remove_duplicates {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {

            ListNode node = head;
            if (node == null) {
                return head;
            }

            while (node.next != null) {
                if (node.val == node.next.val) {
                    node.next = node.next.next;

                } else {
                    node = node.next;
                }

            }
            return head;

        }
    }

}
