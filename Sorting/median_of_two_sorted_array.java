package Sorting;
/*
 * Leetcode Problem: 4 Median of Two Sorted Arrays
 * Link: https://leetcode.com/problems/median-of-two-sorted-arrays/
 * TC: O(n+m)
 * SC: O(n+m)
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2
 * 
 */

public class median_of_two_sorted_array {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int res[] = new int[n + m];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                res[index] = nums1[i];
                i++;
            } else {
                res[index] = nums2[j];
                j++;
            }
            index++;

        }

        while (i < n) {
            res[index] = nums1[i];
            i++;
            index++;
        }
        while (j < m) {
            res[index] = nums2[j];
            j++;
            index++;
        }
        int total = res.length;
        // no of elements in res array is odd that means return the middle element
        if (total % 2 == 1) {
            return (double) res[total / 2];

        }
        // no of elements in res array is odd that means return the middle element
        else {
            return (double) (res[(total / 2)] + res[(total / 2) - 1]) / 2;

        }

    }
}
