package Trees;
import java.util.ArrayList;
import java.util.List;
/*
 *  LeetCode: 144. Binary Tree Preorder Traversal
 *  TC: O(n)
 *  SC: O(1)
 *  Approach: Recursion : Root, Left, Right
 */

public class preOrder_traversal {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return list;
    }
    private void preOrder(TreeNode root){
        if(root == null){
            return ;
        }
        list.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
        
    }
}
