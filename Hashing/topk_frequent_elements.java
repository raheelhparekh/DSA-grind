package Hashing;

import java.util.HashMap;
import java.util.Map;
/*
 * LeetCode 347. Top K Frequent Elements
 * Link: https://leetcode.com/problems/top-k-frequent-elements/
 * TC: O(n)
 * SC: O(n)
 * {MEDIUM}
 * Approach: used a hashmap to first store the frequency of each element, then iterated over the hashmap to find the element with the maximum frequency and added it to the answer array.
 * Removed the key with maximum frequency from the hashmap and repeated the process k times. 
 */

public class topk_frequent_elements {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();
        int ans[]=new int[k];
        int index=0;

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        while(k>0){
            int max=0;
            int key=0;
            int val=0;
            int number=0;
            for(Map.Entry<Integer,Integer> entry: map.entrySet()){
                key=entry.getKey();
                val=entry.getValue();

                if(val>max){
                    max=val;
                    number=key;
                }
            }
            ans[index++]=number;
            map.remove(number);
            k--;
        }
        return ans;
    }
}
