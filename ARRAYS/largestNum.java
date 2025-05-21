package ARRAYS;

public class largestNum{
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        // int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i<numbers.length ; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        //     // if(smallest > numbers[i]){
        //     //     smallest = numbers[i];
        //     // }  
        }
        return largest;
        // return smallest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,5,4,16,9,8};
        int largest = getLargest(numbers);
        System.out.println("Largest Number in Array is : " + largest);
        // int smallest = getLargest(numbers);
        // System.out.println("Smallest Number in Array is : " + smallest);
        
    }
}