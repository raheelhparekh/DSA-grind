package BinarySearch.BinarySearchOnAnswers;

/*
 * LeetCode Problem 1283: Smallest Divisor Given a Threshold
 * Link: https://leetcode.com/problems/smallest-divisor-given-threshold/
 * TC= O(n*log2(maximum number in the array))
 * SC= O(1)
 */

public class smallest_divisor_given_threshold {
    public int smallestDivisor(int[] nums, int threshold) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        int low = 1;
        int high = max;

        // edge case
        if(possible(nums,max)==threshold){
            return max;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(nums, mid) > threshold) {
                //move right
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return low;

    }

    public int possible(int nums[], int mid) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= mid) {
                count += 1;
            } else {
                count += Math.ceil((double) nums[i] / (double) mid);
            }
        }

        return count;
    }
}
