import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
     int c=1,prev=nums[0],maj=prev;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==maj)
            {
                maj=nums[i];c++;
                
            }
            else
            {
                c--;
                 // maj=nums[i];
            }
                // c--;
            if(c==0)
            {
                c=1;
                maj=nums[i];
            }
            prev=nums[i];
        }
        // c=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==maj)
        //         c++;
        // }
        return maj;
    }
}