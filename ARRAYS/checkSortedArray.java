package ARRAYS;

public class checkSortedArray{
    public static void check(int array[]){
        boolean flag = true;
        for(int i=1;i<array.length;i++){
            if (array[i-1] > array[i]){
                flag=false;
                break;
            }  
        }
        if(flag==true){
            System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }
    }
    public static void main(String[] args) {
        int array[] ={1,2,3,4,5};
        check(array);
    }
}