package Hashing;
/*
 * LeetCode Prob No. 41 : First Missing Positive (HARD)
 * Link: https://leetcode.com/problems/first-missing-positive/
 * TC : 0(N)
 * SC : 0(N)
 * Approach: 1) Create a hashtable to store presence of each positive integer
 *           2) check if the number is positive and store it in the hashmap
 *           3) Find the smallest positive integer missing from the array by checking the presence of each positive integer initially
 *          keep the missing as 1 and check if the missing is present in the hashmap if yes then increment the missing by 1
 *
 * 
 */

import java.util.HashMap;
public class first_missing_positive {
      public int firstMissingPositive(int[] nums) {
         HashMap<Integer, Boolean> numMap = new HashMap<>();

        // Step 1: Create a hashtable to store presence of each positive integer
        for (int num : nums) {
            if (num > 0) {
                numMap.put(num, true);
            }
        }

        // Step 2: Find the smallest positive integer missing from the array
        int missing = 1;
        while (numMap.containsKey(missing)) {
            missing++;
        }

        return missing;
    }

    
}
