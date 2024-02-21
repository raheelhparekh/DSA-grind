package Arrays;
/*
 * GFG: https://practice.geeksforgeeks.org/problems/first-repeating-element4018/1
 * Geek for Geeks: First Repeating Element
 * Given an array arr[] of size N. The task is to find the first repeating element in the array of integers, i.e., an element that occurs more than once and whose index of first occurrence is smallest.
 * Example 1: Input: N = 7, arr[] = {1, 5, 3, 4, 3, 5, 6}
 * Output: 2
 * Explanation: 5 is appearing twice and its first appearance is at index 2 which is less than 3 whose first occurring index is 3.
 * Problem solved by you? - YES
 * TC: O(n)
 * SC: O(n)
 */

import java.util.HashMap;

public class first_repeating_element {
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        int min=Integer.MAX_VALUE;
        boolean flag=false;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i+1);
            }
            else{
                flag=true;
                int index=map.get(arr[i]);
                if(index<min){
                    min=index;
                }
            }
        }
        if(flag==false){
            return -1;
        }
        else{
            return min;
        }
    }
    
}
