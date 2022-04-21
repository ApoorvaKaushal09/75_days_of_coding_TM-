class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        
       TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        return root;
    }
}