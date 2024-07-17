package Trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * LeetCode: 102. Binary Tree Level Order Traversal
 * Link: https://leetcode.com/problems/binary-tree-level-order-traversal/
 * TC: O(N)
 * SC: O(N)
 * Striver's Approach
 * 
 * Approach: used queue to store the nodes at each level and then added the nodes to the list
 */


public class level_order_traversal {
     public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int levelSize=queue.size();
            List<Integer> level=new ArrayList<>();

            for(int i=0;i<levelSize;i++){
                TreeNode node=queue.poll();
                level.add(node.val);

                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            ans.add(level);

        }
        return ans;
        
    }
}
