package Recursion.practise;

public class rotated_binary_search {
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,1,2,3};
        System.out.println(rotated(arr,0,arr.length-1,13));
    }
    
    public static int rotated(int arr[],int low,int high,int target){
        int mid=low+(high-low)/2;

        if(low>high){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }

        if(arr[low]<=arr[mid]){
            if(target>=arr[low] & target<=arr[mid]){
                return rotated(arr, low, mid-1, target);
            }
            else{
                return rotated(arr, mid+1, high, target);
            }
        }
        else{
            if(target>=arr[mid] && target<=arr[high]){
                return rotated(arr, mid+1, high, target);
            }
            else{
                return rotated(arr, low, mid-1, target);
            }
        }
        
    }
}
