package Trees;
import java.util.HashMap;
/*
 * LeetCode: 106. Construct Binary Tree from Inorder and Postorder Traversal
 * https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 * TC=O(n)
 * SC=O(n) where n is the number of nodes in the tree
 * Approach: Recursive approach used HASHMAP
                1. Create a hashmap of inorder elements and their index
                2. Post = L R Root . Start with last index of postorder and create a root node
                3. Find the index of root in inorder array. Inorder= L Root R. Element to the left of root is left subtree and right is right subtree
                4. Recursively call the right and left subtree
    S30 
    Note the twist in this code:  u need to first do right then left to eliminate the error of index out of bounds because we are starting from the end of postorder L R Root        
 
 */

public class constructing_binary_tree2 {
    HashMap<Integer, Integer> map = new HashMap<>();
    int index;

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        if (postorder == null || inorder == null || postorder.length == 0)
            return null;

        index=postorder.length-1; // root at the end
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(postorder, 0, inorder.length-1);

    }

    private TreeNode helper(int[] postorder, int start, int end) {
        // base
        if (start > end) {
            return null;
        }
        //logic
        int rootVal = postorder[index];
        index--;
        TreeNode root = new TreeNode(rootVal);
        int rootIndex = map.get(rootVal);
        //note **** twist in this code:  u need to first do right then left to eliminate the error of index out of bounds because we are starting from the end of postorder 
        root.right = helper(postorder, rootIndex + 1, end);
        root.left = helper(postorder, start, rootIndex - 1);
        
        return root;
    }
}
