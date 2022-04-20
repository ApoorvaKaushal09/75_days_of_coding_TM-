class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[nums.length - k+1];
        for(int i = 0; i < k ; i++)
        {
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
                dq.pollLast();          
            dq.offerLast(i);
        }
        ans[0] = nums[dq.peekFirst()];
        // int[] ans = new int[n-k+1];
        int j = 0, n = nums.length;
        for(int i =  k; i < n; i++)
        {
            if(dq.peekFirst() <= i-k)
                dq.removeFirst();
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
                dq.pollLast();
            dq.offerLast(i);
            ans[i - k + 1] = nums[dq.peekFirst()];
        }
        return ans;
    }
}