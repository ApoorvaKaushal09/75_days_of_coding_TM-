import java.util.*;
class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        for(int i = 0; i < grid.length; i++)
        {
            int left = 0, right = grid[i].length - 1;
            int mid;
            while(left<=right)
            {
                mid = (left+right)/2;
                if(grid[i][mid] < 0)
                {
                    ans += right - mid + 1;
                    System.out.println(ans);
                    right = mid -1;
                }
                else left = mid + 1;
                
                
            }
        }
        return ans ;
        
    }
}