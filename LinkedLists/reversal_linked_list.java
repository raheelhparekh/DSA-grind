package LinkedLists;
/*
 * LeetCode Prob No. 206 : Reverse Linked List
 * Link: https://leetcode.com/problems/reverse-linked-list/
 * TC : 0(N)
 * SC : 0(1)
 * Approach: We need to reverse the linked list. We use 3 pointers, prev, current and next. We move the current pointer to the next and then move the prev and current pointer by 1 step.
 * Solving by me? : Yes
 */

public class reversal_linked_list {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev=null;
        ListNode current=head;
        ListNode next=head.next;
        while(next!=null){
            current.next=prev;
            prev=current;
            current=next;
            next=next.next;
        }
        current.next=prev;
        return current;

        
    }
    
}
