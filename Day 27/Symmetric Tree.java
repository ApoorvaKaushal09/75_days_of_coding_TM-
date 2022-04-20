class Solution {
    public boolean isValid(TreeNode root1, TreeNode root2)
    {
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        return (root1.val == root2.val) && isValid(root1.left, root2.right) && isValid(root1.right, root2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return isValid(root.left, root.right);
    }
}