package Math;
/*
 * LeetCode Prob 1281: Subtract the Product and Sum of Digits of an Integer
 * Link: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 * TC: O(n)
 * SC: O(1)
 * Input: n = 234
 * Output: 15
 * Explanation:
 * Product = 2 * 3 * 4 = 24
 * Sum = 2 + 3 + 4 = 9
 * Result = 24 - 9 = 15
 */

public class product_minus_sum {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int rem=0;
        int prod=1;

        while(n>0){
            rem=n%10;
            n=n/10;
            sum=sum+rem;
            prod=prod*rem;
        }
        return prod-sum;
    }
}
