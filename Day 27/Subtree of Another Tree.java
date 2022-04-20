class Solution {
    public boolean isSame(TreeNode root, TreeNode subRoot)
    {
        
        if(root == null && subRoot == null)
            return true;
        if(root == null || subRoot == null)
            return false;
        return (root.val == subRoot.val) && isSame(root.left, subRoot.left) && isSame(root.right, subRoot.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
    return subRoot == null;
  }
        boolean left = isSubtree(root.left, subRoot);
        boolean right = isSubtree(root.right, subRoot);
        return (isSame(root, subRoot) || left || right);
    }
}