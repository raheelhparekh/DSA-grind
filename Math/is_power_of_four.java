package Math;
/*
 * LeetCode 342. Power of Four
 * Link: https://leetcode.com/problems/power-of-four/
 * SC: O(1)
 */

public class is_power_of_four {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;

        if(n%4!=0 || n==0){
            return false;
        }
        return isPowerOfFour(n/4);
    }  
}
