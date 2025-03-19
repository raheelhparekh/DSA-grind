package BinarySearch;

/*
 * LeetCode: 81. Search in Rotated Sorted Array II
 * Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
 */

public class search_in_rotated_sorted_array2 {
    public boolean search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return true;
            } 
            // THIS IS THING TO NOTE I THIS PROBLEM. 
            // EDGE CASE WHEN ARRAY IS [3,3,1,3,3,3] we dont know which half is sorted
            else if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }

            // left half is sorted
            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            // right half is sorted
            else {
                if (target >= nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
        }
        return false;

    }
}
