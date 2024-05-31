package TwoPointers;
/*
 * Leetcode 27. Remove Element
 * Link: https://leetcode.com/problems/remove-element/
 * TC: O(N)
 * SC: O(1)
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2]
 * 
 */

public class remove_elements {
    public int removeElement(int[] nums, int val) {
        int j=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;

            }
        }
        return j;
    }
}
