package Math;
/*
 * Leetcode 231. Power of Two
 * link: https://leetcode.com/problems/power-of-two/
 * 
 */

public class is_power_of_two {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;

        if(n%2!=0 || n==0){
            return false;
        }

        return isPowerOfTwo(n/2);
}
}
