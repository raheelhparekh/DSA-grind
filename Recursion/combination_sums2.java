package Recursion;

/*
 * LeetCode: 40. Combination Sum II
 * Link: https://leetcode.com/problems/combination-sum-ii/
 * TC: O(2^N * K) where N is the length of the input array and K is the average length of the answer.
 * SC: O(K * n) where K is the average length of the answer and n is the length of the input array.
 * 
 * Array Recursion: Pattern strategy pick or not pick
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination_sums2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);

        function(0,target,new ArrayList<>(),candidates,ans);
        return ans;
    }

    public void function(int index,int target,List<Integer> ds, int[] arr,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index;i<arr.length;i++){
            if(target<arr[i]) break;
            if(i>index && arr[i]==arr[i-1]) continue; // skip duplicates

            ds.add(arr[i]);
            function(i+1,target-arr[i],ds,arr,ans);
            ds.remove(ds.size()-1);
        }
    }  
}
