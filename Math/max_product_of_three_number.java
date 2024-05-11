package Math;

import java.util.Arrays;
/*
 *  Leetcode 628. Maximum Product of Three Numbers
 *  Link: https://leetcode.com/problems/maximum-product-of-three-numbers/
 *  TC: O(nlogn)
 *  SC: O(1)
    
 */

public class max_product_of_three_number {
    public int maximumProduct(int[] nums) {

        /*
        "case1" represents the product of the two smallest numbers (nums[0] and nums[1]) in the sorted array, multiplied by the largest number (nums[nums.length-1]). You may think why do I use the first two number. Just think, if there are negative numbers and if I multiply two negative numbers then the resultant will be positive.
        "case2" represents the product of the three largest numbers in the sorted array (nums[nums.length-1], nums[nums.length-2], and nums[nums.length-3]).
        */

        Arrays.sort(nums);
        int case1 = nums[0]*nums[1]*nums[nums.length-1];
        int case2 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

        int maxProduct = Integer.max(case1, case2);
        return maxProduct;
    }
}
