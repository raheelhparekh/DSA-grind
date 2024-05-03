package Math;
/*
 * LeetCode 326. Power of Three
 * Link: https://leetcode.com/problems/power-of-three/
 * SC: O(1)
 */

public class is_power_of_three {
    public boolean isPowerOfThree(int n) {
        if(n==1) return true;

        if(n%3!=0 || n==0){
            return false;
        }
        return isPowerOfThree(n/3);
    }
}
