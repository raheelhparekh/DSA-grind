package Trees;
import java.util.ArrayList;
import java.util.List;
/*
 *  LeetCode: 94. Binary Tree Inorder Traversal
 *  TC: O(n)
 *  SC: O(1)
 *  Approach: Recursion : Left, Root, Right
 
 */

public class inOrder_traversal {
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return list;
    }
    private void inorder(TreeNode root){
        if(root == null){
            return ;
        }
        
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}

/*
 * public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();

        TreeNode node=root;
        while(true){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }
            else{
                if(stack.isEmpty()){
                    break;
                }
                node=stack.pop();
                list.add(node.val);
                node=node.right;

            }
        }
        return list;
    }
 */
