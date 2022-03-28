import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        String s="";
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = n-1, up = 0, down = m-1;
        while(up <= down && left <= right)
        {
        for(int i = left; i <= right; i++)
        {
            s =""+up+i;
            if(!hs.contains(s))
            arr.add(matrix[up][i]);
            hs.add(s);
        }
        up++;
        for(int i = up; i <= down; i++)
        {
            s = ""+i+right;
            if(!hs.contains(s))
            arr.add(matrix[i][right]);
            hs.add(s);
        }
        right--;
        for(int i = right; i >= left; i--)
        {
            s = ""+down+i;
            if(!hs.contains(s))
            arr.add(matrix[down][i]);
            hs.add(s);
        }
        down--;
        for(int i = down; i >= up; i--)
        {
            s = ""+i+left;
            if(!hs.contains(s))
            arr.add(matrix[i][left]);
            hs.add(s);
        }
        left++;
        }
        
        return arr;
    }
}