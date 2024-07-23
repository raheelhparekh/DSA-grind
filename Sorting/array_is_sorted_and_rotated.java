package Sorting;
/*
 * Leetcode 1752. Check if Array Is Sorted and Rotated
 * Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
 * TC: O(N)
 * SC: O(1)
 * 
 * Observe a pattern where if there can only be one time when nums[i]>nums[i+1]
   if it occurs more than once means return false
   also to check that the if array is rotated means the element at the start should be bigger than last element

   Example 1:

    Input: nums = [3,4,5,1,2]
    Output: true
    Explanation: [1,2,3,4,5] is the original sorted array.
    You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
    Example 2:

    Input: nums = [2,1,3,4]
    Output: false
    Explanation: There is no sorted array once rotated that can make nums.
    Example 3:

    Input: nums = [1,2,3]
    Output: true
    Explanation: [1,2,3] is the original sorted array.
    You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
 */

public class array_is_sorted_and_rotated {
    public boolean check(int[] nums) { 
        int count=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>=nums[i]){
                count++;
            }
        }
        if(nums[0]<=nums[nums.length-1]){
            count++;
        }
        return count<=1;
    }
}
