import java.util.*;
class Solution {
    
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            
            
        }
        for(int i:hm.keySet())
        {
            if((k==0 && hm.get(i)>1)||(k>0 && hm.containsKey(i+k)))
                c++;
        }
        return c;
    }
}