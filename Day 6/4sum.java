import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int sum = 0;
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                int left = j+1, right = nums.length - 1;
                while(left < right)
                {
                    sum = nums[left] + nums[i] + nums[j] + nums[right];
                    if(sum == target)
                    {
                        ArrayList<Integer> al =new ArrayList<>();
                        al.add(nums[left]);al.add(nums[right]);
                        al.add(nums[j]);al.add(nums[i]);
                        if(!arr.contains(al))
                        arr.add(al);
                    }
                    if(sum < target )
                        left++;
                    else 
                        right--;
                }
            }
        }
        return arr;
        
    }
}