package Arrays;
import java.util.Arrays;

/*
 * LeetCode 1508. Range Sum of Sorted Subarray Sums
 * Link: https://leetcode.com/problems/range-sum-of-sorted-subarray-sums/
 * TC: O(n^2)
 * SC: O(n^2)
 * 
 * APPROACH:
 * Created a new array of n*(n+1)/2 size
   added sum of all sub arrays
   sort the new array
   run a loop from left to right and return the total
 */

public class range_sum_of_sorted_subarrays_sum {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int length=(n*(n+1))/2;
        int ans[]=new int[length];
        int index=0;
        int sum=0;
        int total=0;

        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                ans[index++]=sum;
            }
        }
        Arrays.sort(ans);
        final int mod = (int) 1e9 + 7;

        for(int i=left-1;i<right;i++){
            total=(total+ans[i])%mod;
        }
        return total;  
    }
}
