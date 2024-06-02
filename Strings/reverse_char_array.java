package Strings;
/*
 * LeetCode: 344. Reverse String
 * Link: https://leetcode.com/problems/reverse-string/
 * TC: O(N)
 * SC: O(1)
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 */

public class reverse_char_array {
    public void reverseString(char[] s) {
        int k=s.length-1;

        for(int i=0;i<s.length/2;i++){
            char temp=s[i];
            s[i]=s[k];
            s[k]=temp;
            k--;
        }
       
    }
}
