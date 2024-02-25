package Hashing;
/*
 * GeekForGeeks: Count More than n/k Occurences
 * Link: https://practice.geeksforgeeks.org/problems/count-element-occurences/1
 * 
 * Input:
        N = 8
        arr[] = {3,1,2,2,1,2,3,3}
        K = 4
        Output: 2
        Explanation: In the given array, 3 and 2 are the only elements that appears more than n/k times.
        So, the count of elements is 2.
        
    TC: O(n)
    SC: O(n)
    Solved by me --> Yes 
    Approach: Used HashMap
 
 */

import java.util.HashMap;

public class count_greater_than_occurence {
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                int val=map.get(arr[i]);
                val+=1;
                map.put(arr[i],val);
                
            }
        }
         for (int key : map.keySet()) {
            if (map.get(key) > n / k) { 
                sum++;
            }
        }
        
        return sum;
    }
    
}
