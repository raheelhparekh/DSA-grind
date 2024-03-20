package LinkedLists;
/*
 * LeetCode Prob No. 160 : Intersection of Two Linked Lists
 * Link: https://leetcode.com/problems/intersection-of-two-linked-lists/
 * TC : 0(N+M)
 * SC : 0(1)
 * Approach: Pehle dono list ka length dhundha. fir joh length bada he us list ko utna length tak move kiya taki now we can start comparing from same length and move them by 1 step each .
 * Great Sum - Full logic
 * Solved by me? : Yes , S30 video
 */

public class intersection_of_two_list {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB==null){
            return null;
        }

        int lenA=0;
        ListNode curr=headA;
        while(curr!=null){
            curr=curr.next;
            lenA++;
        }
        int lenB=0;
        curr=headB;
        while(curr!=null){
            curr=curr.next;
            lenB++;
        }

        while(lenA>lenB){
            headA=headA.next;
            lenA--;
        }
        while(lenB>lenA){
            headB=headB.next;
            lenB--;
        }

        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }

        return headA;

        
    }
}
