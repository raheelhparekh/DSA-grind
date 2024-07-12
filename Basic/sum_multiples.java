package Basic;
/*
 * Leet 2652 : Sum of multiples
 * Link : https://leetcode.com/problems/sum-of-multiples/
 * TC : O(n)
 * SC : O(1)
 */

public class sum_multiples {
    public int sumOfMultiples(int n) {
        int sum=0;

        for(int i=1;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0){
                sum+=i;
            }
        }
        return sum;
    }
}
