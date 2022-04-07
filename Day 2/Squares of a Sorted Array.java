import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++)
        {
            int sq = nums[i]*nums[i];
            // System.out.println(sq);
            pq.offer(sq);
        }
        int p = 0;
        while(!pq.isEmpty())
        {
            nums[p++] = pq.poll();
            
        }
        return nums;
    }
}