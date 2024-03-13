package Math;
/*
 * LeetCode Prob No. 1991 : Find the Middle Index in Array
 * Link: https://leetcode.com/problems/find-the-middle-index-in-array/
 * Example : Input: nums = [2,3,-1,8,4]
            Output: 3
            Explanation:
            The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
            The sum of the numbers after index 3 is: 4 = 4
            Input: nums = [1,-1,4]
            Output: 2
            Explanation:
            The sum of the numbers before index 2 is: 1 + -1 = 0
            The sum of the numbers after index 2 is: 0
    TC : 0(N)
    SC : 0(1)
    Solved by me? --> Yes but referred to solution for the approach
 */

public class middle_index_array {
    class Solution {
        public int findMiddleIndex(int[] nums) {
            int left=0;
            int right=0;
            for(int i=0;i<nums.length;i++){
                left+=nums[i];
    
            }
            for(int i=0;i<nums.length;i++){
                left-=nums[i];
                if(right==left){
                    return i;
                }
                right+=nums[i];
    
            }
        return -1;
            
        }
    
    }
    
}
