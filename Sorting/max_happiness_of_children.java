package Sorting;

import java.util.Arrays;
/*
 * LeetCode 2487 : Maximum Happiness of Children
 * Link: https://leetcode.com/problems/maximum-happiness-of-children/
 * TC : O(NlogN)
 * SC : O(1)
 * MEDIUM
 * 
 * Approach
 * First sorted the array
 * started from last element till n-k element
 * subtracted j as we move forward and added to sum and if the value is negative we made it 0
 * 
 */

public class max_happiness_of_children {
    public long maximumHappinessSum(int[] happiness, int k) {

        // 1 12 45
       Arrays.sort(happiness);
        long sum=0;
        int n = happiness.length, j = 0;

        for(int i=n-1;i>=n-k;i--){
            happiness[i]=happiness[i]-j++; // 45-0, 12-1, 1-2 and since 1-2 is negative we make it 0
            if(happiness[i]<0){
                happiness[i]=0;
            }
            sum+=happiness[i];
        }
    return sum;
    }
}
