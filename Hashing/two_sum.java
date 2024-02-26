package Hashing;
/*
 * LeetCode: Two Sum
 * Link: https://leetcode.com/problems/two-sum/
 * TC: O(n)
 * SC: O(n)
 * Brute force method using two for loops will take O(n^2) time complexity , by using hashmaps we reduce the TC to 0(n)
 * Solved by me --> Yes
 */

import java.util.HashMap;

public class two_sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> set=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++ ){
            if(set.containsKey(target-nums[i])){
                result[0]=set.get(target-nums[i]);
                result[1]=i;
                return result;
                

            }
            else{
                set.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
    
}
