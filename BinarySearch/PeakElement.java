package BinarySearch;
/*
 * Leetcode 162. Find Peak Element
 * Description: https://leetcode.com/problems/find-peak-element/
 * 
 * Time complexity: O(logn)
 * Space complexity: O(1)
 * 
 * Mid element dhunda , agar left aur right se bada hua toh sidha return mid. isme agar mid==0 aur mid==nums.length-1 bhi check karna padega kyu ki agar mid==0 aur mid==nums.length-1 hoga toh mid-1 aur mid+1 index out of bound exception dega.
 * agar right element bada hua toh low=mid+1 
 * agar left bada hua toh high=mid-1
 */

class PeakElement {
    public int findPeakElement(int[] nums) {

        // test cases
        if (nums.length == 1) {
            return 0;
        }

        if (nums[0] >= nums[1]) {
            return 0;
        }

        if (nums[nums.length - 1] >= nums[nums.length - 2]) {
            return nums.length - 1;
        }

        int low = 1;
        int high = nums.length - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= nums[mid + 1] && nums[mid] >= nums[mid - 1]) {
                return mid;
            }

            else if (nums[mid + 1] >= nums[mid - 1]) {
                // move right
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
