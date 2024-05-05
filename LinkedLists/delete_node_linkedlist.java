package LinkedLists;
/*
 * Leetcode 237. Delete Node in a Linked List
 * TC: O(1) SC: O(1)
 * link: https://leetcode.com/problems/delete-node-in-a-linked-list/
 * There is a singly-linked list head and we want to delete a node node in it.

    You are given the node to be deleted node. You will not be given access to the first node of head.
    All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.
    Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:
    The value of the given node should not exist in the linked list.
    The number of nodes in the linked list should decrease by one.
    All the values before node should be in the same order.
    All the values after node should be in the same order.

    Input: head = [4,5,1,9], node = 5
    Output: [4,1,9]
    
    Leetcode:MEDIUM but 2 line soln Logi`c is important

    Approach: Pehle node ka value ko next node ka value me copy karo and then next node ko delete karo
    kyuki hume previous node tak access nahi hai so we copied the value of next node to current node and then deleted the next node.
    agar directly delet karege toh hume previous node tak access karna padega jo ki nahi hai
 */

public class delete_node_linkedlist {
    public void deleteNode(ListNode node) {
        // A->B->C->D suppose need to delete B
        node.val=node.next.val;  // A->C->C->D copied the value of C to B because we need to delete B and we can't access the previous node so we copied the value of next node to current node and then deleted the next node 
        node.next=node.next.next; // A->C->D
        
    }
    
}
