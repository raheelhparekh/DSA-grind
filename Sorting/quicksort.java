package Sorting;
/*
    TC: O(NLOGN)
    SC: O(1)
 */

public class quicksort {
    public static void main(String[] args) {
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        quickSort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;

        while(true){
            // Find leftmost element greater than or equal to pivot
            do {
                i++;
            } while(arr[i] < pivot);

            // Find rightmost element less than or equal to pivot
            do {
                j--;
            } while(arr[j] > pivot);

            // If two pointers met
            if(i >= j){
                return j;
            }

            swap(arr, i, j);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}