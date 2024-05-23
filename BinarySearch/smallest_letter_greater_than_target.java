package BinarySearch;
/*
 * Leetcode Problem: 744 Find Smallest Letter Greater Than Target {EASY}
 * Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 * TC: O(log n)
 * SC: O(1)
 * Input: letters = ["c", "f", "j"], target = "a"
 * Output: "c"
 * Explanation: Find the smallest letter in the array that is larger than the target.Given a list of sorted characters letters containing only lowercase letters, and given a target letter target, find the smallest element in the list that is larger than the given target.
 * 
 * Approach: Binary Search
 * 1. If target is greater than or equal to the last element of the array, return the first element of the array.
 * 2. Initialize start = 0 and end = letters.length.
 * 3. While start is less than or equal to end, calculate mid = start + (end - start)/2.
 * 4. If target is greater than or equal to letters[mid], update start = mid + 1.
 * 5. Else, update end = mid - 1.
 * 6. Return letters[start].
 */

public class smallest_letter_greater_than_target {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target>=letters[letters.length-1])
           return letters[0];
       int start = 0;
       int end = letters.length;
       while(start<=end){
           int mid = start + (end - start)/2;
           if(target >= letters[mid]) start = mid + 1;
           else end = mid - 1;
       }
       return letters[start];
   }
}
