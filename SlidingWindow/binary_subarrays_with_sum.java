package SlidingWindow;
/*
 * Leetcode: 930. Binary Subarrays With Sum
 * Link: https://leetcode.com/problems/binary-subarrays-with-sum/
 * TC: O(N^2)--> brute force
 * SC: O(1)
 */

public class binary_subarrays_with_sum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == goal)
                    cnt++;
                if (sum > goal) {
                    break;
                }
            }
            sum = 0;
        }
        return cnt;
    }
}
