package monotonic_stack;
import java.util.Stack;
/*
 * Leetcode 503. Next Greater Element II
 * Problem Link: https://leetcode.com/problems/next-greater-element-ii/
 * 
 * Approach : MONOTONIC STACK
 * assume a hypothetical continuos array since array is circular
 *
 * TC=O(4n)
 * SC=O(2n) + O(n)
 */

public class next_greater_element2 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();

        int n = nums.length;
        int nge[] = new int[n];

        for (int i = ((2 * n) - 1); i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= nums[i % n]) {
                st.pop();
            }
            if (i < n) {
                nge[i] = st.isEmpty() ? -1 : st.peek();

            }
            st.push(nums[i % n]);
        }
        return nge;
    }
    
}
