class Solution {
    TreeNode first = null, middle = null, last = null, prev = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        
        inorder(root);
        if(first != null && last != null)
        {
            int temp = first.val;
            first.val = last.val;
            last.val = temp;
        }
        else if(first != null && middle != null)
        {
            int temp = first.val;
            first.val = middle.val;
            middle.val = temp;
            
        }
        }
    public void inorder(TreeNode root)
    {
        if(root == null)
            return;
        inorder(root.left);
        if(prev.val > root.val)
        {
            if(first == null)
            {
                first = prev;
                middle = root;
            }
            else
            {
                last = root;
            }
            
        }
        prev = root;
        inorder(root.right);
    }
}