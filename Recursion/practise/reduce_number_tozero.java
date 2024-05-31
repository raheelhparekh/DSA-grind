package Recursion.practise;
/*
 * Leetcode 1342. Number of Steps to Reduce a Number to Zero
 * Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */

public class reduce_number_tozero {
    public int numberOfSteps(int num) {
        int val=helper(num,0);
        return val;
        
    }

    public int helper(int num,int count){
        // base case : to return count when num ==0
        if(num==0){
            return count;
        }
        if(num%2==0){
            return helper(num/2,count+1);
        }
        else{
            return helper(num-1,count+1);
        }
    }
    
}
