package Hashing;
/*
 * 
 * Leetcode 242 : https://leetcode.com/problems/valid-anagram/
 * Tc: O(N) where N is the length of the string
 * SC: O(N) where N is the length of the string
 */

import java.util.HashMap;

public class anagrams {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();

        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (!smap.containsKey(ch)) {
                    smap.put(ch, 1);
                } else {
                    int val = smap.get(ch);
                    val++;
                    smap.put(ch, val);
                }

            }
            for (int i = 0; i < t.length(); i++) {
                char ch = t.charAt(i);
                if (!tmap.containsKey(ch)) {
                    tmap.put(ch, 1);
                } else {
                    int val = tmap.get(ch);
                    val++;
                    tmap.put(ch, val);
                }

            }
        }

        return smap.equals(tmap);
    }
}
