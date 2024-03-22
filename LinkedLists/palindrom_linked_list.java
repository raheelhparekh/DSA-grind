package LinkedLists;
/*
 * LeetCode Prob No. 234 : Palindrome Linked List
 * Link: https://leetcode.com/problems/palindrome-linked-list/
 * TC : 0(N)
 * SC : 0(1)
 * Approach: 1) Find the middle of the linked list
 *           2) Reverse the second half of the linked list
 *           3) Break the linked list into two halves
 *           4) re initialize the slow pointer to head
 *           5) Compare the two linked lists
 * 
 */

public class palindrom_linked_list {
    // TC=O(n)
    // SC=O(1)
    public boolean isPalindrome(ListNode head) {
        if(head==null) return false;
        if(head.next==null) return true; // Note: for particular test case with a single element in the linked list

        // Step1: Reach middle of the linked list
        ListNode slow=head;
        ListNode fast=head.next;
        

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        fast=reverse(slow.next);
        slow.next=null; //breaking two half
        slow=head;
        while(slow.val==fast.val){
            slow=slow.next;
            fast=fast.next;
            if(fast==null){
                return true;
            }


        }
        return false;

        
    }
    // Reverse the second half of the linked List
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        ListNode forward=current.next;
        while(forward!=null){
            current.next=prev;
            prev=current;
            current=forward;
            forward=forward.next;
        }
        current.next=prev;
        return current;

    }

}
