package Strings;
/*
 * GeekForGeeks: https://practice.geeksforgeeks.org/problems/reverse-a-string/1
 * Tc: O(N) where N is the length of the string
 * SC: O(1)
 */

public class reverseString {
    public static String reverseWord(String str)
    
    {
        String ans="";
        // Reverse the string str
        
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            ans+=ch;
            
        }
        return ans;
    }
    
}
