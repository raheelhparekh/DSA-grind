package Recursion.practise;

public class count_number_of_zeroes {
    int count = 0;

    public static void main(String args[]) {

        System.out.println(count_zeroes(52003, 0));

    }

    public static int count_zeroes(int n, int count) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return count_zeroes(n / 10, count + 1);
        } else {
            return count_zeroes(n / 10, count);

        }
    }
}
