package Strings;
/*
 * LeetCode 2108 First Palindrome
 * Link:https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/
 * 
 * TC: O(n)
 * SC: O(1)
 */
public class first_palindrome {
   
        public String firstPalindrome(String[] words) {
    
            for(String str:words){
                int left=0;
                int right=str.length()-1;
                boolean flag=true;
                while(left<right){
                    if(str.charAt(left)==str.charAt(right)){
                        left++;
                        right--;
                    }
                    else{
                        flag=false;
                        break;
                    }
                }
    
                if(flag==true){
                    return str;
    
    
                }
            }
            return "";
    
    
            
        }
    
    
}
