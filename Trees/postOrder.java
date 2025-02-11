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

/*
 * using 2 stacks
 * 
 * public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        List<Integer> ans =new ArrayList<>();
        
        if(root==null) return ans;

        stack1.push(root);
        while(!stack1.isEmpty()){
            root=stack1.pop();
            stack2.push(root);

            if(root.left!=null){
                stack1.push(root.left);
            }
            if(root.right!=null){
                stack1.push(root.right);
            }
        }

        while(!stack2.isEmpty()){
            int valueOfNode=stack2.pop().val;
            ans.add(valueOfNode);
        }
        return ans;
    }
 */
