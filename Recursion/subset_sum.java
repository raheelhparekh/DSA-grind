package Recursion;
/*
 * arr[]={3,1,4} output:{3,1,4,4,7,5,8}
 * TC: O(2^n)
 * SC: O(2^n)
 */

import java.util.ArrayList;

public class subset_sum {

    public static void main(String[] args) {
        int arr[]={3,1,4};
        ArrayList<Integer> ans=new ArrayList<>();
        subset(0,0,arr,arr.length,ans);
        System.out.println(ans);
        
    }

    public static void subset(int index,int sum,int arr[],int n, ArrayList<Integer> ans){

        if(index==n){
            ans.add(sum);
            return;
        }

        //pick the element
        subset(index+1,sum+arr[index],arr,n,ans);

        // do not pick the element
        subset(index+1,sum,arr,n,ans);
    }  
}
