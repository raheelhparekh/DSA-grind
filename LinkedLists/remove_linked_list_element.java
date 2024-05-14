package LinkedLists;
/*
 * LeetCode 203 Remove Linked List Elements
 * Link: https://leetcode.com/problems/remove-linked-list-elements/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 */

public class remove_linked_list_element {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;

        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.next.val==val){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        // if the head is the value to be removed
        if(head.val==val){
            return head.next;
        }
        else{
            return head;

        }
        
    }
}
