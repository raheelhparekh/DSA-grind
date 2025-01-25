package Recursion;

/*
 * LeetCode 46. Permutations
 * Link: https://leetcode.com/problems/permutations/
 * 
 * Approach 1: Using a data structure and a map strategy
 * Tc: O(n*n!)
 * Sc: O(n)+O(n)
 */

import java.util.ArrayList;
import java.util.List;

public class permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] map=new boolean[nums.length];
        function(new ArrayList<>(),map,ans,nums);
        return ans;
        
    }

    public void function(List<Integer> ds,boolean[] map,List<List<Integer>> ans,int arr[]){

        //base condition
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(map[i]==false){
                map[i]=true;
                ds.add(arr[i]);
                function(ds,map,ans,arr);

                ds.remove(ds.size()-1);
                map[i]=false;
            }
        }
    }
}
