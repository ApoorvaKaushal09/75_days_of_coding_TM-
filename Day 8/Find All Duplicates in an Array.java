import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            // nums[nums]
            if(nums[Math.abs(nums[i])-1]  < 0)
                arr.add(Math.abs(nums[i]));
            nums[Math.abs(nums[i])-1] = -(nums[Math.abs(nums[i])-1]);
            
        }
        return arr;
        
    }
}