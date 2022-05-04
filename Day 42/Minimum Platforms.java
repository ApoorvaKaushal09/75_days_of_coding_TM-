class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code hereA
        Arrays.sort(arr);
        Arrays.sort(dep);
        int plat = 1, j = 0;
        for(int i = 1; i < n; i++)
        {
            if(arr[i] > dep[j])
            j++;
            else 
            {
                plat ++;
            }
        }
        
        return plat;
    }
    
}