package RECURSION;

public class isarrsorted{
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6};
        System.out.println(issort(array, 0));
    }
    public static boolean issort(int []arr,int si){
        if(si == arr.length-1){
            return true;
        }
        if(arr[si] > arr[si+1]){
            return false;
        }else{
            return issort(arr, si+1);
            // boolean ans = issort(arr, si+1);
            // return ans;   
        }
    }
}