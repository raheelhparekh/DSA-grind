package Sorting;
/*
 * Leetcode: 88. Merge Sorted Array : https://leetcode.com/problems/merge-sorted-array/description/
 * TC: O(m+n)
 * SC: O(1) 
 */

public class merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0)
            return;
        int i = m + n - 1; // i at nums1 m+n th index
        int ptr1 = m - 1; // ptr1 at nums1 m th index
        int ptr2 = n - 1; // ptr2 at nums2 last index

        while (ptr1 >= 0 && ptr2 >= 0) {
            if (nums1[ptr1] > nums2[ptr2]) {
                nums1[i] = nums1[ptr1];
                ptr1--;
                i--;
            } else {
                nums1[i] = nums2[ptr2];
                ptr2--;
                i--;

            }

        }
        while(ptr2>=0){
            nums1[i]=nums2[ptr2];
            ptr2--;
            i--;

        }

    }
    
}
