class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        
        
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(n);
        for(int i = 0; i< n; i++)
            arr.add(new ArrayList<Integer>());
        for(Map.Entry<Integer, Integer> e: hm.entrySet())
        {
            int key = e.getKey();
            int val = e.getValue();
            arr.get(val-1).add(key);
        }
        
        int a = 0;
        int[] ans = new int[k];
        for(int i = arr.size()-1 ; a<k && i >= 0; i--)
        {
            ArrayList<Integer> ar = arr.get(i);
            if(ar.size()>=1)
            {
                for(int j = 0; j < ar.size(); j++)
                {
                    ans[a++] = ar.get(j);
                }
            }
        }
        return ans;
    }
}