package RECURSION;

public  class basics{
    public static void main(String[] args) {
        int n =5;
        // printto5(n);
        System.out.println(fibb(n));
    }

    // public static void printto5(int n){
    //     if(n==0){
    //         return;
    //     }
    //     // System.out.println(n);
    //     // printto5(n-1);
    //     // System.out.println(n);

    //     if(n%2!=0){
    //         System.out.println(n);
    //     } 
    //     printto5(n-1);
    //     if(n%2==0){
    //         System.out.println(n);
    //     }
    // }
    
    // public static int factorial(int n){
    //     if(n==0 || n==1){
    //         return 1;
    //     }
    //     return n*factorial(n-1);
    // }

    public static int fibb(int n){
        if(n == 1 || n==0){
            return n;
        }
        
        return fibb(n-1)+fibb(n-2);
    }
}