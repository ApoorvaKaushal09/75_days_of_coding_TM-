class Solution {
    int sum = 0;
    public void Sum(TreeNode root, int low, int high)
    {
        if(root == null)
            return;
        if(root.val >= low && root.val <= high)
        {
            sum += root.val;
            Sum(root.left, low, high);
            Sum(root.right, low, high);
        }
        else if(root.val < low)
            Sum(root.right, low, high);
        else 
            Sum(root.left, low, high);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        Sum(root, low, high);
        return sum;
    }
}