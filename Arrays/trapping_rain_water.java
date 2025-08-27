package Arrays;
/*
 * Leetcode 42 : Trapping Rain Water
 * Link : https://leetcode.com/problems/trapping-rain-water/
 * TC : O(3n)
 * SC : O(2n) -> SUFFIX MAX AND PREFIX MAX ARRAY
 * 
 * Approach: Brute force
 * WATER WILL BE TRAPPED WHEN LEFT BUILDING IS HIGHER AND THE RIGHT BUILDING IS HIGHER.
 * height[i] < leftMax && height[i] < rightMax
 * 
 * THE HEIGHT OF THE WATER TRAPPED WOULD BE DECIDED BY THE MIN OF LEFT BUILDING AND RIGHT BUILDING - THE HEIGHT OF PRESENT BUILDING
 * total += (Math.min(leftMax, rightMax) - height[i])
 */

public class trapping_rain_water {
    public int trap(int[] height) {

        int total = 0;
        int prefixMax[] = new int[height.length];
        int suffixMax[] = new int[height.length];
        prefixMax[0] = height[0];
        suffixMax[height.length - 1] = height[height.length - 1];

        for (int i = 1; i < height.length; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], height[i]);

        }
        for (int i = height.length - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], height[i]);

        }

        for (int i = 0; i < height.length; i++) {
            int leftMax = prefixMax[i];
            int rightMax = suffixMax[i];
            if (height[i] < leftMax && height[i] < rightMax) {
                total += (Math.min(leftMax, rightMax) - height[i]);
            }
        }

        return total;

    }
}
