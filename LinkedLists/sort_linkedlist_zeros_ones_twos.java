package LinkedLists;
/*
 * Sort a LL of 0's 1's and 2's
 * Given the head of a singly linked list consisting of only 0, 1 or 2. Sort the given linked list and return the head of the modified list. Do it in-place by changing the links between the nodes without creating new nodes.
    Examples:
    Input: head -> 1 -> 0 -> 2 -> 0 -> 1

    Output: head -> 0 -> 0 -> 1 -> 1 -> 2

    Explanation: The values after sorting are [0, 0, 1, 1, 2].
    Link: https://takeuforward.org/plus/dsa/problems/sort-a-ll-of-0's-1's-and-2's

    TC= O(n)
    SC= O(1) not using extra space. we are merging in place.
 */

public class sort_linkedlist_zeros_ones_twos {
    public ListNode sortList(ListNode head) {

        ListNode dummyOne = new ListNode(-1);
        ListNode dummyTwo = new ListNode(-1);
        ListNode dummyZero = new ListNode(-1);

        ListNode one = dummyOne;
        ListNode two = dummyTwo;
        ListNode zero = dummyZero;

        ListNode temp = head;

        while (temp != null) {
            if (temp.val == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.val == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }

            temp = temp.next;
        }

        zero.next = (dummyOne.next != null) ? (dummyOne.next) : (dummyTwo.next);
        one.next = dummyTwo.next;
        two.next = null;

        return dummyZero.next;
    }
}
