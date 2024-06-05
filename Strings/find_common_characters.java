package Strings;
import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 1002. Find Common Characters
 * Link: https://leetcode.com/problems/find-common-characters/
 * Input: words = ["bella","label","roller"]
 * Output: ["e","l","l"]
 * TC: O(n)
 * SC: O(1)
 * Referred soln --> not that easy to come up with this solution
 */

public class find_common_characters {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            int minCount = Integer.MAX_VALUE;
            for (String word : words) {
                int count = 0;

                for (char ch : word.toCharArray()) {
                    if (ch == c) {
                        count++;
                    }
                }

                minCount = Math.min(minCount, count);
            }

            for (int i = 0; i < minCount; i++) {
                list.add(String.valueOf(c));
            }
        }
        return list;

    }
}
