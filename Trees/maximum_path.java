package Trees;
/*
 * LeetCode Problem 124: Binary Tree Maximum Path Sum
 * Link: https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * 
 * TC: O(n)
 * SC: O(n)
 * 
 * traverse each node, find left sum, find right sum, maintain maxSeenSoFar and keep updating by leftSum + rightSum + root.val. return root.val + max(leftSum, rightSum). but finally return maxSeenSoFar which is the answer.
 */

public class maximum_path {
    int maxSeenSoFar = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxCount(root);
        return maxSeenSoFar;

    }

    public int maxCount(TreeNode root) {
        if (root == null)
            return 0;

        int leftSum = Math.max(0, maxCount(root.left)); // if there is a negative root,just return 0 from it
        int rightSum = Math.max(0, maxCount(root.right));

        int count = root.val + leftSum + rightSum;
        maxSeenSoFar = Math.max(maxSeenSoFar, count);

        return root.val + Math.max(leftSum, rightSum);
    }
}
