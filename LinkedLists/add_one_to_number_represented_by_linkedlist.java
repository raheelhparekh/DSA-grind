package LinkedLists;
/*
 * Problem: Add One to Number Represented by Linked List
 * Striver's SDE Sheet
 * Link: https://takeuforward.org/data-structure/add-one-to-number-represented-by-linked-list/
 * 
 * Given the head of a singly linked list representing a positive integer number. Each node of the linked list represents a digit of the number, with the 1st node containing the leftmost digit of the number and so on. The task is to add one to the value represented by the linked list and return the head of a linked list containing the final value.

    The number will contain no leading zeroes except when the value represented is zero itself.
    Input: head -> 1 -> 2 -> 3

    Output: head -> 1 -> 2 -> 4

    Explanation: The number represented by the linked list = 123.

    123 + 1 = 124.

    * Approach: 
    1) Iterative approach
    2) Backtracking approach
 */

public class add_one_to_number_represented_by_linkedlist {
    public ListNode addOne(ListNode head) {
        ListNode temp = head;
        int carry = helper(temp);

        if (carry == 1) {
            ListNode newNode = new ListNode(1);
            newNode.next = head;
            return newNode;
        }

        return head;
    }

    public int helper(ListNode temp) {
        if (temp == null) {
            return 1;
        }
        int carry = helper(temp.next);

        temp.val = temp.val + carry;
        if (temp.val < 10) {
            return 0;
        }
        temp.val = 0;
        return 1;
    }
}
