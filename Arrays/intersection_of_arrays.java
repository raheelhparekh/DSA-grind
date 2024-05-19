package Arrays;

import java.util.HashSet;
/*
 *  Leetcode 349 : Intersection of Two Arrays
 *  Link: https://leetcode.com/problems/intersection-of-two-arrays/
 *  Input: nums1 = [1,2,2,1], nums2 = [2,2]
 *  Output: [2]
 *  TC: O(n)
 *  SC: O(n)  used hashset
 */

public class intersection_of_arrays {
     public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }
        for (int j : nums2) {
            if (set1.contains(j)) {
                set2.add(j);
            }
        }

        int res[] = new int[set2.size()];
        int index = 0;

        for (int i : set2) {
            res[index] = i;
            index++;
        }

        return res;

    }
}
