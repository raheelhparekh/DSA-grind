package Strings;
/*
 * LeetCode: 678. Valid Parenthesis String
 * Link: https://leetcode.com/problems/valid-parenthesis-string/
 * Tc: O(N) where N is the length of the string
 * SC: O(1)
 *   Input: s = "()"
 *   Output: true
 *   Explanation: The input string is valid since it contains an empty string "()" which is valid.
 *   Input: s = "(*)"
 *   Output: true
 *   Explanation: The input string is valid because it can be represented as "()" (two parentheses) or "(*)" (one star and one parenthesis).
 *   Input: s = "(*))"
 *   Output: true
 *   Explanation: The input string is valid because it can be represented as "(*))" or "((*)" or "(*))" where the '*' is a blank character.
 * 
 * Approach: When we encounter a '(' we increment left and right, when we encounter a ')' we decrement left and right, when we encounter a '*' we decrement left and increment right because '*' can be considered as '(' or ')' 
 * If right becomes negative, we return false because we have more ')' than '(' and '*' to balance it
 * If left becomes negative, we set left to 0 because we can't have more ')' than '('
 * Finally we return left == 0 because we should have equal number of '(' and ')' to balance the string
 */

public class valid_paranthesis_string {
    public boolean checkValidString(String s) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                left++;
                right++;

            } else if (ch == ')') {
                left--;
                right--;

            } else {
                left--;
                right++;

            }
            if (right < 0)
                return false;
            if (left < 0)
                left = 0;
        }
        return left == 0;
    }
}
