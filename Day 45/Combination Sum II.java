class Solution {
    List<List<Integer>> al = new ArrayList<>();
    public void caller(int[] candidates, int target, ArrayList<Integer> arr, int sum, int curr)
    {
        if(target < 0)
            return;
        if(target == 0)
        {
            // Collections.sort(arr);
            // if(!al.contains(arr))
            al.add(new ArrayList<Integer>(arr));
            return;
        }
        for(int i = curr; i < candidates.length; i++)
        {
            if(i > curr && candidates[i] == candidates[i-1]) continue;
            arr.add(candidates[i]);
            caller(candidates, target - candidates[i], arr, sum + candidates[i], i+1);
            arr.remove(arr.size() -1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // Collections.s
        Arrays.sort(candidates);
        caller(candidates, target, new ArrayList<Integer>(), 0, 0);
        return al;
    }
}