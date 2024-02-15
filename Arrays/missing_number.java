package Arrays;
/*
 * Geeks for Geeks: Missing number in array
 * Link: https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&difficulty=Easy&sortBy=submissions
 * Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

    Example 1:

    Input:
    N = 5
    A[] = {1,2,3,5}
    Output: 4

    Logic: We know sum till n natural number is n * (n+1)/2. We can calculate the sum of the array and subtract it from the sum of n natural numbers to get the missing number.

 */
public class missing_number {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int sum=n*(n+1)/2;
        int count=0;
        
        for(int i=0;i<n-1;i++){
             count=count+array[i];
        }
        return sum-count;
        
    }
    
}
