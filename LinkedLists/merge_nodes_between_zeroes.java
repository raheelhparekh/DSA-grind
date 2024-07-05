package LinkedLists;
/*
 * LeetCode: 2181. Merge Nodes in Between Zeros
 * Link:https://leetcode.com/problems/merge-nodes-in-between-zeros/
 * TC: O(n)
 * SC: O(1)
 * Input: head = [0,3,1,0,4,5,2,0]
    Output: [4,11]
    Explanation: 
    The above figure represents the given linked list. The modified list contains
    - The sum of the nodes marked in green: 3 + 1 = 4.
    - The sum of the nodes marked in red: 4 + 5 + 2 = 11.
 * 
 */

public class merge_nodes_between_zeroes {
    public ListNode mergeNodes(ListNode head) {

        ListNode dummy=head;
        ListNode nextSum=dummy;

        while(nextSum!=null){
            int sum=0;
            while(nextSum.val !=0){
                sum+=nextSum.val;
                nextSum=nextSum.next;
            }
            dummy.val=sum;
            nextSum=nextSum.next;
            dummy.next=nextSum;
            dummy=dummy.next;
        }
        return head.next;
        
    }
}
