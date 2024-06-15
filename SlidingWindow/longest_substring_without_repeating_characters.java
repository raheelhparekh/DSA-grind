package SlidingWindow;

import java.util.HashSet;
/*
 * LeetCode: 3. Longest Substring Without Repeating Characters
 * Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * TC: O(n)
 * SC: O(n)
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * 
 * 
 * Approach: Sliding Window : Striver's approach
 * 1. Take two pointers left and right and a hashset to store the characters.
 * 2. Iterate right pointer from 0 to n-1.
 * 3. If the character at right pointer is already present in the hashset, then remove the character at left pointer and increment left pointer.
 * 4. Add the character at right pointer to the hashset.
 * 5. Update the maxLen with the maximum of maxLen and right-left+1.
 * 6. Return the maxLen.
 * 
 */

public class longest_substring_without_repeating_characters {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int maxLen=0;
        
        HashSet<Character> set=new HashSet<>();

        for(right=0;right<s.length();right++){
            if(set.contains(s.charAt(right))){
                while(left<right && set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            set.add(s.charAt(right));
            maxLen=Math.max(maxLen,right-left+1);    
        }
        return maxLen;
    }
}
