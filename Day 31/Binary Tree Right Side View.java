class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> al = new ArrayList<>();
        if(root == null)
            return al;
        q.add(root);
        while(!q.isEmpty())
        {
            int count = q.size();
            for(int i = 0; i < count; i++)
            {
                TreeNode curr = q.poll();
                if(i == count-1)
                    al.add(curr.val);
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
        }
        return al;
        
    }
}