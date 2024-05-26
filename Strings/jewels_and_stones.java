package Strings;
/*
 * LeetCode: 771. Jewels and Stones
 * Link: https://leetcode.com/problems/jewels-and-stones/
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the    stones you have are also jewels.

    Letters are case sensitive, so "a" is considered a different type of stone from "A".
    Input: J = "aA", S = "aAAbbbb"
    Output: 3
    Explanation: You have 3 stones that are jewels: 2 'a's and 1 'A'.
 * 
 * TC: O(n)
 * SC: O(1)
 * 
 */

public class jewels_and_stones {
    public int numJewelsInStones(String jewels, String stones) {
        int n = stones.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (jewels.indexOf(stones.charAt(i)) > -1)
                count++;
        }
        return count;
    }
    
}
