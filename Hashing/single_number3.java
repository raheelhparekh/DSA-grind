package Hashing;
import java.util.HashMap;
import java.util.Map;
/*
 * LeetCode: 260. Single Number III
 * Link: https://leetcode.com/problems/single-number-iii/
 * TC: O(N)
 * SC: O(N) --> BUT WE NEED TO DO IN O(1) SPACE, THEREFORE WE CAN USE BIT MANIPULATION TO SOLVE THIS PROBLEM
   INPUT: [1,2,1,3,2,5]
    OUTPUT: [3,5]
    EXPLANATION: 3 and 5 appear only once in the array
 */

public class single_number3 {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // COUNT THE NUMBER OF ELEMENTS THAT APPEAR EXACTLY ONCE
        int count = 0;
        for (int value : map.values()) {
            if (value == 1) {
                count++;
            }
        }

        // INITIALIZE RESULT ARRAY WITH THE COUNT OF UNIQUE ELEMENTS
        int[] res = new int[count];
        int index = 0;

        // ADD ELEMENTS WITH COUNT OF 1 TO THE RESULT ARRAY
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                res[index++] = entry.getKey();
            }
        }
        return res;
    }
}
