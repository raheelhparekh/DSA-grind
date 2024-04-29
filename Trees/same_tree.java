package Trees;
/*
 * LeetCode: 100. Same Tree https://leetcode.com/problems/same-tree/description/
 * TC=O(n) and SC=O(h) where h is the height of the tree
 */

public class same_tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        
        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        
        return false;        
    }
}
