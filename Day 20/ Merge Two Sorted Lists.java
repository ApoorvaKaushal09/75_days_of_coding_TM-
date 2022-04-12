class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
     ListNode list = new ListNode(0);
        ListNode tail = list;
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        while(list1!=null && list2!=null)
        {
            if(list1.val < list2.val)
            {
                tail.next = list1;
                list1 = list1.next;
            }
            else 
            {
                tail.next =list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }
        tail.next = (list1 == null)?list2:list1;
        // if(list1 != null)
        // {
        //     tail.next = list1;
        //     // list1=list1.next;
        // }
        // if(list2 != null)
        // {
        //    tail =list2;
        //     // list2=list2.next;
        // }
        return list.next;
    }
}