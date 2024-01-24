package BinarySearch;
/*
  Leetcode Problem No 34 : Find First and Last Position of Element in Sorted Array
  Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
  Time Complexity: O(log(n))
  Space Complexity: O(1)
  Approach: Binary Search
  We perform two binary searches, one for finding the leftmost index and one for finding the rightmost index. Jaise hi target milta hai, we check if the index is the leftmost or rightmost index. If not, we continue the binary search.

  
 
 */

class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return new int[] { -1, -1 };
        if(nums[0] == target && nums[nums.length-1] == target) return new int[] { 0, nums.length-1 };
        int left = BinarySearchLeft(nums, target);
        int right = BinarySearchRight(nums, target);
        return new int[] { left, right };
    }

    private int BinarySearchLeft(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                if (mid == 0 || nums[mid - 1] < nums[mid]) {
                    return mid;

                } else {
                    high = mid - 1;
                }
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    private int BinarySearchRight(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                if (mid == nums.length - 1 || nums[mid + 1] > nums[mid]) {
                    return mid;

                } else {
                    low = mid + 1;
                }
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

}

/*
 * More optimised Code
 
Test Cases
  1)agar array me sab element target ke equal he toh we can put this condition in the beginning of the function and return [0, nums.length-1]
  2)agar leftBinary search karne ke bad we get -1, toh we can return [-1,-1] since we know that the target is not present in the array
  3)agar leftBinary search karne ke bad we get the index, toh we can perform the rightBinary search from the left index we got, thus reducing the inputs to search

class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return new int[] { -1, -1 };
        if(nums[0]==target && nums[nums.length-1]==target){
            return new int[]{0,nums.length-1};
        }
        int left = BinarySearchLeft(nums, target);
        if(left==-1){
            return new int[]{-1,-1};
        }
        int right = BinarySearchRight(nums, target,left);
        return new int[] { left, right };
    }

    private int BinarySearchLeft(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                if (mid == 0 || nums[mid - 1] < nums[mid]) {
                    return mid;

                } else {
                    high = mid - 1;
                }
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    private int BinarySearchRight(int[] nums, int target,int low) {
        
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                if (mid == nums.length - 1 || nums[mid + 1] > nums[mid]) {
                    return mid;

                } else {
                    low = mid + 1;
                }
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

}
*/
