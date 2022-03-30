import java.util.*;
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int left = 0, right = n-1, sum = 0;
        int i;
        for(i = 0; i < n; i++)
            sum += cardPoints[i];
        int p = n-k, curr = 0;
        for(i = 0; i < p; i++)
        {
            curr+= cardPoints[i];
        }
        if (n == k)
            return sum;
        int max = sum - curr;
        for(int j = i; j < n; j++)
        {
            curr -= cardPoints[j-p];
            curr +=cardPoints[j];
            max = Math.max(sum-curr, max);
        }
        return max;
    }
}