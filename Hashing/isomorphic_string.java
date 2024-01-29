package Hashing;

/*
 * Leetcode Problem 205 : Isomorphic Strings
 * Description: https://leetcode.com/problems/isomorphic-strings/
 * Time Complexity: O(n) because we are iterating through the string
 * Space Complexity: O(n) because we are using two hashmaps to store the characters of the string s and t 
 * space complexity can be reduced to O(1) if we use an array of size 256 to store the characters of the string s and t because there are only 256 characters in ASCII 
 */

import java.util.HashMap;

class isomorphic_string {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> sMap=new HashMap<>();
        HashMap<Character,Character> tMap=new HashMap<>();

        for(int i=0;i<s.length();i++){

            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar,tChar);
            }
            else{
                if(sMap.get(sChar)!=tChar){
                    return false;
                }
            }
             if(!tMap.containsKey(tChar)){
                tMap.put(tChar,sChar);
            }
            else{
                if(tMap.get(tChar)!=sChar){
                    return false;
                }
            }

        }
        return true;
        
    }
}