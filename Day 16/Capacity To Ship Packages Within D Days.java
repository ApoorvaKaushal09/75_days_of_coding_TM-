class Solution {
    public int day(int[] weights, int sum)
    {
        int d = 1, curr = 0;
        for(int i = 0; i < weights.length; i++)
        {
            curr += weights[i] ;
            if(curr > sum)
            {
                curr = weights[i];
                d++;
            }
        }
        return d;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max = 0, sum = 0,ans = 0;
       for(int i = 0; i < weights.length; i++)
       {
           sum += weights[i];
           max = Math.max(weights[i], max);
       }
        int left = max, right = sum;
        while(left <= right)
        {
            int mid = (left + right)/2;
            int dd = day(weights, mid);
            System.out.println(dd);
            if(dd <= days)
            {
                ans = mid;
                right = mid-1;
            }
            else if(dd < days)
            {
                right=mid-1;
                
            }
            else 
                left = mid+1;
        }
        return ans;
    }
}