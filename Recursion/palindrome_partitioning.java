package Recursion;
/*
 * Leet Prob 131: Palindrome Partitioning
 * Link: https://leetcode.com/problems/palindrome-partitioning/
 * 
 * try partitioning at all index and check if it is a palindrome or not. if palindrome then keep the recursion going
 */

import java.util.ArrayList;
import java.util.List;

public class palindrome_partitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        function(s, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void function(String s, int index, List<String> ds, List<List<String>> ans) {
        if (index == s.length()) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                ds.add(s.substring(index, i + 1));
                function(s, i+1, ds, ans);

                // backtrack
                ds.remove(ds.size() - 1);
            } else {
                continue;
            }
        }
    }

    public boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
