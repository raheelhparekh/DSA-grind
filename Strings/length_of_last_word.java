package Strings;
/*
 * LeetCode 58. Length of Last Word
 * Link: https://leetcode.com/problems/length-of-last-word/
 * TC: O(N)
 * SC: O(1)
 */

public class length_of_last_word {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int val=s.lastIndexOf(" ");
        return s.length()-val-1;
        
    }
}
