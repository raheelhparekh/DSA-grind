package Hashing;
/*
 * Leetcode Problem 560 : Subarray Sum Equals K
 * Description: https://leetcode.com/problems/subarray-sum-equals-k/
 * Time Complexity: O(n) because we are iterating through the string
 * Space Complexity: O(n)
 * Approach: We use a hashmap to store the running sum and the count of the running sum.
 * We add 0,1 to the hashmap initially because if the running sum is equal to k then we have to increment the count by 1.
 * We iterate through the array and calculate the running sum.
 * If the hashmap contains the running sum - k then we increment the count by the value of the running sum - k in the hashmap.
 * We also add the running sum to the hashmap.
 * 
 */

import java.util.HashMap;
public class subarray_sum {
    
    //TC:0(n)
    //SC: O(n)
    
    public int subarraySum(int[] nums, int k) {

        if(nums.length==0 || nums==null) return 0;
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,1);
        int rsum=0,count=0;

        for(int i=0;i<nums.length;i++){
            rsum=rsum+nums[i];

            if(map.containsKey(rsum-k)){
                count=count+ map.get(rsum-k);
            }
            map.put(rsum,map.getOrDefault(rsum,0)+1);
                
                
            
        }return count;

}
}
