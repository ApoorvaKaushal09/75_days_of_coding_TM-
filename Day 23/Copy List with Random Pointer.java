class Solution {
    public Node copyRandomList(Node head) {
        if(head==null )
            return null;
        Node curr=head,next;
        while(curr!=null)
        {
             Node dummy=new Node (curr.val);
            next=curr.next;
            dummy.next=next;
            curr.next=dummy;
            curr=next;
        }
        curr=head;Node tail;
        while(curr!=null)
        {
            tail=curr.next;
            if(curr.random==null)
                tail.random=null;
            else
            tail.random=curr.random.next;
            curr=tail.next;
        }
        curr = head;
        Node newHead = head.next;
        Node itr = newHead;
        while(curr != null){
            curr.next = curr.next.next;
            curr = curr.next;
            if(curr != null){
                itr.next = itr.next.next;
                itr = itr.next;
            }
        }
      
        return newHead;
    }
}