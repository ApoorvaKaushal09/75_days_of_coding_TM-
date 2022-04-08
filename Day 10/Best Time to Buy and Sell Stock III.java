import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n < 2) return 0;
        
        int p1 = prices[0], p2 = prices[n-1];
        int[] pro1 = new int[n];
        int[] pro2 = new int[n];
        
        for(int i = 1; i < n; ++i){
            pro1[i] = Math.max(pro1[i-1], prices[i] - p1);
            p1 = Math.min(p1, prices[i]);
            
            int j = n-1-i;
            pro2[j] = Math.max(pro2[j+1], p2 - prices[j]);
            p2 = Math.max(p2, prices[j]);
        }
        
        int pro = 0;
        for(int i = 0; i < n; ++i)
            pro = Math.max(pro, pro1[i] + pro2[i]);
        return pro;
    }
}