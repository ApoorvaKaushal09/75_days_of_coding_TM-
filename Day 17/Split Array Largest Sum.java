import java.util.*;
class Solution {
    public int valid(int sum, int[] nums, int m)
    {
        int c = 1, curr = 0;
        for(int i = 0; i < nums.length; i++)
        {
            curr += nums[i];
            if(curr > sum)
            {
                c++;
                curr = nums[i];
            }
            
        }
        return c;
    }
    public int splitArray(int[] nums, int m) {
        int max = 0, min = 0;
        for(int i = 0; i < nums.length; i++)
        {
            min = Math.max(nums[i], min);
            max += nums[i];
        }
        if(m == 1)
            return max;
        else if( m == nums.length)
            return min;
        int  ans = max;
        while(min <= max)
        {
            int mid = (max + min)/2;
            int curr = valid(mid, nums, m);
            if(curr <= m)
            {
                ans = mid;
                max = mid-1;
            }
            else
                min = mid + 1;
        }
        return ans;
        
    }
}