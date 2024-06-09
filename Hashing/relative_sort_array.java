package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
 * LeetCode: 1122. Relative Sort Array
 * Link: https://leetcode.com/problems/relative-sort-array/
 * TC: O(nlogn)
 * SC: O(n)
 * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * Output: [2,2,2,1,4,3,3,9,6,7,19]
 * Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
 * 
 * Approach:
 * 1. Create a map to store the element and their occurences.
 * 2. Traverse the arr2 and get the occurences of the element from map and add it to the ans array.
 * 3. Remove the element from map.
 * 4. Traverse the remaining elements in map and add it to the ans array.
 * 5. Sort the only remaining elements in ans array by using range from index to ans.length.
 */

public class relative_sort_array {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        int index = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        // mapping element and thier occurences
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr2) {
            int valcount = map.get(num);
            while (valcount != 0) {
                ans[index++] = num;
                valcount--;
            }
            map.remove(num);
        }

        // remaining elements not in arr2 we need to sort in asc order
        int remainingIndex = index;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            while (value != 0) {
                ans[remainingIndex++] = key;
                value--;
            }
        }

        // sorting only remaining elements from range given 
        Arrays.sort(ans, index, ans.length);

        return ans;
    }
}
