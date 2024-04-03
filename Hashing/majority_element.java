package Hashing;
import java.util.HashMap;
import java.util.Map;
/*
 * LeetCode Problem 169 : Majority Element
 * Link : https://leetcode.com/problems/majority-element/
 * TC : O(n)
 * SC : O(n)
 */

public class majority_element {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        n = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }
        
        return 0;
    }
}
