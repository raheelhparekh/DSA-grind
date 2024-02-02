package Hashing;

/*
 * Leetcode Problem 290 : Word Pattern
 * Description: https://leetcode.com/problems/word-pattern/
 * Time Complexity: O(n) because we are iterating through the string
 * Space Complexity: O(n) because we are using a hashmap to store the characters of the string.
 * Approach 1 Using two hashmaps
 * 
 */

import java.util.HashMap;
public class word_patterns {
    // Tricky Question
    public boolean wordPattern(String pattern, String s) {
        if (pattern == null || pattern.length() == 0)
            return false;

        HashMap<Character, String> smap = new HashMap<>();
        HashMap<String, Character> pmap = new HashMap<>();

        String[] strArray = s.split(" ");

        if (pattern.length() != strArray.length) {

            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {

            char c = pattern.charAt(i);
            String str = strArray[i];

            if (smap.containsKey(c)) {
                if (!smap.get(c).equals(str)) {
                    return false;
                }
            } else {
                smap.put(c, str);
            }
            if (pmap.containsKey(str)) {
                if (pmap.get(str) != c) {
                    return false;
                }

            } else {
                pmap.put(str, c);
            }

        }
        return true;

    }
}

/*
    Approach 2 : Using one hashmap and one hashset


 * class Solution {
    // Tricky Question 
    public boolean wordPattern(String pattern, String s) {
        if (pattern == null || pattern.length() == 0)
            return false;

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        String[] strArray = s.split(" ");

        if (pattern.length() != strArray.length) {

            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {

            char c = pattern.charAt(i);
            String str = strArray[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(str)) {
                    return false;
                }

            } 
            else {
                if(set.contains(str)){
                    return false;
                }
                else{
                    map.put(c,str);
                    set.add(str);
                }
            }

        }
        return true;

    }
}
 */
