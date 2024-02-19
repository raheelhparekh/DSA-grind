package Arrays;
/*
 * GFG: https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
 * Geek for Geeks: Count pairs with given sum
 * Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
 * example:
 * Input: N = 4, K = 6
 * arr[] = {1, 5, 7, 1}
 * Output: 2
 * Explanation: arr[0] + arr[1] = 1 + 5 = 6 and arr[1] + arr[3] = 5 + 1 = 6.
 * 
 * TC: O(n)
 * SC: O(n)
 */

import java.util.HashMap;

public class count_pair {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        
        
        
        for(int i=0;i<n;i++){
            if(map.containsKey(k-arr[i])){
                count+=map.get(k-arr[i]);
            }
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        
        return count;
    }
    
}
