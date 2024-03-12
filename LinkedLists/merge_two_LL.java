package LinkedLists;
/*
 *  LeetCode Problem Number: 21
 *  Link: https://leetcode.com/problems/merge-two-sorted-lists/
 *  TC : 0(N+M)
 *  SC : 0(1)
 *  
 */

public class merge_two_LL {
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode ans=new ListNode();
            ListNode head=ans;
    
            while(list1!=null && list2!=null){
                if(list1.val<list2.val){
                    head.next=list1;
                    list1=list1.next;
                    head=head.next;
                    
                }
                else{
                    head.next=list2;
                    list2=list2.next;
                    head=head.next;
                }
            }
            while(list1!=null){
                head.next=list1;
                list1=list1.next;
                head=head.next;
            }
            while(list2!=null){
                head.next=list2;
                list2=list2.next;
                head=head.next;
            }
            return ans.next;
        }
    }
    
}
