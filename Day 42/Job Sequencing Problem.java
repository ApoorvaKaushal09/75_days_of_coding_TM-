class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        int max = arr[0].deadline;
        for(int i = 0; i < n; i++)
        {
            max = Math.max(max, arr[i].deadline);
        }
        int[] jb = new int[max];
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);
        int a = 0, sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            Job currJob = arr[i];
            
            int index = 0;
            
            if (currJob.deadline < n) {
                index = currJob.deadline-1;
            } else {
                index = n - 1;
            }
            
            while (index >= 0) {
                
                if (jb[index] == 0) {
                    jb[index] = 1;
                    a++;
                    sum += currJob.profit;
                    break;
                }
                
                index--;
            }
            
            
        }
        int[] ans = new int[2];
        ans[0] = a;
        ans[1] = sum;
        return ans;
        
    }
}