class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, next, newHead;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            // newHead = curr;
            // next.prev = curr;
        }
        // prev = curr;
        return prev;
        
    }
}