class Solution {
    public boolean isSum(TreeNode root, int targetSum)
    {
        // if(targetSum == 0)
            // return true;
        if(root.left == null && root.right == null && targetSum - root.val == 0)
            return true;
        boolean left = hasPathSum(root.left, targetSum - root.val);
        boolean right = hasPathSum(root.right, targetSum - root.val);
        return (left || right);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
            return false;
        return isSum(root, targetSum);
    }
}