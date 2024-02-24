package Arrays;
/*
 * GeekForGeeks: Alternate positive and negative numbers
 * Link: https://practice.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1
 * Input: 
        N = 9
        Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
        Output:
        9 -2 4 -1 5 -5 0 -3 2
        Explanation : Positive elements : 9,4,5,0,2
        Negative elements : -2,-1,-5,-3
        As we need to maintain the relative order of
        postive elements and negative elements we will pick
        each element from the positive and negative and will
        store them. If any of the positive and negative numbers
        are completed. we will continue with the remaining signed
        elements.The output is 9,-2,4,-1,5,-5,0,-3,2.
    
    TC: O(n)
    SC: O(n)
    Solved by me --> Yes but reffered to GFG for the last part of solution for the if condition
 */

import java.util.ArrayList;

public class alternate_positive_negative {
     void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> positiveList=new ArrayList<>();
        ArrayList<Integer> negativeList=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                positiveList.add(arr[i]);
            }
            else{
                negativeList.add(arr[i]);
            }
        }
        int arr_index=0;
        int positiveList_index=0;
        int negativeList_index=0;
        
        
        for(int i=0;i<n;i++){
            if(i<positiveList.size()){
                arr[arr_index++]=positiveList.get(positiveList_index++);
            }
            if(i<negativeList.size()){
                arr[arr_index++]=negativeList.get(negativeList_index++);
            }
           
        }
        
    }
    
    
}
