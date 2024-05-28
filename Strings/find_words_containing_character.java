package Strings;
import java.util.ArrayList;
import java.util.List;
/*
    Leetcode Problem 2942 : Find Words Containing Character
    Link : https://leetcode.com/problems/find-words-containing-character/
    TC : O(n)
    SC : O(1)
    Input: words = ["hello","world","leetcode"], x = 'e'
    Output: [0,2]
    Explanation: The words "hello" and "leetcode" contain the letter 'e'.
 */

public class find_words_containing_character {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<words.length;i++){
            if (words[i].indexOf(x)!=-1){
                ans.add(i);
            }
        }
        return ans;
    }
}
