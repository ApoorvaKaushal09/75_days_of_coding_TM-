class BSTIterator {

    Stack<TreeNode> stack = new Stack<TreeNode>();
private void refreshStack(TreeNode iter){
     while(iter != null){
     	stack.push(iter);
     	iter = iter.left;
     }
}
	
public BSTIterator(TreeNode root) {
   this.refreshStack(root);
}

/** @return whether we have a next smallest number */
public boolean hasNext() {
    return !(stack.isEmpty());
}

/** @return the next smallest number */
public int next() {
    TreeNode node = stack.pop();
    if(node != null){
    	this.refreshStack(node.right);
    	return node.val;
    }
    
    return -1; // should throw exception here.
}
}