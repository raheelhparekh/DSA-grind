package LinkedLists;
/*
 * LeetCode Prob No. 142 : Linked List Cycle II
 * Link: https://leetcode.com/problems/linked-list-cycle-ii/
 * TC : 0(N)
 * SC : 0(1)
 * Approach: Pehle we need to detect a cycle. agar cycle mila toh slow ko head pe reinitialise karo and then move slow and fast by 1. Jab dono meet karenge, that is the collision point because the distance between the head and the collision point is equal to the distance between the collision point and the start of the cycle.
 * 
 * Solved by me? : Yes , referred to solution for the approach. New concept for me.
 */

public class linked_list_cycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){ // first detect a cycle or not
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                slow=head; //  slow re initialise to head
                while(slow!=fast){ //moving to find out collision point
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
            
        }
        return null;
        
    }
    
}
