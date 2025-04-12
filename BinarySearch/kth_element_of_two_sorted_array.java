package BinarySearch;

/*
 * Given two sorted arrays a and b of size m and n respectively. Find the kth element of the final sorted array.
 * Link : https://takeuforward.org/plus/dsa/problems/kth-element-of-2-sorted-arrays
 * TC = O(log(min(m,n)))
 * SC = O(1)
 * Input: a = [2, 3, 6, 7, 9], b = [1, 4, 8, 10], k = 5

    Output: 6

    Explanation: The final sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.
 */

public class kth_element_of_two_sorted_array {
    public int kthElement(int[] a, int[] b, int k) {

        int n1 = a.length;
        int n2 = b.length;

        if (n1 > n2)
            return kthElement(b, a, k);

        int low = Math.max(0, k - n2);
        int high = Math.min(k, n1); // NOTE THE CHANGE
        int n = n1 + n2;
        int left = k;

        while (low <= high) {
            int mid1 = low + (high - low) / 2;
            int mid2 = left - mid1;

            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;

            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;

            if (mid1 - 1 >= 0)
                l1 = a[mid1 - 1];
            if (mid2 - 1 >= 0)
                l2 = b[mid2 - 1];
            if (mid1 < n1)
                r1 = a[mid1];
            if (mid2 < n2)
                r2 = b[mid2];

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            } else if (l1 > r2) {
                // move left
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }
        return 0;
    }
}
