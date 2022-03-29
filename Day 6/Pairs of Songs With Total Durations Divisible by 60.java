import java.util.*;
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int c = 0, n = time.length;
        for(int i = 0; i < n; i++)
        {
            int a = (time[i]%60);
            System.out.print(a+" ");
            if(hs.containsKey(60 - a))
                c+=hs.get(60 - a);
            if(a == 0)
                 hs.put(60,hs.getOrDefault(60,0)+1);
            hs.put(a,hs.getOrDefault(a,0)+1);
        }
        return c;
    }
}