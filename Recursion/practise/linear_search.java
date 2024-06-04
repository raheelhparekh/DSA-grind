package Recursion.practise;

import java.util.ArrayList;

public class linear_search {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5,6};
        System.out.println("Index : "+linear2(arr,4,0,list));
    }

    
    public static int linear(int arr[],int target,int index){
        
        if(index==arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }

        return linear(arr, target, index+1);
    }
    
    // returning array list of intgers of index where the element is present
    static ArrayList<Integer> list=new ArrayList<>();

    public static ArrayList<Integer> linear2(int arr[],int target,int index, ArrayList<Integer> list){
        
        if(index==arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }

        return linear2(arr, target, index+1,list);
    }


}
