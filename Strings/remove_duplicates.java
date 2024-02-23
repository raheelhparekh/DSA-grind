package Strings;
/*
 * Geeks for Geeks: https://practice.geeksforgeeks.org/problems/remove-duplicates/0
 * Geek for Geeks: Remove Duplicates
 * Input: geekforgeeks
 * Output: geksfor
 * TC: O(n)
 *  SC: O(n)
 * Solved by you? --> Yes
 */

import java.util.HashSet;

public class remove_duplicates {
    String removeDuplicates(String str) {
        HashSet<Character> set=new HashSet<>();
        String ans="";
        
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                ans=ans+ch;
            }
            else{
                continue;
            }
        }
        return ans;

    }
    
}
