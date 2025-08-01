package LinkedLists;
/*
 * Striver's SDE Sheet : Flattening of Linked List
 * Problem Link: https://takeuforward.org/plus/dsa/problems/flattening-of-ll
 * TC: O(NM)
 * SC: O(1)
 */

public class flattening_of_linkedlist {
    public ListNode flattenLinkedList(ListNode head) {

        if(head==null || head.next == null){
            return head;
        }

        ListNode mergedHead=flattenLinkedList(head.next);
        return merge2List(head,mergedHead);

    }

    public ListNode merge2List(ListNode t1,ListNode t2){
        ListNode dummy=new ListNode(-1);
        ListNode res=dummy;

        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                res.child=t1;
                res=t1;
                t1=t1.child;
            }
            else{
                res.child=t2;
                res=t2;
                t2=t2.child;
            }
        }

        if(t1 != null) res.child=t1;
        if(t2 !=null) res.child=t2;

        return dummy.child;
    }
}
