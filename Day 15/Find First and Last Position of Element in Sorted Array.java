import java.util.*;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        int left = 0, right = nums.length -1;
        ans[0] = -1;
        ans[1] = -1;
        if(nums.length == 1 && nums[0] == target)
        {
            ans[0] = 0;ans[1] = 0;
            return ans;
        }
            
        while(left <= right)
        {
            int mid = (left + right)/2;
            if(nums[mid] == target)
            {
                if(mid == 0 && nums[mid] == target)
                    ans[0] = mid;
                if(mid == nums.length - 1 && nums[mid] == target)
                    ans[1] = mid;
                if(mid - 1 >=0 && nums[mid - 1] < nums[mid])
                    ans[0] = mid;
                else if (mid - 1 >=0 && nums[mid - 1] == nums[mid])
                {
                    int middle = mid;
                    while(middle - 1 >=0 && nums[middle - 1] == nums[middle])
                    {
                        middle--;
                    }
                    ans[0] = middle;
                }
                if(mid + 1 <= nums.length-1 && nums[mid] < nums[mid+1])
                {
                    ans[1] = mid;
                }
                else if(mid + 1 <= nums.length-1 && nums[mid] == nums[mid+1])
                {
                    int middle = mid;
                    while(middle + 1 <= nums.length-1 && nums[middle] == nums[middle + 1])
                    {
                        middle++;
                    }
                    ans[1] = middle;
                }
                return ans;
            }
            else if(nums[mid] < target)
                left = mid + 1;
            else 
                right = mid - 1;
        }
        return ans;
        
    }
}