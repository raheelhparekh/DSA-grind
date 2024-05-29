package Recursion.practise;

public class factorial {

    public static void main(String args[]){
        System.out.println(fac(5));
    }

    public static int fac(int n){

        if(n==1){
            return 1;
        }
        return n * fac(n-1);    
    }
    
}
// how calls will we made 
// fac(5)=5*fac(4) fac(5) is waiting for fac(4) and so on 
// fac(4)=4*fac(3)
// fac(3)=3*fac(2)
// fac(2)=2*fac(1)
// fac(1)=1 and then the values are returned up
