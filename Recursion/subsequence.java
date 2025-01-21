package Recursion;

import java.util.ArrayList;

public class subsequence{
    public static void main(String[] args) {
        int arr[]={3,1,2};
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        f(0,ans,n,arr);
    }

    public static void f(int i,ArrayList<Integer> ans,int n,int []arr){
        if(i>=n){
            System.out.println(ans);
            return;
        }

        // take
        ans.add(arr[i]);
        f(i+1,ans,n,arr);

        // dont take
        ans.remove(ans.size()-1);
        f(i+1,ans,n,arr);
    }
}

// TC: O(2^N)
// SC: O(N)