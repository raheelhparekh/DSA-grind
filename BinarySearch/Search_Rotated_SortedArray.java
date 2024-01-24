package BinarySearch;
/*
    LeetCode: 33. Search in Rotated Sorted Array
    Link: https://leetcode.com/problems/search-in-rotated-sorted-array/
    Idea: Binary Search
    Time Complexity: O(log(n))
    Space Complexity: O(1)
    Approach: 
        1. Find the mid element and check if it is equal to the target element. If yes, return the index of the mid element.
        2. If not, check if the left side of the array is sorted or not. If yes, check if the target element lies in the range of the left side of the array. If yes, then update the high pointer to mid-1. If not, update the low pointer to mid+1.
        3. If the left side of the array is not sorted, then the right side of the array must be sorted. Check if the target element lies in the range of the right side of the array. If yes, then update the low pointer to mid+1. If not, update the high pointer to mid-1.
        4. Repeat the above steps until low<=high.
        5. If the target element is not found, return -1.

    1st binary search to check which part of array is sorted and then checking for target element in that part.

 */




class Search_Rotated_SortedArray {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == nums[mid]) {
                return mid;
            } else {

                if (nums[low] <= nums[mid]) {
                    // left side is sorted
                    if (target < nums[mid] && target >= nums[low]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                } else {
                    if (target > nums[mid] && target <= nums[high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }
        }
        return -1;
    }
}