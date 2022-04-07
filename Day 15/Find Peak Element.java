import java.util.*;
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length - 1;
        if( n == 0)
            return 0;
        int left = 0, right = n;
        while(left <= right)
        {
            int mid = (left + right)/2;
            if ((mid == 0 || nums[mid - 1] <= nums[mid]) && (mid == nums.length - 1 || nums[mid + 1] <= nums[mid])) {
              return mid;
          }
            else 
            {
                if(nums[mid+1] > nums[mid])
                    left = mid+1;
                else 
                    right = mid - 1;
            }
        }
        return 0;
    }
}