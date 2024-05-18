package Strings;
/*
 * Leetcode 557 : Reverse Words in a String III
 * Leetcode: https://leetcode.com/problems/reverse-words-in-a-string-iii/
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * TC: O(n)
 * SC: O(n)
 */

public class reverse_words_in_string {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        return reverseEveryStringInArray(arr);
        
    }
    public static String reverseEveryStringInArray(String[] str){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<str.length; i++){
            result.append(new StringBuilder(str[i]).reverse());
            if(i != str.length-1){
                result.append(" ");
            }
        }
        return result.toString();
    }
}
