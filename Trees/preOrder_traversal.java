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

/*
 * Iterative Version using Stacks
 * 
 * // stack me root dala initially
    // root ko pop kiya usko ans me dala
    // root ka right agar he toh stack me add kiya
    // root ka left agar he toh usko add kiya
 * 
 * 
 * class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;

        Stack<TreeNode> st=new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
            root=st.pop();
            ans.add(root.val);

            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
            
        }
        return ans;
    }
}
 */