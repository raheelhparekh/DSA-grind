package BinarySearch.BinarySearchOnAnswers;

/*
 * LeetCode Problem 1011: Capacity to Ship Packages Within D Days
 * Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
 * TC= O(n*log2(sum-maxElementInArray))
 * SC= O(1)
 */

public class capacity_to_ship_packages_within_days {
    public int shipWithinDays(int[] weights, int days) {

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            max = Math.max(max, weights[i]);
            sum += weights[i];
        }

        int low = max;
        int high = sum;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (daysPossible(weights, mid) > days) {
                // move right
                low=mid+1;
            } else {
                high=mid-1;
            }
        }

        return low;

    }

    public int daysPossible(int weights[], int capacity) {

        int load = 0;
        int day = 1;
        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] <= capacity) {
                load += weights[i];
            } else {
                day += 1;
                load = weights[i];
            }
        }

        return day;
    }
}
