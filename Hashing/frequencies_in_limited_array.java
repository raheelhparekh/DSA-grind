package Hashing;
/*
 * GFG: https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0
 * TC: O(N)
 * SC: O(N)
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class frequencies_in_limited_array {
    public List<Integer> frequencyCount(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(int i=1;i<=arr.length;i++){
            int x=map.getOrDefault(i,0);
            ans.add(x);
        }
        
        return ans;
    }
}
