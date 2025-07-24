package LinkedLists;

/*
 * Leet Code Problem 148 : Sort List
 * Link : https://leetcode.com/problems/sort-list/
 * 
 * We are applying merge sort on linked list.
 * we are splitting by middle. and to reach middle we are using slow & fast pointer logic.
 * we are splitting until we reach the base case of linked list whihc is single element
 * Then we merge the two sorted linked lists back together.
 * 
 * TC= O (n log n)
 * SC= O(1) not using extra space. we are merging in place.
 */

public class sort_linkedlist {
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode middle = reachMiddle(head);
        ListNode leftHead = head;
        ListNode rightHead = middle.next;
        middle.next = null;

        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);

        return merge(leftHead, rightHead);

    }

    public ListNode reachMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode curr = dummy;

        while (t1 != null && t2 != null) {
            if (t1.val < t2.val) {
                curr.next = t1;
                t1 = t1.next;
                curr = curr.next;

            } else {
                curr.next = t2;
                t2 = t2.next;
                curr = curr.next;
            }

        }
        if (t1 != null) {
            curr.next = t1;
        }
        if (t2 != null) {
            curr.next = t2;
        }

        return dummy.next;
    }

}
