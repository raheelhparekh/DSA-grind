package Trees;
import java.util.ArrayList;
import java.util.List;
/*
 * LeetCode: 145. Binary Tree Postorder Traversal
 * TC: O(n)
 * SC: O(1)
 * Approach: Recursion : Left, Right, Root
 */

public class postOrder {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root)  {
        postorder(root);
        return list;
    }
    private void postorder(TreeNode root){
        if(root == null){
            return ;
        }
        
        postorder(root.left);
        postorder(root.right);
        list.add(root.val);
        
    }
}
