package Arrays;
/*
 * GeekForGeeks: Equilibrium point
 * Link: https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1
 * Input: Example 1:    arr[] = {1,3,5,2,2}
 * Output: 3
 * Explanation: The sum of the elements before 3 is 1 + 3 + 5 = 9 and the sum of elements after 3 is 2 + 2 = 4
 * TC: O(n)
 * SC: O(1)
 * Solved by me? --> Yes, but took help from GFG and comments
 */

public class equilibrium_point {
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long sum = 0;
        long leftsum =0;
        
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
        }
        
        for(int i =0;i<n;i++)
        {
            
            sum = sum - arr[i];
            
            
            if(leftsum == sum){
                return i+1;
            }
            
            leftsum = leftsum + arr[i];
            
        }
        
        
        return -1;
    }
    
}
