package Strings;
/*
 * LeetCode Problem 28 : Find the Index of the First Occurrence in a String
 * Link : https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 * TC : O(n)
 * SC : O(1)
 * 
 */

public class first_index_of_second_substring {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        } else {
            return -1;
        }
    }
       
}
