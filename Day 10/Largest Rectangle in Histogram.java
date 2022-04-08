import java.util.*;
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int k=0, n= heights.length;
        int res=0,curr=0;
        for(int i=0;i<heights.length;i++)
        {
            while((!st.isEmpty())&& heights[i]<=heights[st.peek()])
            {
                k=st.pop();
                curr=heights[k]*(st.isEmpty()?(i):(i-st.peek()-1));
                res=Math.max(curr,res);
            }
            st.push(i);
            
        }
        while(!st.isEmpty())
        {
            k=st.pop();
            curr=heights[k]*(st.isEmpty()?n:(n-st.peek()-1));
            res=Math.max(res,curr);
        }
        return res;
        
        
    }
}