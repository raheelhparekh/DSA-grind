package TwoPointers;
/*
 * Leetcode 80. Remove Duplicates from Sorted Array II
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * 
 * TC: O(N)
 * SC: O(1)

 * Input: nums = [1,1,1,2,2,3]
 * Output: 5, nums = [1,1,2,2,3]
 * 
 */

public class remove_duplicates_from_sorted_array1 {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int occurance = 1;

        for(int i=1; i < nums.length; i++){
            if (nums[i] == nums[i-1]){
                occurance++;
            }else{
                occurance = 1;
            }

            if (occurance <= 2){
                nums[index] = nums[i];
                index++;
            }
        }  

        return index;
    }
}

