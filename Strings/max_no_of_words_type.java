package Strings;
/*
 *  LeetCode 1935 : Maximum number of words you can type
 *  Link: https://leetcode.com/problems/maximum-number-of-words-you-can-type/
 *  TC : O(n*m) where n is the number of broken words and m is the length of the word
 *  SC : O(n) used a string array to store the words
 *  Input : text = "hello world", brokenLetters = "ad"
 *  Output : 1 because only word "hello" can be typed since word "world" has 'd' in it whcih is broken
 * 
 *  Approach : String array me word ko split karke store kiya . uspe loop chalaya.
 *  broken word me loop chalaya and uska index nikala word me agar -1 nahi he to word me present he.
 *  using word.indexOf function.
 */

public class max_no_of_words_type {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int maxWords = 0;

        for (String word : words) {
            boolean canType = true;
            for (int i = 0; i < brokenLetters.length(); i++) {
                char c = brokenLetters.charAt(i);
                // we have directly checked ki broken letter ka character ka index -1 hona chhiye in the word.
                // agar nahi he matlab character is present at some index for sure
                //indexof use kiya to find index
                if (word.indexOf(c) != -1) {
                    canType = false;
                    break;
                }
            }
            if (canType) {
                maxWords++;
            }
        }

        return maxWords;
    }
}
