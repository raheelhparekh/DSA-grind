package Strings;
/*
 *  LeetCode: 392. Is Subsequence
 *  Link: https://leetcode.com/problems/is-subsequence/
 *  Tc: O(N) where N is the length of the bigger string
 *  SC: O(1)
 *      Input: s = "abc", t = "ahbgdc"
 *      Output: true
 *      Explanation: s is a subsequence of t. 
 
 */

public class is_subsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int j=0;
        int i=0;
        while(j<t.length()){
            if(t.charAt(j)==s.charAt(i)){
                i++;
            }
            if(i==s.length()) return true;
            j++;
        }
        
        return false;
    }
}
