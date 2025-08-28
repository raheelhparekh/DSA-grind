package Arrays;
/*
 * Leetcode 907 : Sum of Subarray Minimums
 * Link : https://leetcode.com/problems/sum-of-subarray-minimums/
 * 
 * Approach : Brute force
 * TC : O(n^2)
 * SC : O(1)
 * 
 * CAN BE OPTIMISED USING MONOTONIC STACK
 */

public class sum_of_subarray_minimums {
    public int sumSubarrayMins(int[] arr) {

        int sum = 0;
        int min = 0;
        int mod = (int) (1e9 + 7);

        for (int i = 0; i < arr.length; i++) {
            min = arr[i];

            for (int j = i; j < arr.length; j++) {
                min = Math.min(min, arr[j]);

                sum = (sum + min) % mod;

            }
        }

        return sum;

    }
}
