import java.util.*;
class Solution {
    class Count{
        int c;
    }
    public boolean isSafe(int[][] grid, int i, int j)
    {
        int m = grid.length, n = grid[0].length;
        if(i < 0 || i >= m || j < 0 || j >= n)
            return false;
        if(grid[i][j] == 1)
        {
            grid[i][j] = 2;
             return true;
        }
           
        return false;
    }
    public void caller(int[][] grid, int i, int j, Count cc)
    {
        boolean flag = false;
        if(isSafe(grid, i, j+1))
        {
            flag = true;
            cc.c++;
            caller(grid, i,  j+1, cc);
        }
        if(isSafe(grid, i, j-1))
        {
            flag = true;
            cc.c++;
            caller(grid, i,  j-1, cc);
        }
        if(isSafe(grid, i+1, j))
        {
            flag = true;
            cc.c++;
            caller(grid, i+1,  j, cc);
        }
        if(isSafe(grid, i-1, j))
        {
            flag = true;
            cc.c++;
            caller(grid, i-1,  j, cc);
        }
        if(flag == false)
            return;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int max = Integer.MIN_VALUE;
        
        Count cc = new Count();
        cc.c = 0;
//         if(n==0)
//         {
//             for(int i = 0; i < m; i++)
//             {
//                 if(grid[i][0] == 1)
//                 {
//                     cc.c = 0;
//                     caller(grid, i, 0, cc);
//                 }
                    
//             }
//             return cc.c;
//         }
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(grid[i][j] == 1)
                {
                    cc.c = 0;
                    caller(grid, i, j, cc);
                    if(cc.c == 0)
                        cc.c = 1;
                    if(cc.c > max)
                        max = cc.c;
                    
                }
                    
            }
        }
        max = Math.max(cc.c, max);
        return max;
    }
}