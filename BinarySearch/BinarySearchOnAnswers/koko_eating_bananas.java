package BinarySearch.BinarySearchOnAnswers;

/*
 * Leetcode: 875. Koko Eating Bananas
 * Link: https://leetcode.com/problems/koko-eating-bananas/
 * TC= 0(N)*log2(maxElement)
 * 
 * Binary search on answers. find out the range of the possible answers can be
 * then apply BS on that range.
 */
public class koko_eating_bananas {
    
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        int high = max;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = totalHours(piles, mid);

            if (count <= h) {
                // move left
                high = mid - 1;
            } else {
                // move right
                low = mid + 1;
            }
        }
        return low;
    }

    public int totalHours(int[] piles, int mid) {

        int count = 0;
        for (int i = 0; i < piles.length; i++) {

            if (piles[i] <= mid) {
                count += 1;
            } else {
                count += Math.ceil((double) piles[i] / (double) mid);
            }

        }
        return count;
    }
}
