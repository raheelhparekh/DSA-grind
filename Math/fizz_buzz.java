package Math;

import java.util.ArrayList;
import java.util.List;
/*
 * Leetcode Problem: 412 Fizz Buzz {EASY}
 * Link: https://leetcode.com/problems/fizz-buzz/
 * TC: O(n)
 * SC: O(1)
 * Input: 15
 * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 * Explanation: Print numbers from 1 to n.
 *  If number is divisible by 3, print Fizz. 
 * If number is divisible by 5, print Buzz. 
 * If number is divisible by 3 and 5, print FizzBuzz
 */

public class fizz_buzz {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else {
                ans.add(String.valueOf(i));
            }
        }
                         
        return ans;         
        
    }
}
