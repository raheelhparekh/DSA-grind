package Arrays;
/*
 * Geeks: Second largest
 * Link: https://practice.geeksforgeeks.org/problems/second-largest3737/1
 * TC=O(n) SC=O(1)
 */

public class second_largest {
    int print2largest(int arr[], int n) {
        // code here
        if(n==1) return -1;
        
        
        int prev=-1;
        int max=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                prev=max;
                max=arr[i];
            }
            else if(arr[i]>prev && arr[i]<max){
                prev=arr[i];
            }
            
        }
        
        return prev;
    }
    
    
}
