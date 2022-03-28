import java.util.*;
class Solution {
    public void swap(int[] nums, int a, int b)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void reverse(int[] nums, int s, int e)    
    {
        while(s<e)
        {
            swap(nums, s, e);
            s++;
            e--;
        }
    }
    public void nextPermutation(int[] nums) {
        int ind1=-1, n=nums.length;
        if(n<=1)
            return;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                ind1=i;
                break;
            }
        }
        if(ind1==-1)
            reverse (nums, 0, n-1);
        else
        {
            int ind2=-1;
            for(int i=n-1;i>=0;i--)
            {
                if(nums[i]>nums[ind1])
                {
                    ind2=i;
                break;
                } 
            }
            swap(nums, ind1, ind2);
            reverse(nums, ind1+1,n-1);
        }
        
        
    }
}