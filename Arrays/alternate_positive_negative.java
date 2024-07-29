package Arrays;
/*
 * LeetCode 2149. Rearrange Array Elements by Sign
 * Link:https://leetcode.com/problems/rearrange-array-elements-by-sign/
 * TC: O(n)
 * SC: O(n)
 */

public class alternate_positive_negative {
    public int[] rearrangeArray(int[] nums) {
        int pos[] = new int[nums.length / 2];
        int posIndex = 0;
        int neg[] = new int[nums.length / 2];
        int negIndex = 0;
        int ans[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos[posIndex++] = nums[i];
            } else {
                neg[negIndex++] = nums[i];
            }
        }

        int i = 0;
        int j = 0;
        int index = 0;

        for (int x = 0; x < nums.length; x++) {
            if (x % 2 == 0) {
                ans[index++] = pos[i++];
            } else {
                ans[index++] = neg[j++];
            }
        }
        return ans;
    }
}
