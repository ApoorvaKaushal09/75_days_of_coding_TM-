import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        HashSet<List<Integer>> hs = new HashSet<>();
        List<List<Integer>> al = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < nums.length-2; i++)
        {
            int left = i+1, right = n-1;
            while(left < right)
            {
                sum = nums[left] + nums[right] + nums[i] ;
                if(sum== 0)
                {
                    ArrayList<Integer> arr = new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[left]);
                    arr.add(nums[right]);
                    hs.add(arr);
                    left++;
                }
                else if(sum < 0)
                    left++;
                else right--;
            }
        }
        for(List<Integer> a: hs)
            al.add(a);
        return al;
    }
}