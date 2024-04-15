package Math;
/*
 * Leetcode 507 : https://leetcode.com/problems/perfect-number/
 * Tc: O(N) where N is the number
 * SC: O(1)
 */

public class perfect_number {
    public boolean checkPerfectNumber(int num) {
        int count = 0;
        for(int i=1; i<=num/2; i++) {
            if(num%i == 0) {
                count += i;
            }
        }
        return num==count;
    }
}
