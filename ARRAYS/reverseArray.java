package ARRAYS;

public class reverseArray {

    public static void revArray(int numbers[]){
        int first=0, last=numbers.length-1;
        while(first < last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
        
            first ++;
            last --;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,5,6,8,7,9};
        revArray(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print( numbers[i] );
        }
    }
}
