package LinkedLists;
/*
 *  Concept in case question asks us to find number of nodes in a linked list cycle.
 *  So basically we need to detect a cycle and then count the number of nodes in the cycle.
 * by keeping fast pointer at the same place and moving slow pointer by 1 step, we can count the number of nodes in the cycle.
 * TC : 0(N)
 * SC : 0(1)
 */

public class nodes_in_a_cycle {
    public int nodes_in_cycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int count = 0; 
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                do{
                    slow=slow.next;
                    count++;
                }while(slow!=fast);
            }
            return count;
        }
        return -1;

    }
    
}
