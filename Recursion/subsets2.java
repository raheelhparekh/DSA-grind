package Recursion;
/*
 * LeetCode 90. Subsets II
 * Link: https://leetcode.com/problems/subsets-ii/
 * TC : O(2^N * N)
 * SC : O(2^N * K) where K is the average length of the subset
 * 
 * Array Recursion: 2nd strategy looping i=index-->n-1
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        function(0, new ArrayList<>(), ans, nums);
        return ans;

    }

    public void function(int index,List<Integer> ds,List<List<Integer>> ans,int arr[]){

        ans.add(new ArrayList<>(ds));
        
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]) continue; // skip duplicates

            ds.add(arr[i]);
            function(i+1,ds,ans,arr);

            ds.remove(ds.size()-1);
        }
    }
}
