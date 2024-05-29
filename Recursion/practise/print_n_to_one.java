package Recursion.practise;

public class print_n_to_one {
    public static void main(String args[]){
        print(5);
    }

    // printing n to one
    public static void print(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        print(n-1);
    }

    
    // printing 1 to n
    // public static void print(int n){
    //     if(n==1){
    //         System.out.println(1);
    //         return;
    //     }
        
    //     print(n-1);
    //     System.out.println(n);
    // }
}
