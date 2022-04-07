import java.util.*;
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int left = 0, right = n-1,ans = 0;
        while(left <= right)
        {
             int mid = (left+right)/2;
            // if()
            if((mid -1 >=0 && arr[mid] > arr[mid-1]) && (mid +1 <=n-1)&&arr[mid] > arr[mid+1])
                return mid;
            else if(arr[mid+1] > arr[mid])
                left = mid+1;
            else 
                right = mid-1;
        }
        return ans;
    }
}