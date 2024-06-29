package Strings;
/*
 * LeetCode 1768. Merge Strings Alternately
 * Link: https://leetcode.com/problems/merge-strings-alternately/
 * TC: O(N)
 * SC: O(1)
 * Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
 */

public class merged_string_alternately {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        String merged="";

        while(i<word1.length() && j<word2.length()){
            merged+=word1.charAt(i++);
            merged+=word2.charAt(j++);
        }

        while(i<word1.length()){
            merged+=word1.charAt(i++);
        }
        while(j<word2.length()){
            merged+=word2.charAt(j++);
        }

        return merged;  
    }
}
