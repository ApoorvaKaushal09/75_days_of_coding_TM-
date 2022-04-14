public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head,fast=head;
        if(head==null)
            return null;
        while( fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                fast=head;
                while(fast!=slow)
                {
                    fast=fast.next;
                    slow=slow.next;
                    
                }
                return fast;
            }
            
        }
        return null;
        
    }
}