class MinStack {
    ArrayDeque<Integer> dq1;
    ArrayDeque<Integer> dq2;
    public MinStack() {
        dq1 = new ArrayDeque<Integer>();
        dq2 = new ArrayDeque<Integer>();
    }
    
    public void push(int val) {
        dq1.addFirst(val);
        if(dq2.isEmpty() || dq2.getFirst()>=dq1.getFirst())
        dq2.addFirst(dq1.getFirst());
        
    }
    
    public void pop() {
        if(dq1.isEmpty())
            return ;
        if(dq1.removeFirst() == dq2.getFirst())
            dq2.removeFirst();
        
        
    }
    
    public int top() {
        return dq1.getFirst();
    }
    
    public int getMin() {
        return dq2.getFirst();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// public MinStack() {
//         main = new ArrayDeque<>();
//         min = new ArrayDeque<>();
//     }
    
//     public void push(int val) {
//         main.addFirst(val);
//         if(min.isEmpty()||min.getFirst()>=main.getFirst()){
//             min.addFirst(main.getFirst());
//         }
//     }
    
//     public void pop() {
//         if(main.isEmpty()) return;
//         if(main.removeFirst()==min.getFirst()) min.removeFirst();
//     }
    
//     public int top() {
//         return main.getFirst();
//     }
    
//     public int getMin() {
//         return min.getFirst();
//     }