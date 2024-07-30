package Basic;
import java.util.HashSet;

/*
 * LeetCode 2956. Find Common Elements Between Two Arrays
 * Link: https://leetcode.com/problems/find-common-elements-between-two-arrays/
 * TC: O(n)
 * SC: O(n)
 * 
 * Input: nums1 = [4,3,2,3,1], nums2 = [2,2,5,2,3,6]

    Output: [3,4]

    Explanation:

    The elements at indices 1, 2, and 3 in nums1 exist in nums2 as well. So answer1 is 3.

    The elements at indices 0, 1, 3, and 4 in nums2 exist in nums1. So answer2 is 4.
 */

public class find_common_elements_in_two_arrays {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int[] ans = new int[2];
        int count1 = 0, count2 = 0;
        for (int c : nums1)
            set1.add(c);
        for (int c : nums2) {
            set2.add(c);
            if (set1.contains(c))
                count2++;
        }
        for (int c : nums1) {
            if (set2.contains(c))
                count1++;
        }
        ans[0] = count1;
        ans[1] = count2;
        return ans;

    }
}
