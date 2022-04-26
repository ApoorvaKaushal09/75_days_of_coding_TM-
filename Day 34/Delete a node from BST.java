class Tree {
    // Function to delete a node from BST.
    public static Node deleteNode(Node root, int X) {
        // code here.
        if(root == null)
        return null;
        while(root != null)
        {
            if(root.data > X)
            {
                root.left = deleteNode(root.left, X);
                return root;
            }
            else if(root.data < X)
            {
                root.right = deleteNode(root.right, X);
                return root;
            }
            else 
            {
                if(root.left == null)
                return root.right;
                if(root.right == null)
                return root.left;
                else
                {
                    Node a=succ(root);
                    root.data=a.data;
                    root.right=deleteNode(root.right,a.data);
                }
            }
        }
        return root;
        
    }
    public static Node succ(Node root)
    {
        Node curr = root.right;
        while(curr!= null && curr.left != null)
        {
            curr = curr.left;
        }
        return curr;
    }
}