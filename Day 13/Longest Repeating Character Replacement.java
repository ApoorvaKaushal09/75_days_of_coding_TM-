import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        int maxc = 0, max = Integer.MIN_VALUE;
        int[] count = new int[26];
        int n = s.length();
        int start = 0;
        for(int i = 0; i < n; i++)
        {
            int p = s.charAt(i)-'A';
            count[p]++;
            if(count[p]>max)
                max = count[p];
            while(i - start + 1 - max > k)
            {
                count[s.charAt(start) - 'A']--;
                start++;
            }
            maxc = Math.max(maxc, i - start +1);
                
        }
        return maxc;
        
        
        
    }
}