package Hashing;
/*
 * Leetcode Problem 409 : Longest Palindrome
 * Description: https://leetcode.com/problems/longest-palindrome/
 * Time Complexity: O(n) because we are iterating through the string
 * Space Complexity: O(n) because we are using a hashset to store the characters of the string.
 * But it is O(1)because it is specified as lower case alphabets which is 26 that means at the worst case it would be just 26 characters which makes it to O(1)
 * Approach: We add the characters to the hashset and if the character is already present we remove it from the hashset and increment the maxLength by 2.
 */

import java.util.HashSet;
public class longest_palindrome {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return -1;
        HashSet<Character> set = new HashSet<>();

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                maxLength = maxLength + 2;
                set.remove(ch);
            } else {
                set.add(ch);

            }

        }
        if (!set.isEmpty()) {
            maxLength = maxLength + 1;
        }
        return maxLength;
    }
}



/*   Approach 2: using hashmap
    

    We add the characters as the key to the hashmap and maintain a count of that character as integer in the hashmap.
    Then we check if the count is even then we add the count to the maxLength.
    If the count is odd then we add count-1 to the maxLength and we also set a boolean hasOdd to true.
    If the hasOdd is true then we add 1 to the maxLength. hasOdd is true only when there is atleast one character with odd count.



 * class Solution {
    
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return -1;
        HashMap<Character, Integer> map = new HashMap<>();

        int count = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch,map.get(ch)+1); // this step to figure out i took 1 hour

            } else {
                map.put(ch, 1);

            }
        }
        boolean hasOdd = false;
        for (int val : map.values()) {

            if (val % 2 == 0) {
                maxLength = maxLength + val;

            } else {
                maxLength = maxLength + val - 1;
                hasOdd = true;

            }

        }
        if (hasOdd == true) {
            maxLength=maxLength + 1;
        }
        return maxLength;
    }
}
 */
