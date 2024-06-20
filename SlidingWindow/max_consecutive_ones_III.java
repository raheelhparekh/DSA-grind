package SlidingWindow;
/*
 * LeetCode 1004. Max Consecutive Ones III
 * Link: https://leetcode.com/problems/max-consecutive-ones-iii/
 * TC: O(2N)--> O(N) optimised
 * SC: O(1)
 * 
 * Approach: Sliding Window-> Two pointer
 * 1)Count number of zeroes in the window of r
 * 2)if number of zeroes is less than k then only we will count max length
 * 3)if number of zeroes is greater than k then we will move l pointer to right until number of zeroes is less than k
 * 
 * Striver video: https://www.youtube.com/watch?v=KJhqcQZG5KM
 */

public class max_consecutive_ones_III {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int maxLen = 0;
        int len = 0;
        int zeros = 0;

        while (r < nums.length) {
            if (nums[r] == 0) {
                zeros++;
            }
            while (zeros > k) { // if we use while instead of if then TC will be O(N) instead of O(2N)
                if (nums[l] == 0) {
                    zeros--;
                }
                l++;
            }
            if (zeros <= k) {
                len = r - l + 1;
                maxLen = Math.max(len, maxLen);
            }
            r++;
        }
        return maxLen;

    }
}
