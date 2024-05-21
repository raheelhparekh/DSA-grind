package LinkedLists;
/*
 * Leetcode Problem: 24 Swap Nodes in Pairs {MEDIUM}
 * Link: https://leetcode.com/problems/swap-nodes-in-pairs/
 * TC: O(n)
 * SC: O(1)
 * Input: 1->2->3->4
 * Output: 2->1->4->3
 * 
 * Approach: Create a dummy listnode and point it to head. Then, create a prev node and point it to dummy node.
 * Then, iterate through the list and swap the nodes in pairs.
 * Carefully update the pointers and return the dummy.next
 * 
 * 
 */

public class swap_nodes_in_pairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        
        ListNode prev = dummy;
        
        

        while (head != null && head.next != null) {
            // nodes to be swapped
            ListNode first = head;
            ListNode second = head.next;


            // swap first and second node
            prev.next = second; // written first to avoid cycle and time limit exceeded 
            first.next = second.next; 
            second.next = first;
            

            
            // moving to next pair likewise
            prev = first; // prev is now first because for next round, first will be the prev
            head = first.next; 

        }

        return dummy.next;
    }
}
