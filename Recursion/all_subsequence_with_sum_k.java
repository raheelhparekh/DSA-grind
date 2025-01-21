package Recursion;

import java.util.ArrayList;

public class all_subsequence_with_sum_k {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        f(0,ans,0,arr,2,n);
        
    }

    public static void f(int index, ArrayList<Integer> ans, int sum, int[] arr,int k, int n){

        if(index==n){
            if(sum==k){
                System.out.println(ans);   
            }
            return;
        }
        
        // pick index
        ans.add(arr[index]);
        sum+=arr[index];
        f(index+1, ans, sum, arr, k, n);


        // do not pick
        ans.remove(ans.size()-1);
        sum-=arr[index];
        f(index+1, ans, sum, arr, k, n);
    }
}

// TC= O(2^n)
