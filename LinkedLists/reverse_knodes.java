package LinkedLists;

/*
 * Leet Code Problem: 25. Reverse Nodes in k-Group
 * Difficulty: Hard
 * Link: https://leetcode.com/problems/reverse-nodes-in-k-group/
 * 
 * TC: O(N) = O(N) + O(N) , find kth node and to reverse LL
 * SC: O(1)
 * 
 */

public class reverse_knodes {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {

            ListNode kthNode = getKthNode(temp, k);
            if (kthNode == null) {
                if (prev != null) {
                    prev.next = temp;
                    break;
                }

            }

            ListNode newNode = kthNode.next; // remembered next node before breaking
            kthNode.next = null;
            @SuppressWarnings("unused")
            ListNode rev = reverse(temp);

            // identify the first group, since we want to return head
            if (temp == head) {
                head = kthNode;
            } else {
                prev.next = kthNode;

            }
            prev = temp;
            temp = newNode;
        }
        return head;
    }

    public ListNode getKthNode(ListNode head, int k) {

        ListNode temp = head;
        int count = 1;
        while (temp !=null && count < k) {
            temp = temp.next;
            count++;
        }

        return temp;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;

        while (temp != null) {
            ListNode forward = temp.next;
            temp.next = prev;
            prev = temp;
            temp = forward;
        }
        return prev;
    }
}
