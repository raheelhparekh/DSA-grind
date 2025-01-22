package Recursion;

public class count_subsequence_with_sum_k {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int n=arr.length;
        int count=f(0,0,arr,2,n);
        System.out.println(count);
    }

    public static int f(int index, int sum, int[] arr,int k, int n){

        if(index==n){
            if(sum==k){
                return 1; 
            }
            return 0;
        }
        
        // pick index
        
        sum+=arr[index];
        int left=f(index+1, sum, arr, k, n);
           


        // do not pick
        
        sum-=arr[index];
        int right=f(index+1, sum, arr, k, n);

        return left+right;
    }
}
