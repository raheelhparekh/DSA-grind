package Arrays;
/*
 * GFG: https://practice.geeksforgeeks.org/problems/transition-point3014/1
 * Geek for Geeks: Transition Point
 * Given a sorted array containing only 0s and 1s, find the transition point.
 * Example 1: Input: N = 5, arr[] = {0,0,0,1,1}
 * Output: 3
 * Explanation: The transition point is at position 3.
 * 
 * TC: O(log(n))- Binary search
 * SC: O(1)
 * 
 * Test cases:  All 1s - return 0 or all 0s return -1
 *              First element is 1 return 0
 */

public class transition_point {
    int transitionPoint(int arr[], int n) {
        if(arr[0]==0 && arr[arr.length-1]==0) return -1;
        if(arr[0]==1 && arr[arr.length-1]==1) return 0;
        if(arr[0]==1) return 0;
        // code here
        
        int low=0;
        int high=arr.length-1;
        
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==1 && arr[mid-1]==0){
                return mid;
                
            }
            else if(arr[mid]==1 && arr[mid-1]==1){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return -1;
    }
    
}
