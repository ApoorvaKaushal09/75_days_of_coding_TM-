public int count(int[] nums, int mid)
    {
        int count = 0;
            for (int a: nums) {
                if(a > mid)
                {
                    count+=(a)/mid;
                if(a%mid == 0)
                    count--;
                }
            }
        return count;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int max = Integer.MIN_VALUE, ans = 0;
        for(int i = 0; i < nums.length; i++)
        {
            max = Math.max(nums[i], max);
        }
        int right = max;
        int left = 1;
        while(left <= right)
        {
            int mid = (left + right)/2;
            int op = count(nums, mid);
            if(op <= maxOperations)
            {
                ans = mid;
                right = mid - 1;
            }
            else 
            {
                left = mid + 1;
            }
        }
        return ans;
    }