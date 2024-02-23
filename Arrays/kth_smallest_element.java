package Arrays;
/*
 * GFG: https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
 * Geek for Geeks: Kth smallest element
 * Example 1:
 * Input:   arr = 7 10 4 3 20 15
 * k = 3
 * Output: 7
 * Explanation: 3rd smallest element in the given array is 7.
 * TC: O(nlogn)
 * SC: O(1)
 * Approach: We sort the array and return the k-1th element.
 */

import java.util.Arrays;
public class kth_smallest_element {
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        Arrays.sort(arr);
        return arr[k-1];
    } 
}
