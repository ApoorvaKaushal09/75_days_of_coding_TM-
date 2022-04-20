class Solution {
    ArrayList<String> al = new ArrayList<>();
    public void helper(TreeNode root,String s)
    {
        s+=root.val;
        if(root.left == null && root.right ==null)
        {
            al.add(s);
            return ;
        }
        if(root.left!= null)
            helper(root.left, s + "->");
        if(root.right != null)
            helper(root.right, s + "->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        helper(root,"");
        return al;
    }
}