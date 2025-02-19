package Trees;

/*
 * LeetCode Problem 103: Binary Tree Zigzag Level Order Traversal
 * Link: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 * TC: O(N)
 * SC: O(N)
 * 
 * Level Order traversal but keep a flag of left to right or right to left. keep updating after each iteration of level filling.
 * Code similar to level order traversal
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class zig_zag_order_traversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean fromLeftToRight = true;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            LinkedList<Integer> ds = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                if (fromLeftToRight) {
                    ds.addLast(node.val);
                } else {
                    ds.addFirst(node.val);
                }
                
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            fromLeftToRight = !fromLeftToRight;
            ans.add(ds);
        }

        return ans;
    }
}
