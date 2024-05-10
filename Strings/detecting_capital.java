package Strings;
/*
 * LeetCode 520 : Detect Capital
 * Link: https://leetcode.com/problems/detect-capital/
 * TC : O(N)
 * SC : O(1)
 * EASY
 */

public class detecting_capital {
    public boolean detectCapitalUse(String word) {
        
        int uc=0;
        int lc=0;

        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);

            if(Character.isUpperCase(ch)){
                uc++;
            }
            if(Character.isLowerCase(ch)){
                lc++;
            }
        }
        if(uc==1 && Character.isUpperCase(word.charAt(0))){
            return true;  
        }
        else if(lc==word.length() || uc==word.length()){
            return true;
        }
        else{
            return false;
        }
        
    }
}
