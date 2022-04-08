import java.util.*;
class Solution {
    class Pair{
        int x;int y;
        Pair(int a, int b)
        {
            x=a;
            y=b;
        }
    }
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        // return intervals;
        int n=intervals.length;
        // int[][] a=new int[n][2];
        int end=intervals[0][1];
        int start=intervals[0][0];
        ArrayList<Pair> arr=new ArrayList<>();
        for(int i=1;i<n;)
        {
            int flag=0;
            while(i<n && end>=intervals[i][0])
            {
                flag=1;
                end=Math.max(end,intervals[i][1]);
                i++;
            }
            if(i==intervals.length)
                break;
            arr.add(new Pair(start,end));
            
            start=intervals[i][0];
            end=intervals[i][1];
            i++;
                
        }
        arr.add(new Pair(start,end));
        int l=arr.size();
        int[][] res=new int[l][2];
        for(int i=0;i<l;i++)
        {
            res[i][0]=arr.get(i).x;
            res[i][1]=arr.get(i).y;
        }
        
        return res;
        
    }
}