class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        if(root == null)
            return arr;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int count = q.size();
            List<Integer> al = new ArrayList<>();
            for(int i = 0; i < count; i++)
            {
                TreeNode curr = q.poll();
                al.add(curr.val);
                 if(curr.left != null)
                     q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
            arr.add(al);
        }
        return arr;
    }
}