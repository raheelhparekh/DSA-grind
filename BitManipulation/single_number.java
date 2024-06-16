package BitManipulation;
/*
 * LeetCode: Single Number
 * Link: https://leetcode.com/problems/single-number/
 * TC: O(n)
 * SC: O(1)
 * 
 * Concept: XOR of a number with itself is 0. So, if we XOR all elements of the array, we will be left with the single number.
 */

public class single_number {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
        
    }
}
