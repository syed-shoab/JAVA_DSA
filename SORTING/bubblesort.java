package SORTING;

public class bubblesort {
    
    public static void  bsort(int numbers[]){
        for(int turn=0;turn<numbers.length-1;turn++){
            boolean swapped=false;
            for(int j=0;j<numbers.length-1-turn;j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
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
        int numbers[] = {1,2,3,4,5,1,86,5,7,2,3,1};
        bsort(numbers);
        
    }

}
