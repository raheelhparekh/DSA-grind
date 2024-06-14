package Sorting;

import java.util.Arrays;
/*
 * LeetCode 945. Minimum Increment to Make Array Unique
 * Link: https://leetcode.com/problems/minimum-increment-to-make-array-unique/
 * TC: O(nlogn)
 * SC: O(1)
 * Input: nums = [1,2,2]
 * Output: 1
 * Explanation: After 1 move, the array could be [1, 2, 3].
 * 
 * Input: nums = [3,2,1,2,1,7]
 * Output: 6
 * Explanation: After 6 moves, the array could be [1, 2, 3, 4, 5, 7].
 */

public class minimum_increment_to_make_array_unique {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int c=0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>=nums[i]){
                c=nums[i]; // stored the current value of nums[i] here 
                nums[i]=nums[i-1]+1; // replaced the nums[i] value 
                count+=Math.abs(c-nums[i]); // count the difference
            }

        }
        return count;

    }
    /* 
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int cnt = 0;
        int i = 0;

        for (int num : nums) {
            i = Math.max(i, num); // storing the last max seen so to add 1 to it 
            cnt += i++ - num; // counting the difference 
        }
        return cnt;

    }
    */
    
}
