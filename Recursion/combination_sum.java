package Recursion;

import java.util.ArrayList;
import java.util.List;
/*
 * Leetcode: 39. Combination Sum
 * Link: https://leetcode.com/problems/combination-sum/
 * PICK OR DONT PICK STRATEGY RECURSION
 * TC=  O(2^N*K) where N is the length of the array and K is the average length of the list bcoz we can pick the same element multiple times
 * SC=  O(N) because using an extra arraylist to store the current combination
 * 
 */


public class combination_sum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        function(0,new ArrayList<>(),target,ans,candidates);
        return ans;
        
    }

    public void function(int index,List<Integer> ds,int target,List<List<Integer>> ans,int[] candidates){
        if(index==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        // pick the index
        if(target>=candidates[index]){
            ds.add(candidates[index]);
            function(index,ds,target-candidates[index],ans,candidates);
            ds.remove(ds.size()-1);
        }
        
        // dont pick the index
        function(index+1,ds,target,ans,candidates);
    }
}
