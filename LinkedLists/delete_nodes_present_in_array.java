package LinkedLists;

/*
 * LeetCode 3217. Delete Nodes From Linked List Present in Array
 * Link: https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/description/?envType=daily-question&envId=2024-09-06
 * TC: O(N)
 * SC: O(N)
 * 
 * Approach:
 * 1. Create a hashset and add all the elements of the array to it.
 * 2. Traverse the linked list and delete the nodes which are present in the hashset.
 * 3. Return the modified linked list.
 */

import java.util.HashSet;
public class delete_nodes_present_in_array {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for (var num : nums)
            set.add(num);
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode curr = dummyHead, prev = dummyHead;
        while (curr != null) {
            ListNode nextNode = curr.next;
            if (set.contains(curr.val)) {
                prev.next = nextNode;
            } else {
                prev = curr;
            }
            curr = nextNode;
        }
        return dummyHead.next;

    }
}
