import java.util.*;
class Solution {
    public int pivot(int nums[])
    {
        int left = 0, right = nums.length-1, n = nums.length;
        while(left < right)
        {
            int mid = (left + right)/2;
            if(mid+1 <= n-1 && nums[mid] > nums[mid + 1])
            {
                return mid;
            }    
            if(left == right - 1)
            {
                if(nums[left]>nums[right])
                {
                    return left;
                }
                else 
                    return right;
            }
            if(nums[mid] < nums[left])
            {
                right  = mid-1;
            }
            else 
                left = mid+1;
        }
        return left;
    }
    public int search(int[] nums, int target) {
        
        int pos = pivot(nums),  n = nums.length, left = 0, right = n-1;
        // System.out.println(pos);
        if(n==1 && nums[0] == target)
            return 0;
        
            if(nums[0] <= target && nums[pos] >=target)
            {
                
                right = pos;
            }
                
            else 
            {
                left = pos+1;
            }
                
            while(left <= right)
            {
                int mid = (left + right)/2;
                if(nums[mid] == target )
                    return mid;
                if(nums[mid] > target)
                    right = mid -1;
                    
                else 
                    left = mid+1;
            }
        return -1;
        }
}