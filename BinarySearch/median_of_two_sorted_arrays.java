package BinarySearch;
/*
 * LeetCode Problem: 4. Median of Two Sorted Arrays
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 * 
 * TC= O(log(min(n1,n2)))
 * SC= O(1) most optimal soln using BINARY SEARCH SYMMETRY
 */

public class median_of_two_sorted_arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        if (n1 > n2) return findMedianSortedArrays(nums2, nums1); // bcoz i want my small size arr to be first
        int left = (n1 + n2 + 1) / 2;

        int low = 0;
        int high = n1;

        while (low <= high) {
            int mid1 = low + (high - low) / 2;
            int mid2 = left - mid1;

            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;

            if(mid1-1>=0) l1 = nums1[mid1 - 1];
            if(mid2-1>=0) l2 = nums2[mid2 - 1];
            if(mid1<n1) r1 = nums1[mid1];
            if(mid2<n2) r2 = nums2[mid2];

            if (l1 <= r2 && l2 <= r1) {
                if ((n1 + n2) % 2 == 0) {
                    double min =(double) Math.min(r1, r2);
                    double max =(double) Math.max(l1, l2);
                    double median = (double) (min + max) / 2.0;
                    return median;
                } else {
                    double max = Math.max(l1, l2);
                    return max;
                }

            } else if (l1 > r2) {
                // Move left
                high = mid1 - 1;
            } else {
                // Move Right
                low = mid1 + 1;
            }

        }
        return 0;
    }
}
