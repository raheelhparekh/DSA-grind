package Recursion.practise;

public class pattern {
    /*
        #####
     *  ####
     *  ###
     *  ##
     *  #
     */
    public static void main(String[] args) {
        print2(5,0);
    }
    public static void print(int n){

        if(n==0){
            return;
        }
        for(int i=0;i<n;i++){
            System.out.print("#");
        }
        System.out.println();
        print(n-1);

    }
    // same patern but now with rows and columns
    public static void print2(int row,int column){

        if(row==0){
            return;
        }
        if(row>column){
            System.out.print("#");
            print2(row, column+1);
        }
        else{
            System.out.println();
            print2(row-1, 0);
        }
           
    
    }
}
