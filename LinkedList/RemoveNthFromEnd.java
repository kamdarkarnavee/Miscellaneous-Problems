package LinkedList;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow_pointer = head;
        ListNode head_pointer = slow_pointer;
        ListNode fast_pointer = head;
        int fast_count = 0, slow_count = 0;

        if(head == null || head.next == null){
            return null;
        }

        while(fast_pointer.next != null){
            fast_pointer = fast_pointer.next;
            fast_count++;
            if(fast_count - slow_count == n+1){
                slow_pointer = slow_pointer.next;
                slow_count++;
            }
        }

        if(fast_count+1 == n){
            head_pointer = head_pointer.next;
        }else{
            slow_pointer.next = slow_pointer.next.next;
        }

        return head_pointer;

    }
}
