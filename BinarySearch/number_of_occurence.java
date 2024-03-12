package BinarySearch;
/*
 *  Geeks: Number of occurrence
 *  Link: https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1
 *  TC : 0(logN)- binary search approach . split into two for first and last occurrence
 *  SC : 0(1)
 *  NOTE: Didnt get in 1 go. Referred to solution. Very important to understand the first and last occurrence of the element.
 *  Tricky Question
 */

public class number_of_occurence {
class Solution {
    public int count(int[] arr, int n, int x) {
        int first = firstOccurrence(arr, x);
        int last = lastOccurrence(arr, x);
        if(first==-1 && last==-1){ //important test case
            return 0;
        }
        int count = last - first + 1;
        return count;
    }

    public int firstOccurrence(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        int first = -1; // Initialize since if element not there we return -1
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if (x > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    public int lastOccurrence(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        int last = -1; 
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                last = mid;
                low = mid + 1;
            } else if (x > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }
}

    
}
