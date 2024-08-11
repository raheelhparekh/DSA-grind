package Basic;
/*
 * LeetCode: 2778. Sum of Squares of Special Elements 
 * Link : https://leetcode.com/problems/sum-of-squares-of-special-elements/
 * TC: O(n)
 * SC: O(1)
 */

public class sum_of_square_of_special_elements {
    public int sumOfSquares(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i ++) {
            if (nums.length % (i + 1) == 0) {
                sum += nums[i] * nums[i];
            }
        }

        return sum;
    }
}
