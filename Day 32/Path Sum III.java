class Solution {

    public int pathSum(TreeNode root, int targetSum) {
        int[] ans = new int[1];
        Map<Integer,Integer> map = new HashMap<>(); // to store all prefix sum
        map.put(0,1); // to handle case where currSum == target
        traverse(root,0,map,ans,targetSum);
        return ans[0];
 
    }
    
    public void traverse(TreeNode root, int currSum, Map<Integer,Integer> map, int[] ans, int targetSum){
        if(root == null)
            return;
        currSum+=root.val;
        
        if(map.containsKey(currSum - targetSum) && map.get(currSum - targetSum) > 0)
            ans[0]+=map.get(currSum - targetSum);
        map.put(currSum,map.getOrDefault(currSum,0)+1);
        traverse(root.left, currSum, map, ans,targetSum);
        traverse(root.right, currSum, map, ans, targetSum);
        map.put(currSum,map.getOrDefault(currSum,0)-1); // backtrack

    }
}