package Math;
/*
 * LeetCode 633. Sum of Square Numbers
 * Link: https://leetcode.com/problems/sum-of-square-numbers/
 * TC: O(sqrt(c))
 * SC: O(1)
 * {Medium}--> TEST CASES TO CONSIDER, cannot solve using recursion
 * Approach : Two pointer approach, left=0, right=sqrt(c), if left^2+right^2==c, return true, else if left^2+right^2<c, increment left, else decrement right
 */

public class sum_of_square_numbers {
    public boolean judgeSquareSum(int c) {
        long left=0;
        long right=(long)Math.sqrt(c);

        while(left<=right){
            if(left*left+right*right==c){
                return true;
            }
            else if(left*left+right*right<c){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
        
    }
}
