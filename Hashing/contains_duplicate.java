package Hashing;
/*
 * Leetcode 217: https://leetcode.com/problems/contains-duplicate/
 * Tc: O(N) where N is the length of the array
 * SC: O(N) where N is the length of the hashset
 * 
 */

import java.util.HashSet;

public class contains_duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();


        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                return true;
            }
        }
        return false;
        
    }
}
