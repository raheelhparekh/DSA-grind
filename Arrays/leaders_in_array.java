package Arrays;
/*
 * Geeks: Leaders in an array
 * Link: https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
 * TC=O(n) SC=O(n)
 * Description: An element is leader if it is greater than all the elements to its right side.
 * And the rightmost element is always a leader.
 * Example:    Input: 16 17 4 3 5 2
 *             Output: 17 5 2
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Collections;

public class leaders_in_array {
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> list=new ArrayList<>(); 
        int max=arr[n-1];
        list.add(max);
        for(int i=n-2;i>=0;i--){
           if(arr[i]>=max){
                list.add(arr[i]);
                max=arr[i];
                
            }
            
            
        }
        Collections.reverse(list);
        
        return list ;
    }
}
