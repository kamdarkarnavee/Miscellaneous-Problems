package LinkedList;

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode ls = new ListNode(head.val);
        ListNode ptr = ls;
        if(head.next == null){
            return head;
        }
        ListNode temp = head.next;

        while(temp != null){
            if(head.val != temp.val){
                ls.next = temp;
                ls = ls.next;
                head = temp;
            }
            temp = temp.next;
        }
        ls.next = null;
        return ptr;
    }
}
