package Hashing;
/*
 * Leetcode Problem 525 : Contiguous Array
 * Description: https://leetcode.com/problems/contiguous-array/
 * Time Complexity: O(n) because we are iterating through the string
 * Space Complexity: O(n) because we are using a hashset to store the characters of the string. Suppose we have 3 1s we have to store 1 2 3 in hashmap therefore we can say O(n)
 * Runnnig Sum Approach 
 */

import java.util.HashMap;
public class contiguos_array {
    // Tc: O(n)
    //SC : O(n)
    public int findMaxLength(int[] nums) {

        if (nums.length == 0 || nums == null)
            return -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int rsum = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];

            if (val == 0) {
                rsum = rsum - 1;
            } else {
                rsum = rsum + 1;
            }
            if (!map.containsKey(rsum)) {
                map.put(rsum, i);
            } else {
                max = Math.max(max, i - (map.get(rsum)));

            }

        }
        return max;

    }
}
