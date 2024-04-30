package Strings;
/*
 * LeetCode 125. Valid Palindrome https://leetcode.com/problems/valid-palindrome/
 * TC=O(n) and SC=O(1)
    * Approach: Two pointer approach
    * 1. Initialize two pointers, one at the start and one at the end of the string
    * 2. Check if the character at the start and end are alphanumeric
    * 3. If not, increment the start pointer or decrement the end pointer
    * 4. If both are alphanumeric, check if they are equal
    * 5. If not equal, return false
 */

public class valid_palindrome {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j) {

            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } else {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
        }

        return true;
        
    }
}
