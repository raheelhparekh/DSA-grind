package Recursion;

import java.util.ArrayList;
import java.util.List;
/*
 * Leetcode 78. Subsets
 * Link : https://leetcode.com/problems/subsets/
 * TC : O(2^N)
 * SC : O(N)
 * 
 * Approach: Recursion
 * {MEDIUM}
 * At each stage, we have two choices, either to include the element or not include the element.
 * We keep track of the elements included in the ans list and keep adding it to the result list.
 */

public class subsets {
     public List<List<Integer>> subset(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        helper(nums,0,ans,res);
        return res;
    }
    public void helper(int nums[],int index,List<Integer> ans,List<List<Integer>> res){

        if(index==nums.length){
            res.add(new ArrayList<>(ans));
            return ;
        }
        List<Integer> include=new ArrayList<>(ans);
        include.add(nums[index]);
        
        helper(nums,index+1,include,res);
        helper(nums,index+1,ans,res);
    }
}
