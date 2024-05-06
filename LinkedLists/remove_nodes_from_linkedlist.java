package LinkedLists;

import java.util.Stack;
/*
 * LeetCode 2487 : Remove All Nodes That Have Greater Value on Right Side
 * Link: https://leetcode.com/problems/remove-nodes-from-linked-list/
 * TC : O(N)
 * SC : O(N) used stacks
 * MEDIUM
 * 
 * Approach : We need to remove all the nodes that have a greater value on the right side.
 *  We put all values in stack . we check if element has greater value then the lement on top of the stack we pop the element from stack
 * like wise then we add to the linked list
 */

public class remove_nodes_from_linkedlist {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;

        while (curr != null) {
            while (!stack.isEmpty() && stack.peek().val < curr.val) {
                stack.pop();
            }
            stack.push(curr);
            curr = curr.next;
        }

        ListNode nxt = null;
        while (!stack.isEmpty()) {

            curr = stack.pop();
            curr.next = nxt;
            nxt = curr;
        }

        return curr;
    }
    
}
