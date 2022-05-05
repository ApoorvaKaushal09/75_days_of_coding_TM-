class Solution{
    static boolean subsetSum(int[] arr, int sum, int i, int n)
    {
        if(sum == 0)
        return true;
        if(sum < 0 || i > n-1)
        return false;
        else 
        {
            return subsetSum(arr, sum - arr[i], i+1, n) || subsetSum(arr, sum, i+1, n);
        }
    }
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum = 0;
        for(int i = 0; i < N; i++)
        {
            sum += arr[i];
        }
        if(sum % 2 != 0)
        return 0;
        else 
        return (subsetSum(arr, sum/2, 0, N))?1:0;
    }
}