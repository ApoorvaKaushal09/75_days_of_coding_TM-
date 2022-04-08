import java.util.*;
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans = 0, pre = 0, rem = 0; 
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int i = 0; i < nums.length; i++)
        {
            pre += nums[i];
            rem = pre% k;
            if(rem < 0) rem += k;
            if(hm.containsKey(rem))
            {
                ans+= hm.get(rem);
                hm.put(rem, hm.get(rem) + 1);
            }
            else 
                hm.put(rem, 1);
        }
        return ans;
        
    }
}