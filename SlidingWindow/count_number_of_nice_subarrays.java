package SlidingWindow;
/*
 * Leetcode: 1248. Count Number of Nice Subarrays
 * Link: https://leetcode.com/problems/count-number-of-nice-subarrays/
 * TC: O(N)
 * SC: O(1)
 * Approach: Sliding Window
 * Prefix is used to count the number of subarrays that can be formed with the current odd number
 * count is used to keep track of the number of odd numbers in the current subarray
 * When count reaches k, we start counting the subarrays
 * We keep track of the number of subarrays that can be formed with the current odd number
 * We add the prefix to the answer
 * We move the left pointer to the right
 * We move the right pointer to the right
 * We repeat the process until the right pointer reaches the end of the array
 */

public class count_number_of_nice_subarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        int l = 0, r = 0;
        int count = 0, ans = 0, prefix = 0;
        
        while (r < nums.length) {
            // If the number is odd, increase the count
            if (nums[r] % 2 == 1) {
                count++;
                prefix = 0;
            }
            
            // When count reaches k, count the subarrays
            while (count == k) {
                prefix++;
                if (nums[l] % 2 == 1) {
                    count--;
                }
                l++;
            }
            
            // Add all the valid subarrays
            ans += prefix;
            r++;
        }
        
        return ans;
    }
}
