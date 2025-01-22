package Recursion;

import java.util.ArrayList;

public class first_subsequence_with_sum_k {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        f(0,ans,0,arr,2,n);
        
    }

    public static boolean f(int index, ArrayList<Integer> ans, int sum, int[] arr,int k, int n){

        if(index==n){
            if(sum==k){
                System.out.println(ans);
                return true; 
            }
            return false;
        }
        
        // pick index
        ans.add(arr[index]);
        sum+=arr[index];
        if(f(index+1, ans, sum, arr, k, n)==true){
            return true;
        };


        // do not pick
        ans.remove(ans.size()-1);
        sum-=arr[index];
        if(f(index+1, ans, sum, arr, k, n)==true){
            return true;
        };

        return false;
    }
    
}

// Technique to print only one answer.
// return only {1,1} as its the first subseqence we found.
// as soon as we get a sum==k we have put a check on the function , that if it returns true, just return true