import java.util.*;
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return countDistinct(nums,k) - countDistinct(nums,k-1);
    }
    public int countDistinct(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int start = 0,end = 0, res = 0;
        while(end < nums.length){
            hm.put(nums[end],hm.getOrDefault(nums[end],0)+1);
            while(start <= end && hm.size() > k){
                if(hm.containsKey(nums[start])) 
                    hm.put(nums[start], hm.get(nums[start])-1);
                if(hm.get(nums[start]) == 0) 
                    hm.remove(nums[start]);
                start++;
            }
            res +=  (end - start + 1);
            end++;
        }
        return res;
    }
}