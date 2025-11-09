package RECURSION;
public class bubblesort{
    public static void main(String[] args) {
        int si=0;
        int arr[]={50,40,30,20,10};
        int li=arr.length-1;
        bubble(arr,si,li);
        for(int val:arr){
            System.out.println(val);
        }
    }
    public static void bubble(int arr[],int si,int li){
        if(li == 0){
            return;
        }
        if(si == li){
            bubble(arr, 0, li-1);
            return;
        }
        if(arr[si] > arr[si+1]){
            int temp = arr[si];
            arr[si] = arr[si+1];
            arr[si+1] = temp;
        }
        bubble(arr, si+1, li);
    }
}