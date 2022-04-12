class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null)
            return null;
        ListNode curr = head;
        int i = 0;
        while(i<n && curr != null)
        {
            curr = curr.next;
            i++;
        }
        ListNode slow = head, prev = head;
        if(curr == null )
            return head.next;
        while(curr != null)
        {
            curr = curr.next;
            
            prev = slow;
            slow = slow.next;
        }
        prev.next = slow.next;
        return head;
        
    }
}