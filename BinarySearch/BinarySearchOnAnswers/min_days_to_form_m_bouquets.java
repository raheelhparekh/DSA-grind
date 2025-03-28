package BinarySearch.BinarySearchOnAnswers;

/*
 * LeetCode : 1482. Minimum Number of Days to Make m Bouquets
 * Link: https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
 * TC = O( N * Log2(max-min+1))
 * 
 * BS On ANSWERS. U know the range (min-max)
 */

public class min_days_to_form_m_bouquets {
    public int minDays(int[] bloomDay, int m, int k) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < bloomDay.length; i++) {
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }

        // finding min & max to define the range for BINARY SEARCH [min-max]
        int low = min;
        int high = max;

        // edge case. if highest value is only not able to get us the answer
        // means return -1 directly
        if(!(possibleToFormBouquets(bloomDay, high, m, k))){
            return -1;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possibleToFormBouquets(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;

    }

    public boolean possibleToFormBouquets(int[] bloomDay, int day, int m, int k) {
        int count = 0;
        int bouquets = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                // already bloomed flowers therefore just increase count
                count++;
            } else {
                // if bloom is not possible
                bouquets += count / k;
                count = 0; // count back to 0 , bcoz of adjacent flowers reqd
            }
        }
        bouquets += count / k;

        if (bouquets >= m) {
            return true;
        } else {
            return false;
        }

    }
}
