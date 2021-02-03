package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class PostOrder {
	
    public static List<Integer> postOrderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        
        if(root==null){
            return list ;
        }
        stack.push(root);
        
        while(!stack.isEmpty()){
        	TreeNode current = stack.peek();
            	if(current.left==null && current.right==null ) {
            		root = stack.pop();
            		list.add(root.val);
            	}
            	if(current.right!=null) {
            		stack.push(current.right);
            		current.right = null;
            	}
            	if(current.left!=null) {
            		stack.push(current.left);
            		current.left = null;
            	}
            }
        return list;
    }
}

public class BinaryTree_PostOrderTraversal {

	public static void main(String [] args) {
		TreeNode node = new TreeNode(1); 
        node.left = new TreeNode(2); 
        node.right = new TreeNode(3); 
        node.left.left = new TreeNode(4); 
        node.left.right = new TreeNode(5); 
        
        List<Integer> list = PostOrder.postOrderTraversal(node);
        
        for(int val : list) {
        	System.out.println(val);
        }
        
	}
}
