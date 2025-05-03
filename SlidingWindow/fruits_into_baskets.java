package SlidingWindow;
import java.util.HashMap;

/*
 * Leetcode 904. Fruit Into Baskets
 * Link: https://leetcode.com/problems/fruit-into-baskets/
 * TC   : O(n)
 * SC   : O(1)
 * 
 * Approach-> Sliding Window
 */

public class fruits_into_baskets {
    public int totalFruit(int[] fruits) {
    // your code goes here

    int left = 0;
    int right = 0;
    int length = 0;
    int maxLen = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    while (right < fruits.length) {

      if (!map.containsKey(fruits[right])) {
        map.put(fruits[right], 1);
      } else {
        int val = map.get(fruits[right]);
        map.put(fruits[right], val + 1);
      }

      if (map.size() <= 2) {
        length = right - left + 1;
        maxLen = Math.max(length, maxLen);

      } else {
        int val = map.get(fruits[left]);
        if (val <= 1) {
          map.remove(fruits[left]);
        } else {
          map.put(fruits[left], val - 1);
        }
        left++;
      }
      right++;
    }
    return maxLen;
  }
}