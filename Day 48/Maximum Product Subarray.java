class Solution {
    public int maxProduct(int[] nums) {
        int res= nums[0], l = 0, r = 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int n = nums.length;
        for(int i = 0; i < nums.length; i++)
        {
            l = (l == 0? 1 : l) * nums[i];
            r = (r == 0? 1 : r) * nums[n - 1 - i];
            res = Math.max(res, Math.max(l, r));
        }
        return res;
    }
}