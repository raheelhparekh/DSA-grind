package monotonic_stack;
import java.util.Stack;
/*
 * Leet Problem 496. Next Greater Element I
 * Link : https://leetcode.com/problems/next-greater-element-i/
 * 
 * Approach : using monotonic stack
 * 1. Create a stack to keep track of the elements for which we need to find the next greater element.
 * 2. Traverse the second array (nums2) from right to left.
 * 3. For each element, pop elements from the stack until we find a greater element or the stack becomes empty.
 * 4. If the stack is empty, it means there is no greater element, so we store -1.
 * 5. If we found a greater element, we store it in the nextgreater array.
 * 6. Finally, we map the results for the first array (nums1) using the nextgreater array.
 *
 * TC : O(2N)
 * SC : O(N)
 */

public class next_greater_element {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int nextgreater[] = new int[10001];
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nextgreater[nums2[i]] = -1;
                st.push(nums2[i]);
            } else {
                nextgreater[nums2[i]] = st.peek();
                st.push(nums2[i]);
            }

        }

        int ans[] = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nextgreater[nums1[i]];
        }

        return ans;

    }
}
