import java.util.*;
class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int curr = 0;
        int hn = horizontalCuts.length;
        int wn = verticalCuts.length;
        int max1 = Math.max(horizontalCuts[0], h - horizontalCuts[hn - 1]);
        int max2 = Math.max(verticalCuts[0], w - verticalCuts[wn - 1]);
        
        
        for(int i = 1; i < hn; i++)
        {
            curr = horizontalCuts[i] - horizontalCuts[i-1];
            max1 = Math.max(max1, curr);
        }
        for(int i = 1; i < wn; i++)
        {
            curr = verticalCuts[i] - verticalCuts[i-1];
            max2 = Math.max(max2, curr);
        }
        // max1 = Math.max(max1, (h)-horizontalCuts[hn-1]);
        // max2 = Math.max(max2, (w)-verticalCuts[wn-1]);
        // System.out.println(max1%1000000007+" "+max2%1000000007);
        return (int)((long)max1 * max2 %1000000007);
        
        
    }
}