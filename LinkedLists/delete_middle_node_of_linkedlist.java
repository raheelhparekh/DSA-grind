package LinkedLists;

/*
 * LeetCode Problem 2095. Delete the Middle Node of a Linked List
 * Link: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
 * 
 * TC: O(n)
 * SC: O(1)
 */

public class delete_middle_node_of_linkedlist {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }

        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=head;

        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }

        prev.next=slow.next;
        return head;
        
    }
    
}
