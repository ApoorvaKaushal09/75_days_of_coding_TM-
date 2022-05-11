class Solution {
    public void caller(List<List<Integer>> arr, ArrayList<Integer> al, int[] candidates, int target, int sum, int curr)
    {
        if(curr >= candidates.length)
        {
            if(sum == target)
            arr.add(new ArrayList<Integer>(al));
            return;
        }
        if(sum > target)
            return ; 
        
        
        al.add(candidates[curr]);
        caller(arr, al, candidates, target, sum+candidates[curr], curr);
               al.remove(al.size()-1);
        caller(arr, al, candidates, target, sum, curr+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        // for(int i = 0; i < n; i++)
        // {
            caller(arr, al, candidates, target, 0, 0);
        // }
        return arr;
    }
}