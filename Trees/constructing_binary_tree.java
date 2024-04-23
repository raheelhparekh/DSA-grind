package Trees;
import java.util.HashMap;
/*
 * LeetCode: 105. Construct Binary Tree from Preorder and Inorder Traversal
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * TC=O(n) and SC=O(n) where n is the number of nodes in the tree
 * Approach: Recursive approach used HASHMAP
                1. Create a hashmap of inorder elements and their index
                2. Pre = Root L R . Start with 0th index of preorder and create a root node
                3. Find the index of root in inorder array. Inorder= L Root R. Elemet to the left of root is left subtree and right is right subtree
                4. Recursively call the left and right subtree
    S30             
 */

public class constructing_binary_tree {
    HashMap<Integer, Integer> map = new HashMap<>();
    int index;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder == null || inorder == null || preorder.length == 0)
            return null;

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(preorder, 0, inorder.length - 1);

    }

    private TreeNode helper(int[] preorder, int start, int end) {
        // base
        if (start > end) {
            return null;
        }
        int rootVal = preorder[index];
        index++;
        TreeNode root = new TreeNode(rootVal);
        int rootIndex = map.get(rootVal);
        root.left = helper(preorder, start, rootIndex-1);
        root.right = helper(preorder, rootIndex + 1, end);
        return root;
    }
}
