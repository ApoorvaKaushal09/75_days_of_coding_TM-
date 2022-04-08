import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                nums[i] = -101;
            }
        }
        int k = 0;
        for(int i = 0; i < n; i ++)
        {
            if(nums[i] != -101)
                nums[k++] = nums[i];
            // else 
            //     k++;
        }
        return k;
    }
}