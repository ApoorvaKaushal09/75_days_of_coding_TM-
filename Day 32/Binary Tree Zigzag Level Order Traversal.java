class Solution 
{
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> al = new ArrayList<>();
        if(root == null)
            return al;
        
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        
        while(!s1.isEmpty() || !s2.isEmpty())
        {
            ArrayList<Integer> temp = new ArrayList<>();
            while(!s1.isEmpty())
            {
                TreeNode curr = s1.pop();
                temp.add(curr.val);
                
                if(curr.left != null)
                    s2.push(curr.left);
                if(curr.right != null)
                    s2.push(curr.right);
            }
            if(temp.size() > 0)
            al.add(temp);
            temp = new ArrayList<>();
            while(!s2.isEmpty())
            {
                TreeNode curr = s2.pop();
                temp.add(curr.val);
                if(curr.right != null)
                    s1.push(curr.right);
                if(curr.left != null)
                    s1.push(curr.left);
            }
            if(temp.size() > 0)
            al.add(temp);
        }
        
        return al;
    }
}