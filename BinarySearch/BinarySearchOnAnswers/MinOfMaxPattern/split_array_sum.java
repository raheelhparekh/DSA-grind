/*
 * LeetCode: 410 Split Array Largest Sum
 * Link : https://leetcode.com/problems/split-array-largest-sum/
    Input: nums = [7,2,5,10,8], k = 2
    Output: 18
    Explanation: There are four ways to split nums into two subarrays.
    The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.

    PATTERN : BS ON ANSWERS MAX(MIN) TYPE
    TC: O(Nlog2(sum-max+1))
 */

public class split_array_sum {
    public int splitArray(int[] nums, int k) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            sum += nums[i];
        }

        int low = max;
        int high = sum;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int split = split_array(nums, mid);

            if (split > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public int split_array(int nums[], int mid) {
        int totalSoFar = nums[0];
        int split = 1;

        for (int i = 1; i < nums.length; i++) {
            if (totalSoFar + nums[i] <= mid) {
                totalSoFar += nums[i];
            } else {
                split++;
                totalSoFar = nums[i];
            }
        }
        return split;
    }
}
