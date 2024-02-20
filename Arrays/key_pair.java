package Arrays;
/*
 * GFG: https://practice.geeksforgeeks.org/problems/key-pair5616/1
 * Geek for Geeks: Key Pair
 * Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.
 * Example 1: Input: N = 6, X = 16
 * Arr[] = {1, 4, 45, 6, 10, 8}
 * Output: Yes
 * Explanation: Arr[3] + Arr[4] = 6 + 10 = 16 
 * TC: O(n)
 * SC: O(n)
 * Approach: Use HashSet to store the elements and check if the difference of the element and x is present in the set.
 * 
 */

import java.util.HashSet;

public class key_pair {
     boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(x-arr[i])){
                return true;
            }
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        
            
            
        }
        return false;
    }

    
}
