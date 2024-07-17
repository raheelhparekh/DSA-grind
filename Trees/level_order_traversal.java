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
 * Approach: 
 * Queue me root add kiya
 * while queue is not empty
 * we will remove the head of the queue. check if it has left and right child. If yes, add them to the queue.
 * remove the head of the queue and add it to the answer list
 * 
 * we need to keep track of the level size. So, we will add a for loop to iterate over the level size.
 * level size will be the size of the queue at the start of the loop.
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
