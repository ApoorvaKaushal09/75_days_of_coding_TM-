import java.util.*;
class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        int prev = -1;
        for(int i = 0; i < s.length(); i++)
        {
            hm.put(s.charAt(i), i);
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            max = Math.max(max, hm.get(ch));
            if(i == max)
            {
                arr.add(max - prev);
                prev = max;
            }
        }
        return arr;
    }
}