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
/*

    * Iterative approach using Queue
        TC=O(n) and SC=O(n)
        Approach: Using Queue
        1. Add left and right child of root to the queue
        2. Poll two nodes from the queue and compare their values
        3. Add left child of left node and right child of right node to the queue
        4. Add right child of left node and left child of right node to the queue
        5. Repeat the process until queue is empty
        6. If at any point, the values are not equal or one of the node is null, return false
        7. If the queue is empty, return true

  public boolean isSymmetric(TreeNode root) {

        if(root==null) return true;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root.left);
        q.add(root.right);
        while(!q.isEmpty()){
            TreeNode left=q.poll();
            TreeNode right=q.poll();
            if(left==null && right==null) continue;
            if(left==null || right==null || left.val!=right.val){
                return false;
            }

            q.add(left.left);
            q.add(right.right);
            q.add(left.right);
            q.add(right.left);


        }
        return true;
    }
} */