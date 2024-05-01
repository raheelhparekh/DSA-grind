package Strings;
/*
 * Leetcode 2000. Reverse Prefix of Word
 * Link : https://leetcode.com/problems/reverse-prefix-of-word/
 * TC : O(N)
 * SC : O(N)
 */

public class reverse_prefix_of_word {
    public String reversePrefix(String word, char ch) {
        StringBuilder ans = new StringBuilder();
       int index = 0;
       for(int i=0;i<word.length();i++){
           if(word.charAt(i)==ch){
               index = i;
               break;
           }
       }

       if(index!=0){ //only if index of ch found in index
           for(int i=index;i>=0;i--){
               ans.append(word.charAt(i));
           }
           for(int i=index+1;i<word.length();i++){
               ans.append(word.charAt(i));
           }
       }
       return index==0?word:ans.toString(); //if no index found return word itself
   }
}
