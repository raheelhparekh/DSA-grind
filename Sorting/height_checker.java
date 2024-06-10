package Sorting;

import java.util.Arrays;
/*
 * LeetCode: 1051. Height Checker
 * Link: https://leetcode.com/problems/height-checker/
 * Input: heights = [1,1,4,2,1,3]
 * Output: 3
 * Explanation: array should be 1,1,1,2,3,4. So 3 elements are not at their correct position.
 * 
 * Approach:1) Create a copy of the original array.
 * 2) Sort the original array.
 * 3) Compare the original array with the copy of the original array.
 * 4) If the elements are not equal, increment the count.
 * 5) Return the count.
 * 
 * TC: O(nlogn) --> not optimal
 * SC: O(n)
 */

public class height_checker {
    public int heightChecker(int[] heights) {
        int ans[]=new int[heights.length];
        ans=Arrays.copyOf(heights,heights.length);
        Arrays.sort(heights);
        int i=0;
        int count=0;

        while(i<heights.length){
            if(heights[i]!=ans[i]){
                count++;
            
            }
            i++;
        }
        return count;
    }
}
