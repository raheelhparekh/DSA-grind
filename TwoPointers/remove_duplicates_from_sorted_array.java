package TwoPointers;
/*
 * Leetcode 26. Remove Duplicates from Sorted Array
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * TC: O(N)
 * SC: O(1)
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2]
 * 
 */

public class remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        int j=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
