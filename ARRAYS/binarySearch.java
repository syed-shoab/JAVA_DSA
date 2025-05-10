package ARRAYS;

public class binarySearch {

    public static int binSearch(int numbers[] , int key) {
        int start = 0 , end = numbers.length-1;

        while (start <= end) {
            int mid = (start + end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            else if (numbers[mid] < key){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 8;

        int index = binSearch(numbers, key);
        System.out.println("Index for key using binary Search is : " + index);
    }
}
