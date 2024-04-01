package Strings;
/*
 * LeetCode Problem 58 : Length of Last Word
 * Link : https://leetcode.com/problems/length-of-last-word/
 * TC : O(n)
 * SC : O(1)
 * 
 */

public class length_last_word {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int length=0;

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                length++;
            }
            else{
                break;
            }
        }
        return length;
        
    }
}
