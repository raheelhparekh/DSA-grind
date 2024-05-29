package Recursion.practise;

public class reverse_number {
    static int sum=0;
    static int rem=0;
    public static void main(String args[]){
        
        reverse(523);
        System.out.println(sum);
    }
    public static void reverse(int n){

        if(n==0){
            return;
        }
        rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);

    }
}

