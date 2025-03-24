package BinarySearch;
/*
 * Leetcode Problem No 153 : Find Minimum in Rotated Sorted Array
 * Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 * Time Complexity: O(log(n))
 * Space Complexity: O(1)
 * Approach: Binary Search
 * 
 *  agar nums of low is less than nums of high, toh low is the minimum element bcoz means array is sorted
 * middle element ko we compare with its neighbours, if it is less than both, then it is the minimum element 
 * if not then we check if nums of low is less than nums of mid, toh we know that the left half is sorted, so we move to the right half with low = mid + 1
 * 
 */

class MinElement_RotatedSortedArray {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        if (nums[low] <= nums[high])
            return nums[low];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[low] <= nums[high]) {
                return nums[low];
            }

            if ((mid == 0 || nums[mid] < nums[mid - 1]) && (mid == nums.length - 1 || nums[mid] < nums[mid + 1])) {
                return nums[mid];
            } else if (nums[low] <= nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return 67585;

    }
}

// Pattern: find the sorted half and perform ur tasks accordingly

/*
 * public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int min = Integer.MAX_VALUE;
        if (nums[low] <= nums[high]) {
            return nums[low];
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[low] <= nums[high]) {
                min=Math.min(min,nums[low]);
                break;
            }
            // left side is sorted
            if (nums[low] <= nums[mid]) {
                min = Math.min(min, nums[low]);
                low = mid + 1;
            }
            // RIGHT SIDE IS SORTED
            else {
                min = Math.min(min, nums[mid]);
                high = mid - 1;
            }
        }
        return min;
    }
 */