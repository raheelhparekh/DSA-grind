package Recursion;
// Binary search with recursion in java basic understanding concept of recursion 

public class binary_search_with_recursion {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=5;
        int low=0;
        int high=arr.length-1;
        int result=binarySearch(arr,low,high,target);
        System.out.println("Found at index "+ result);
    } 
    private static int binarySearch(int[]arr,int low,int high,int target){
        int mid=low+(high-low)/2;

        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            binarySearch(arr, low,mid-1, target);

        }
        else{
            binarySearch(arr, mid+1, high, target);
        }
        return -1;
    }
}
