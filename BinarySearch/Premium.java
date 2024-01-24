package BinarySearch;

/*
 Leetcode Problem No 702 : Search in a Sorted Array of Unknown Size length
    Link: https://leetcode.com/problems/search-in-a-sorted-array-of-unknown-size/
    Idea: Binary Search
    Time Complexity: O(log(n))
    Space Complexity: O(1)
    Question: Suppose you are given a sorted array of unknown length and a number to search for, return the index of the number. Accessing an element out of bounds throws exception. If the number occurs multiple times, return the index of any occurrence. If it isn’t present, return -1. 

 */
/* 
class Solution {

    public int search(ArrayReader reader, int target) {
        int low = 0;
        int high = 1;

        while (reader.get(high) < target) {

            low = high;

            high = 2 * high;

        }

        return binarySearch(reader, target, low, high);

    }

    private int binarySearch(ArrayReader reader, int target, int low, int high) {

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (reader.get(mid) == target) {

                return mid;

            } else if (reader.get(mid) > target) {

                high = mid - 1;

            } else {

                low = mid + 1;

            }

        }

        return -1;

    }

}
*/