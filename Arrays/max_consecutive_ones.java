package Arrays;
/*
 * LeetCode: 485. Max Consecutive Ones
 * Link: https://leetcode.com/problems/max-consecutive-ones/
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 * TC: O(n)
 * SC: O(1)
 */

public class max_consecutive_ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;

        for(int num:nums){
            if(num==1){
                count++;
            }
            else{
                count=0;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}
