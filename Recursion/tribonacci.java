package Recursion;
/*
 * LeetCode: 1137. N-th Tribonacci Number
 * https://leetcode.com/problems/n-th-tribonacci-number/
 * TC=O(n)
 * SC=O(1)
 * Approach: Using 3 variables a,b,c to store the last 3 values of the series
 *        1. If n=0 return 0
 *        2. If n=1 or n=2 return 1
 *        3. Start with a=0,b=1,c=1
 *        4. For i=3 to n, calculate d=a+b+c, a=b,b=c,c=d
 *        5. Return c
 */

public class tribonacci {
    public int n_tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1 || n == 2) {
            return 1;
        }
        int a=0;
        int b=1;
        int c=1;
        int d;
        for(int i=3;i<=n;i++){
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        return c;
    }
}