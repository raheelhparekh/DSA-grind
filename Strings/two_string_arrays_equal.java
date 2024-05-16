package Strings;
/*
 * Leetcode 1662: Check if two string arrays are equivalent
 * Link: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
 * Tc: O(N) where N is the length of the string
 * SC: O(1)
 *  Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
    Output: true
    Explanation:
    word1 represents string "ab" + "c" -> "abc"
    word2 represents string "a" + "bc" -> "abc"
    The strings are the same, so return true.
 */

public class two_string_arrays_equal {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sb="";
        String ans="";
        for(String t:word1){
            sb+=t;
        }
        for(String s:word2){
            ans+=s;
        } 
        return sb.equals(ans);
        
    }
}
