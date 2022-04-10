import java.util.*;
class Solution {
    public int search(int i, ArrayList<Integer> arr)
    {
        int left = 0; int right = arr.size()-1, mid = 0;
        while(left <= right)
        {
            mid = (left + right)/2;
            int ele = arr.get(mid);
            if(ele < i)
                left = mid + 1;
            else 
                right = mid - 1;
        }
        if(arr.get(left) == i)
            return left;
        return mid;
        // return left;
    }
    public List<Integer> countSmaller(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i : nums)
            arr.add(i);
        
        Collections.sort(arr);
        for(int i : nums)
        {
            int ind = search(i, arr);
            ans.add(ind);
            arr.remove(ind);
        }
        return ans;
    }
}