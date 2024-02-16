package DynamicProgramming;
/*
 * LeetCode: 198. House Robber
 * Link: https://leetcode.com/problems/house-robber/
 * Dynamic Programming
 */

public class house_robber {
        // TC=O(n) SC=0(n) 
        public int rob(int[] nums) {
            int[][] dp=new int[nums.length][2];
            dp[0][1]=nums[0];
            for(int i=1;i<nums.length;i++){
                dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]);  // do not rob a house
                dp[i][1]=dp[i-1][0]+nums[i]; // rob a house
    
            }
        return Math.max(dp[nums.length-1][0],dp[nums.length-1][1]);
    
    
    }
    
    
}
/*
 * To optimise this code space complexity we use  2 variable Skip and Take instead of 2D array
 * which will reduce the space complexity to O(1)
 *     class Solution {
    // TC=O(n) SC=0(1) just taking 2 variables 
    public int rob(int[] nums) {
        int skip=0, take=nums[0];
        for(int i=1;i<nums.length;i++){
            int tempSkip=skip;
            skip=Math.max(skip,take);
            take=tempSkip+nums[i];

        }
        return Math.max(skip,take);


    }
}
 * 
 *  
 */
