class Solution {
    class Pair{
        TreeNode node;
        int val;
        Pair(TreeNode n, int v)
        {
            node = n; 
            val = v;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root, 0));
        int max = 1, k = 0, st = 0, end = 0;
        while(!q.isEmpty())
        {
            int count=q.size();
            int ans = 0;
            // max = Math.max(count+next, max);
            k=0;
            for(int i=0;i<count;i++)
            {
                Pair curr = q.poll();
                if(i == 0)
                    st = curr.val;
                if(i == count -1)
                    end = curr.val;
                if(curr.node.left != null)
                    q.add(new Pair(curr.node.left, curr.val*2));
                if(curr.node.right != null)
                    q.add(new Pair(curr.node.right, curr.val*2+1));
            }
            max = Math.max(end - st + 1, max);
        }
        return max;
    }
}