package Trees;

/*
 * LeetCode Problem 104: Maximum Depth of Binary Tree
 * Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * TC: O(n) will have to traverse to all nodes
 * SC: O(n) for recursive stack
 */

public class maximum_depth_binary_tree {
    public int maxDepth(TreeNode root) {

        // RECURSIVE ITERATION: 1 + max from (left,right)

        if(root==null) return 0;

        int maxHeightLeft=maxDepth(root.left);
        int maxHeightRight=maxDepth(root.right);

        return 1+ Math.max(maxHeightLeft,maxHeightRight);
        
    }
}
