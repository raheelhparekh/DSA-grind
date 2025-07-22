package LinkedLists;

class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

public class reverse_doubly_linkedlist {
    public DLLNode reverseDLL(DLLNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        // Your code here
        DLLNode curr = head;
        DLLNode prev = null;

        while (curr != null) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;

            curr = curr.prev;

        }
        return prev.prev;
    }
}
