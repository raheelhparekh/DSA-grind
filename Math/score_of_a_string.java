package Math;
/*
 * Leetcode 3110 : Score of a String
 * Link : https://leetcode.com/problems/score-of-a-string/
 * TC : O(n)
 * SC : O(1)
 * 
 *  Input: s = "hello"
    Output: 13
    Explanation:
    The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111. So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.
    
 */

public class score_of_a_string {
    public int scoreOfString(String s) {
        int val = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            char d = s.charAt(i + 1);
            val = val + Math.abs(c - d);
        }
        return val;
    }
}
