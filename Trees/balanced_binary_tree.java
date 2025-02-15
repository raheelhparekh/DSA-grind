package Trees;
/*
 * LeetCode Problem 110: Balanced Binary Tree
 * Link: https://leetcode.com/problems/balanced-binary-tree/
 * Balanced Binary Tree: height(left)-height(right)<=1. if the difference is more than 1, then it is not balanced.
 * 
 * LOGIC for the problem:
 * finding height of the tree for each node and doing left height-right height, if it is greater than 1 then return -1 means it is not balanced.
 * if any time i recieve -1 from left height or right height means tree was not balanced earlier, then return -1.
 * 
 * TC: O(n)
 * SC: O(n)
 */

public class balanced_binary_tree {
    public boolean isBalanced(TreeNode root) {

        int ans=heightCheck(root);
        if(ans==-1) return false;

        return true;
    }

    public int heightCheck(TreeNode root){
        if(root==null) return 0;

        int leftHeight=heightCheck(root.left);
        if(leftHeight==-1) return -1;
        int rightHeight=heightCheck(root.right);
        if(rightHeight==-1) return -1;

        if(Math.abs(leftHeight-rightHeight)>1) return -1;
        return 1+Math.max(leftHeight,rightHeight);
    }
}
