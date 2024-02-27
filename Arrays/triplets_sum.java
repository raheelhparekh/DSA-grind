package Arrays;
import java.util.Arrays;
/*
 * GeeksForGeeks : https://practice.geeksforgeeks.org/problems/triplets-with-sum-equal-to-0/1
 * Given an array A[] of N elements. The task is to complete the function find3Numbers() which finds triplets with sum equal to zero.
 * Example: Input: N = 5, A[] = {0, -1, 2, -3, 1}, Output: 1
 * Explanation: 0, -1 and 1 forms a triplet with sum equal to 0.
 * 
 * Tc: O(n^2) // nlogn + n2
 * SC: O(1)
 * Solved by me -> Yes but refered GFG for some part
 */

public class triplets_sum{
    public static boolean find3Numbers(int A[], int n, int X) {
        Arrays.sort(A); 
        for(int i=0;i<n-2;i++){ 
            int low=i+1;
            int high=n-1;
            while(low<high){
                int sum=A[i]+A[low]+A[high];
                if(sum==X){
                    return true;
                }
                else if(X>sum){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        
        return false;
    }

    
}
