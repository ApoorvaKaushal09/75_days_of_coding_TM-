import java.util.*;
class Solution {
    public void swap(int[] nums,int i, int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int i=0,j=0,r=nums.length-1;
        while(j<=r)
        {
            if(nums[j]==0)
            {
                swap(nums,i,j);
                i++;
                j++;
                
                
            }
            else if(nums[j]==1)
            {
                
                // swap( nums,j,i);
                j++;
            }
            else
            {
                swap(nums,j,r);
                r--;
            }
        }
        
    }
}