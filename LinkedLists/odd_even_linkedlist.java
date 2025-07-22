package LinkedLists;

/*
 * LeetCode Problem : 328 Odd Even Linked List
 * Problem Link : https://leetcode.com/problems/odd-even-linked-list/
 * 
 * TC= O(N)
 * SC= O(1)
 */

public class odd_even_linkedlist {
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next==null){
            return head;
        }

        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenNode=even;

        while(even != null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;

            odd=odd.next;
            even=even.next;
        }

        odd.next=evenNode;

        return head;
        
    }
    
}
