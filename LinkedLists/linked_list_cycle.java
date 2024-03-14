package LinkedLists;
/*
 * LeetCode Prob No. 141 : Linked List Cycle
 * Link: https://leetcode.com/problems/linked-list-cycle/
 * TC : 0(N)
 * SC : 0(1)
 * 
 * Whenever we have cycle related linked list concepts. Always use slow and fast pointer approach.
 * slow moves by 1 and fast moves by 2. If they meet at some point, then there is a cycle.
 * its like 2 people running in a circular track. If one is faster, he will meet the other person at some point.This is the trick to solve this cycle related problems.
 * 
 * Now suppose i you have to find the length of the cycle, then you can use the same approach and when they meet, you can keep one pointer (eg fast pointer) at the meeting point and move the other pointer(slow pointer) till they meet again. The number of steps taken by the second pointer will be the length of the cycle.
 */

public class linked_list_cycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            

            if(slow==fast){
                return true;
            }
        }
        return false;
        
    }

    
}
