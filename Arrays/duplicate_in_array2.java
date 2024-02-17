package Arrays;
/*
 * Geeks: Find duplicates in an array
 * Link: https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1
 * 
 * 
 * Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array.
 *  Complete the function duplicates() which takes array a[] and n as input as parameters and returns a list of elements that occur more than once in the given array in a sorted manner. 

    Expected Time Complexity: O(n).
    Expected Auxiliary Space: O(n)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class duplicate_in_array2 {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                
            }
            else{
                int val=map.get(arr[i]);
                map.put(arr[i],val+1 );
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if(value>=2){
                list.add(key);
                value=0;
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        else{
            Collections.sort(list);
        }
        
        return list;
    }
    
}
