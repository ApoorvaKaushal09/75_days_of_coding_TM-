import java.util.*;
class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        pre[0] = nums[0];
        for(int i = 1; i < n; i ++)
        {
            pre[i] = pre[i-1] + nums[i];
            
        }
        
        int lsum = 0;
        for(int i = 0; i < n; i++)
        {
            lsum = (i==0)?0:pre[i-1];
            // System.out.println(pre[n-1] - pre[i]);
            
            if(pre[n-1] - pre[i] == lsum)
            {
                return i;
            }
        }
        int rsum = 0;
        // if(pre[n - 1] == 0)
        //     return n-1;
        return -1;
    }
}


// nums[] = [-1,-1,-1,1,1,1]
// pre[] = [-1, -2, -3, -2, -1, 0]       
                  // 3, 9, 14, 20
                  //     28 - 17 = 1