package Recursion;
/*
 *   0 1 1 2 3 5 8 13 21 34 55 89 144
 *   
 */

public class fibonacci{
    //Case 1: We will generate this series using for loop
    public static void fib(int n){
        int a=0;
        int b=1;
        int c;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }

    //Case 2 : Generating Series Using Recursion
    public static int fib2(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib2(n-1)+fib2(n-2);
    }

    //Case 3 : Using Recursion GENERATE TILL N
    public static void fib3(int n,int a,int b){
        if(n==0){
            return;
        }
        System.out.print(a+" ");
        fib3(n-1,b,a+b);
    }



}
