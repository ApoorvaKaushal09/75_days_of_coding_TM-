class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
	    Stack<Integer> st = new Stack<>();
	    int[] ans = new int[n];
	    for(int i = n-1; i >= 0; i--)
	    {
	        if(st.isEmpty() )
	        {
	            st.push(arr[i]);ans[i] = -1;
	        }
	        
	        else
	        {
	            while(!st.isEmpty() && arr[i] <= st.peek())
	            {
	                st.pop();
	            }
	            ans[i] = (st.isEmpty() ? -1 : st.peek());
	            st.push(arr[i]);
	        }
	         
	        
	       
	        
	    }
	    return ans;
	} 
}
