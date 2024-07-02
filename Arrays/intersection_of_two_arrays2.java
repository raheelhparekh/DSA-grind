package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Leetcode 350. Intersection of Two Arrays II
 * Link: https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * TC: O(n+m)
 * SC: O(n)
 * 
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * 
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 */

public class intersection_of_two_arrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();

        // add all nums1 element to hashmap
        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        // check for nums2 values whether they are in nums1 or not
        for(int j:nums2){
            if(map.containsKey(j)){   
                int val=map.get(j);
                
                if(val>0){
                    list.add(j);
                    val--; // if there are multiple with same value, decrease by 1 as it is found
                    map.put(j,val);
                }
            }
        }

        // storing answer to array bcoz we have to return an aray of answer
        int ans[]=new int[list.size()];
        int index=0;
        for(int i=0;i<list.size();i++){
            ans[index++]=list.get(i);
        }
        return ans;
        
    }
}
