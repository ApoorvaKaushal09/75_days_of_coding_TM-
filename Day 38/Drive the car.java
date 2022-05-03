class Solution {

    public static long required(long a[], long n, long k) {
        // Your code goes here
        int petrol = 0;
        for(int i = 0; i < n; i++)
        {
            if(a[i] > k)
            {
                petrol += a[i] - k;
                k = Math.max(a[i], k);
            }
        }
        return (petrol==0)?-1:petrol;
    }
}