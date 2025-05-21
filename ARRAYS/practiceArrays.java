package ARRAYS;

// import java.util.Arrays;
import java.util.Scanner;

public class practiceArrays {

    // FINDING DUPLICATES IN AN ARRAY .
    // public static void repetition(int numbers[]){
    //     boolean flag = false;
    //     Arrays.sort(numbers);
    //     for(int i=1;i<numbers.length;i++){
    //         if(numbers[i-1] == numbers[i]){
    //             flag = true;
    //             break;
    //         }
    //     }
    //     if(flag == true){
    //         System.out.println("Repetition Occurs");
    //     }
    //     else{
    //         System.out.println("Distinct elements");
    //     }
    // }

    public static void findkey(int numbers[] , int key){
        for(int i =0;i<numbers.length;i++){
            if(numbers[i] == key){
                System.out.println(key + " found at index: "+ i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int numbers [] ={4,5,6,7,0,1,2};
        System.out.println("Enter key to find: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        // repetition(numbers);
        findkey(numbers, key);
        sc.close();

    }
}
