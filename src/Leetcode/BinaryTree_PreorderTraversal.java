package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*class TreeNode {
//	Definition for a binary tree node.
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
   }
}
*/
class Solution {
    public static List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        
        while(!stack.isEmpty()|| root!=null){
        	// keep traversing till we reach left most node
            while(root!=null){
                list.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return list;
    }
}

public class BinaryTree_PreorderTraversal {

	public static void main(String [] args) {
		TreeNode node = new TreeNode(1); 
        node.left = new TreeNode(2); 
        node.right = new TreeNode(3); 
        node.left.left = new TreeNode(4); 
        node.left.right = new TreeNode(5); 
        
        List<Integer> list = Solution.preorderTraversal(node);
        
        for(int val : list) {
        	System.out.println(val);
        }
        
	}
}
