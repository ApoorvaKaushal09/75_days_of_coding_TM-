import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = 0;int n = nums.length;
        int diff = 0, ans = 0, min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++)
        {
            int left = i+1, right = n-1;
            while(left < right)
            {
                sum = nums[left] + nums[i] + nums[right];
                
                if(target == sum)
                    return target;
                diff = Math.abs(target - sum);
                if(diff < min)
                {
                    min = diff;
                    ans = sum;
                }
                
                if(sum < target)
                {
                    left++;
                    
                }
                else right--;
            }
        }
        return ans;
        
    }
}