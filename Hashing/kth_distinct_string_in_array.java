package Hashing;
import java.util.HashMap;

/*
 * LeetCode 2053. Kth Distinct String in an Array
 * Link: https://leetcode.com/problems/kth-distinct-string-in-an-array/
 * TC - O(n)
 * SC - O(n)
 * 
 * Approach:
 * 1. Create a hashmap to store the frequency of each string in the array.
 * 2. Traverse the array and check if the frequency of the string is 1.
 * 3. If the frequency is 1, increment the count.
 * 4. If the count is equal to k, return the string.
 */

public class kth_distinct_string_in_array {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        String ans = "";
        int count = 0;

        for (String str : arr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int val = map.get(arr[i]);
                if (val == 1) {
                    count++;
                    if (count == k) {
                        ans = arr[i];
                    }
                }
            }
        }
        return ans;
    }
}
