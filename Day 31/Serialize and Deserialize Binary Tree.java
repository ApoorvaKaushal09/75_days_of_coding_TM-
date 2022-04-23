public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String s = "";
        if(root == null)
            return s;
        Queue<TreeNode> q = new LinkedList<>();
        // Queue<String>  q1 = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node == null) {
                s+="null_";
                continue;
            }
            s+= node.val + "_";
            q.add(node.left);
            q.add(node.right);
        }
        System.out.println(s);
        return s;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length() == 0)
            return null;
        String[] arr = data.split("_");
        TreeNode root = new TreeNode(Integer.valueOf(arr[0]));
        Queue<TreeNode> q = new LinkedList<>();
        int k = 0;
        q.add(root);
        for(int i = 0; i < arr.length-2 && !q.isEmpty();)
        {
            TreeNode curr = q.poll();
            ++i;
            if(arr[i].equals("null"))
            curr.left = null;
            else 
            {
                curr.left = new TreeNode(Integer.valueOf(arr[i]));
                q.add(curr.left);
            }
            ++i;
            if(arr[i].equals("null"))
            curr.right = null;
            else 
            {
                curr.right = new TreeNode(Integer.valueOf(arr[i]));     
                q.add(curr.right);
            }
        }
        return root;
    }
}

