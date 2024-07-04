package Arrays;

import java.util.Arrays;
/*
 * LeetCode 2974 : Minimum Number Game
 * Link : https://leetcode.com/problems/minimum-number-game/
 * TC : O(nlogn)
 * SC : O(1)
 * Approach : Sort the array and swap the 2 adjacent elements
 */

public class minimum_number_game {
     public int[] numberGame(int[] nums) {
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i=i+2){
            int temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;

        }
        return nums;
        
    }
}
