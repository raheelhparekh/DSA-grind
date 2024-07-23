package Sorting;
/*
 * Leetcode 26. Remove Duplicates from Sorted Array
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * TC: O(N)
 * SC: O(1)
 */

public class remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // Handle edge case when array is empty
        }

        int index = 1; // Start from the second element since the first is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
