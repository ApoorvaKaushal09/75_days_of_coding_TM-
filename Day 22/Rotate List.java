class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return head;
        ListNode curr=head,next;
        int size=0,rotate=0;
        while(curr!=null)
        {
            curr=curr.next;
            size++;
            
        }
        k=k%size;
        if(k==size||k==0)
            return head;
        curr=head;
        int i=1;
        while(curr!=null&&i<(size-k))
        {
            if(curr.next!=null)
                curr=curr.next;i++;
        }
        next=curr.next;
        curr.next=null;
        ListNode NewHead=next;
        while(next!=null&&next.next!=null)
        {
            next=next.next;
        }
        next.next=head;
        return NewHead;
    }
}