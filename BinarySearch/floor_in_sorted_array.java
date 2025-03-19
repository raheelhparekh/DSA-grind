package BinarySearch;

/*
Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 5
Output: 1
Explanation: Largest number less than or equal to 5 is 2, whose index is 1.

Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 11
Output: 4
Explanation: Largest Number less than or equal to 11 is 10, whose indices are 3 and 4. The index of last occurrence is 4.

*/

public class floor_in_sorted_array {
    static int findFloor(int[] arr, int x) {
        // write code here
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(arr[mid]<=x){
                ans=mid;
                low=mid+1;
                
            }
            else{
                high=mid-1;
            }
        }
            
        return ans;
    }
    
}
