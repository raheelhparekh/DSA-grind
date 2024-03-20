package LinkedLists;
/*
 * LeeetCode Problem No. 143 : Reorder Linked List
 * Link: https://leetcode.com/problems/reorder-list/
 * TC : 0(N)
 * SC : 0(1)
 * Approach: We first find the middle of the linked list. Then we reverse the second half of the linked list. Then we merge the two linked lists.
 * Great Sum - Full logic and concepts , must do
 * Solving by me? : Yes, S30 video
 * 
 * Example: 1->2->3->4->5
 * After finding the middle, we get 1->2->3 and 4->5. Note : The first half should always have more elements than the second half.
 * After reversing the second half, we get 1->2->3 and 5->4
 * After merging, we get 1->5->2->4->3
 */

public class reorder_linked_list {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return ;

        //STEP1 : Finding Middle Of lINKED list and plus the first half should always have more elements than the second half. for this we keep slow at head whereas fast at head.next

        ListNode slow=head;
        ListNode fast=slow.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // Step2: Reverse second half of the Linked list

        fast=reverse(slow.next);
        slow.next=null; // breaking of the two halves


        // Step3: Merge them together
        slow=head;
        ListNode dummy=slow.next;
        while(fast!=null){
            slow.next=fast;
            fast=fast.next;
            slow.next.next=dummy;
            slow=dummy;
            if(dummy==null) break;
            dummy=dummy.next;
        }


        
        
    }
    //reversing the second half of the linked list

    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        ListNode forward=current.next;
        while(forward!=null){
            current.next=prev;
            prev=current;
            current=forward;
            forward=forward.next;

        }
        current.next=prev;
        return current;
    }
}
