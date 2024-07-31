package Strings;
/*
 * LeetCode: 1323. Maximum 69 Number
 * Link: https://leetcode.com/problems/maximum-69-number/
 * TC: O(n)
 * SC: O(n)
 * 
 * Input: num = 9669
    Output: 9969
    Explanation: 
    Changing the first digit results in 6669.
    Changing the second digit results in 9969.
    Changing the third digit results in 9699.
    Changing the fourth digit results in 9666.
    The maximum number is 9969.
 */

public class maximum_69_number {
    public int maximum69Number (int num) {
        StringBuilder s = new StringBuilder(Integer.toString(num));
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '6'){
                s.setCharAt(i,'9');
                break;
            }
        }
        return Integer.parseInt(s.toString());
    }
}
