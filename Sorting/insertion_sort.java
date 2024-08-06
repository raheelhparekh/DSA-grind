package Sorting;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};
        insertionSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void insertionSort(int[] arr) {
        for(int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            while(i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
    }
}
