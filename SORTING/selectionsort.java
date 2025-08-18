package SORTING;

public class selectionsort {
    public static void selectionSort(int numbers[]){
        for(int i=0;i<numbers.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[minPos]>numbers[j]){
                    minPos =j;
                }
            }
            int temp =numbers[minPos];
            numbers[minPos] = numbers[i];
            numbers[i] = temp;
        }
        printSorted(numbers);
    }

    public static void printSorted(int numbers[]){
        for(int i =0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int numbers[] = {1,5,6,8,7,2};
        selectionSort(numbers);
    }
    
}
