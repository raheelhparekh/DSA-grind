package BinarySearch;

/*
 * LeetCode: 540. Single Element in a Sorted Array
 * Link: https://leetcode.com/problems/single-element-in-a-sorted-array/
 * 
 * 4 CASES TO CONSIDER
 */

public class single_element_in_sorted_array {
    public int singleNonDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length - 2;

        // treating edge cases alag se
        if (nums.length == 1) {
            return nums[0];
        }

        if (nums[0] != nums[1]) {
            return nums[0];
        }
        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            // mid is on the even index
            else if (mid % 2 == 0) {
                // same element is on the right
                if (nums[mid] == nums[mid + 1]) {
                    // move right
                    low = mid + 1;
                } else {
                    // move left
                    high = mid - 1;
                }
            }

            // mid is on the odd index
            else {
                // same element is on the right
                if (nums[mid] == nums[mid + 1]) {
                    // move LEFT
                    high = mid - 1;
                } else {
                    // move right
                    low = mid + 1;
                }

            }
        }

        return -1;

    }
}
