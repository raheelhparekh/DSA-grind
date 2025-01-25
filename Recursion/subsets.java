package Recursion;

import java.util.ArrayList;
import java.util.List;
/*
 * Leetcode 78. Subsets
 * Link : https://leetcode.com/problems/subsets/
 * TC : O(2^N)
 * SC : O(N)
 * 
 * Basic Recursion: Pick/Do not pick strategy
 */

public class subsets {
    public List<List<Integer>> subset(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        function(0,new ArrayList<>(),ans,nums);
        return ans;
        
    }

    public void function(int index,List<Integer> ds, List<List<Integer>> ans, int[] arr){
        // base case
        if(index==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        // pick the element
        ds.add(arr[index]);
        function(index+1,ds,ans,arr);


        // do not pick the element
        ds.remove(ds.size()-1);
        function(index+1,ds,ans,arr);
    }
}
