package Strings;
/*
 * LeetCode: 151. Reverse Words in a String
 * Link: https://leetcode.com/problems/reverse-words-in-a-string/
 * TC: O(n)
 * SC: O(n)
 
    INPUT: "the sky is blue"
    OUTPUT: "blue is sky the"
 
    Input: s = "a good   example"
    Output: "example good a"
    Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
  
 */

public class reverse_words_in_a_string {
    public String reverseWords(String s) {
        //  \\s+ denotes more spaces 
        // therefore we split the string if we encounter one or more spaces
        String arr[]=s.split("\\s+");
        String ans="";
       
        for(int i=arr.length-1;i>=0;i--){
            ans+=arr[i]+" ";
        }
        return ans.trim();
    }
}
