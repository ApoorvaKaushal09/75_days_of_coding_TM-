class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while(l1 != null)
        {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null)
        {
            s2.push(l2.val);
            l2 = l2.next;
        }
        ListNode newHead = null, curr = new ListNode();
        int sum = 0, carry = 0;
        while(!s1.isEmpty() && !s2.isEmpty())
        {
            sum = s1.pop() + s2.pop() +carry;
            curr = new ListNode(sum%10);
            curr.next = newHead;
            newHead = curr;
            carry = sum/10;
        }
        while(!s1.isEmpty())
        {
            sum = s1.pop() +carry;
            curr = new ListNode(sum%10);
            curr.next = newHead;
            newHead = curr;
            carry = sum/10;
        }
        while(!s2.isEmpty())
        {
            sum = s2.pop() +carry;
            curr = new ListNode(sum%10);
            curr.next = newHead;
            newHead = curr;
            carry = sum/10;
        }
        if(carry != 0)
        {
            curr = new ListNode(carry);
            curr.next = newHead;
            newHead = curr;
        }
        return newHead;
    }
}