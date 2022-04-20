/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum = 0;
    public int dia(TreeNode root)
    {
        if(root == null)
            return 0;
        int lmax = dia(root.left);
        int rmax = dia(root.right);
        sum = Math.max(lmax+ rmax,sum);
        return 1 + Math.max(lmax, rmax);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int ans = dia(root);
        return sum;
    }
}