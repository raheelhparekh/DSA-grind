package LinkedLists;
/*
 * LeetCode Prob No. 876 : Middle of the Linked List
 * Link: https://leetcode.com/problems/middle-of-the-linked-list/
 * TC : 0(N)
 * SC : 0(1)
 * We use fast and slow pointer same approach to detect the middle of the linked list.
 * suppose 2 people are running, one is running at double speed of the other. So, when the faster one reaches the end, the slower one will be at the middle.
 */

public class middle_of_linkedlist {
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;   
    }
    
}
