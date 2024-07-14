package Basic;
/*
 * Leet code 2894. Divisible and Non-divisible Sums Difference
 * Link: https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/
 * TC: O(n)
 * SC: O(1)
 */

public class divisble_and_nondivisble_sum_difference {
    public int differenceOfSums(int n, int m) {
        int num1=0;
        int num2=0;

        for(int i=1;i<=n;i++){
            if(i%m==0){
                num1+=i;
            }
            else{
                num2+=i;
            }
        }
        return num2-num1;
    }
}
