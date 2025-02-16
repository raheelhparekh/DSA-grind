package Trees;

/*
 * LeetCode Problem 543. Diameter of Binary Tree
 * Link: https://leetcode.com/problems/diameter-of-binary-tree/
 * TC: O(N) - time taken to traverse all node to check for height of the tree
 * SC: O(N)
 * 
 * 
 * Traverse each node , check height and return the height= 1+max(lh,rh). meanwhile also keep a max variable to keep a count of lh+rh.
 * Finally, return the max variable
 */

public class diameter_of_binary_tree {
    int res=0;

    public int diameterOfBinaryTree(TreeNode root) {
        findMax(root);
        return res;
        
    }

    public int findMax(TreeNode root){
        if(root==null) return 0;

        int lh=findMax(root.left);
        int rh=findMax(root.right);

        res=Math.max(res,lh+rh);

        return 1+ Math.max(lh,rh);
    }
}
