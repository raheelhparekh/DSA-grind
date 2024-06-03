package Strings;
/*
 * LeetCode 2486 Append Characters to Make String a Subsequence
 * Link: https://leetcode.com/discuss/interview-question/2486/Append-Characters-to-Make-String-a-Subsequence
 * TC: O(N)
 * SC: O(1)
    1) Input: s = "coaching", t = "coding"
    Output: 4
    Explanation: Append the characters "ding" to the end of s so that s = "coachingding".
Now, t is a subsequence of s ("coachingding").
It can be shown that appending any 3 characters to the end of s will never make t a subsequence.
    2) Input: s = "abcde", t = "a"
    Output: 0
    Explanation: t is already a subsequence of s ("abcde").
    3) Input: s = "z", t = "abcde"
    Output: 5
    Explanation: Append the characters "abcde" to the end of s so that s = "zabcde".
    Now, t is a subsequence of s ("zabcde").


    {MEDIUM}--> solved by referring to the solution
    We do not append characters.. we basically count no of characters in t string which do not match with s string.

 */

public class append_characters_to_string_make_subsequence {
    public int appendCharacters(String s, String t) {

        int s_index=0;
        int t_index=0;
        int s_length=s.length();
        int t_length=t.length();

        while(s_index<s_length && t_index<t_length){
            if(s.charAt(s_index)==t.charAt(t_index)){
                t_index++;
            }
            s_index++;
        }

        return t_length-t_index;
    }
}
