package Arrays;
/*
 * GFG: https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1
 * Geek for Geeks: Rotate Array
 * Given an unsorted array arr[] of size N, rotate it by D elements (clockwise).
 * 
 * Example 1: 
 * Input: N = 5, D = 2
 * arr[] = {1,2,3,4,5}
 * Output: 3 4 5 1 2
 * 
 * Catch is We have to do it in 0(1) space and O(n) time.
 * 
 * Did not get the trick to solve this problem.
 * 
 * Approach: We can reverse the array in 3 steps:
 * We do d=d%n because if d>n then we can rotate the array by d%n times. CATCH
 * 1. Reverse the first d elements
 * 2. Reverse the next n-d elements
 * 3. Reverse the whole array
 * 
 */

public class rotate_array {
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        d=d%n;
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);
        
    }
    static void reverseArray(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    
}
