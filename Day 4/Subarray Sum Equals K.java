import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        int sum = 0, c = 0;
        hm.put(0,1);
        for(int i=0;i< nums.length;i++)
        {
            sum+=nums[i];
            // if(nums[i]==k)  
            //     c += hm.get(nums[i]);
            if(hm.containsKey(sum - k))
            {
                int ke = sum - k ;
                // if(ke == nums[i])
                c+= hm.get(ke);
                // hm.remove(ke);
                
            }
            hm.put(sum, hm.getOrDefault(sum,0)+1);
   
        }
        return c;
    }
}