import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int n = height.length, ans = 0, min = 0, left = 0, right = n-1;
        while(left < right)
        {
            ans = (right - left)*(Math.min(height[left], height[right]));
            min = Math.max(min, ans);
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return min;
    }
}