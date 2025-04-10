import java.util.ArrayList;
/*
Given an array ‘arr of integer numbers, ‘ar[i]’ represents the number of pages in the ‘i-th’ book. There are a ‘m’ number of students, and the task is to allocate all the books to the students.
Allocate books in such a way that:

Each student gets at least one book.
Each book should be allocated to only one student.
Book allocation should be in a contiguous manner.
You have to allocate the book to ‘m’ students such that the maximum number of pages assigned to a student is minimum. If the allocation of books is not possible. return -1

EXAMPLE:
Input Format: n = 5, m = 4, arr[] = {25, 46, 28, 49, 24}
Result: 71
Explanation: The allocation of books will be 25, 46 | 28 | 49 | 24.

We can allocate books in several ways but it is clearly said in the question that we have to allocate the books in such a way that the maximum number of pages received by a student should be minimum.


Assume the given array is {25 46 28 49 24} and number of students, M = 4. Now, we can allocate these books in different ways. Some of them are the following:


25 | 46 | 28 | 49, 24  → Maximum no. of pages a student receive = 73
25 | 46 | 28, 49 | 24  → Maximum no. of pages a student receive = 77
25 | 46, 28 | 49 | 24  → Maximum no. of pages a student receive = 74
25, 46 | 28 | 49 | 24  → Maximum no. of pages a student receive = 71

From the above allocations, we can clearly observe that the minimum possible maximum number of pages is 71.
Binary Search On Answers- Pattern Min of Max / Max of Min Type

*/

public class book_allocations {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        int max=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<arr.size();i++){
            max=Math.max(max,arr.get(i));
            sum+=arr.get(i);
        }

        int low=max;
        int high=sum;

        if(m>n){
            return -1;
        }

        while(low<=high){
            int mid=low+(high-low)/2;
            int total_count=no_of_students(arr,mid);

            if(total_count>m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }

    public static int no_of_students(ArrayList<Integer> arr, int mid){

        int pageTotal=arr.get(0);
        int student=1;

        for(int i=1;i<arr.size();i++){
            if(pageTotal+arr.get(i)<=mid){
                pageTotal+=arr.get(i);
            }
            else{
                student++;
                pageTotal=arr.get(i);

            }
        }
        return student;
    }
}
