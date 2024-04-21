package Trees;
/*
 * LeetCode: 101. Symmetric Tree https://leetcode.com/problems/symmetric-tree/description/
 * TC=O(n) and SC=O(h) where h is the height of the tree
 * Approach: Recursive approach
 */

public class symmetric_tree {
    boolean isValid;
    public boolean isSymmetric(TreeNode root) {
        isValid=true;
        if (root == null) {
            return isValid;
        }

        dfs(root.left, root.right);
        return isValid;
    }

    private void dfs(TreeNode left, TreeNode right ){
        //base
        if(left==null && right==null){
            return;
        }
        if(left==null || right==null || left.val!=right.val){
            isValid=false;
            return;
        }


        //logic
        dfs(left.left,right.right);
        dfs(left.right,right.left);
    }
}
/*
 *  Better optimized way in terms of less lines
 * public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode left, TreeNode right ){
        //base
        if(left==null && right==null){
            return true;
        }
        if(left==null || right==null || left.val!=right.val){
            
            return false;
        }


        //logic
        return dfs(left.left,right.right) && dfs(left.right,right.left);
    }
 */